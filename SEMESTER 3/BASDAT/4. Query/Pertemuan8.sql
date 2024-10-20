USE TSQL;

--- 

GO
CREATE VIEW Sales.CustGroups
AS
SELECT custid, CHOOSE(custid % 3 +1, N'A' , N'B' , N'C')AS custgroup, country
FROM Sales.Customers;

---soal 1
SELECT 
custid, custgroup,country
FROM 
Sales.CustGroups;

---soal 2
SELECT country, [A], [B], [C]
FROM(
SELECT 
custid, custgroup,country
FROM 
Sales.CustGroups)
AS SourceTable

PIVOT 
(
COUNT(custid)
FOR custgroup IN ([A], [B], [C])
) AS PivotTable;

---
GO
ALTER VIEW Sales.CustGroups AS 
SELECT 
custid,
CHOOSE(custid % 3 + 1, N'A' , N'B' , N'C')AS custgroup,
country,
city,
contactname
FROM Sales.Customers;

---SOAL 3

SELECT country, [A], [B], [C]
FROM(
SELECT 
custid, custgroup,country
FROM 
Sales.CustGroups)
AS SourceTable

PIVOT 
(
COUNT(custid)
FOR custgroup IN ([A], [B], [C])
) AS PivotTable;

---Jawab : sama persis


---soal 4
SELECT country,city,contactname, [A], [B], [C]
FROM(
SELECT 
custid, custgroup,country, city, contactname
FROM 
Sales.CustGroups)
AS SourceTable

PIVOT 
(
COUNT(custid)
FOR custgroup IN ([A], [B], [C])
) AS PivotTable;


--- soal 5
WITH  PivotInput AS(
	SELECT custid, custgroup, country, city, contactname
	FROM Sales.CustGroups
)
SELECT *
FROM PivotInput
PIVOT (COUNT(custid)
FOR custgroup IN (A,B,C)) AS PivotOutput;


---Soal 8
WITH SalesByCategory AS(
	SELECT o.custid,
	d.qty * d.unitprice as salesvalue,c.categoryname
	FROM Sales.Orders o 
	INNER JOIN Sales.OrderDetails d on o.orderid = d.orderid
	INNER JOIN Production.Products p on p.productid = d.productid
	INNER JOIN Production.Categories c on c.categoryid = p.categoryid
	WHERE YEAR(o.orderdate) = 2008
)SELECT * FROM SalesByCategory
PIVOT(SUM(salesvalue)
FOR categoryname IN ([Beverages], [Condiments], [Dairy Products],
[Grain/Cereals], [Meat/Poultry], [Produce], [Seafood])
)AS PivotOutput;


---
CREATE VIEW Sales.PivotCustGroups AS
WITH PivotCustGroups AS
(
SELECT custid,
country,
custgroup
FROM Sales.CustGroups
)
SELECT 
country,
p.A,
p.B,
p.C
FROM PivotCustGroups
PIVOT (COUNT(custid) FOR custgroup IN (A,B,C)) AS p;

---soal 9
SELECT 
country, A, B, C
FROM Sales.PivotCustGroups;



---soal 10
SELECT 
	country, 
	custgroup,
	numberofcustomers
FROM
	Sales.PivotCustGroups
UNPIVOT (
numberofcustomers FOR custgroup IN (A,B,C))
AS unpvt;


---soal 11	
SELECT 
country, city, 
COUNT(custid) as noofcustemers
FROM Sales.Customers
GROUP BY 
GROUPING SETS(
(country, city),
(country),
(city),
()
)


---select 12
SELECT
YEAR(orderdate) orderyear,
MONTH(orderdate) ordermonth,
DAY(orderdate) orderday,
SUM(val) salesvalue
FROM Sales. OrderValues
GROUP BY CUBE (YEAR (orderdate), MONTH (orderdate), DAY(orderdate));


---select 13
SELECT
YEAR (orderdate) orderyear,
MONTH(orderdate) ordermonth,
DAY(orderdate) orderday,
SUM(val) salesvalue
FROM Sales.OrderValues
GROUP BY ROLLUP (YEAR (orderdate), MONTH(orderdate), DAY(orderdate));


---soal 15
SELECT
GROUPING_ID(YEAR (orderdate), MONTH(orderdate)) groupid, YEAR (orderdate) orderyear,
MONTH(orderdate) ordermonth,
SUM(val) salesvalue
FROM Sales. OrderValues
GROUP BY
GROUPING SETS( (YEAR(orderdate), MONTH(orderdate)), (YEAR(orderdate)),
()
)
ORDER BY groupid, orderyear, ordermonth;