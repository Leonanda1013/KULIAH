use TSQL;

GO
Alter PROCEDURE Sales.GetTopCustomers
AS
SELECT TOP(10) c.custid, c.contactname,
SUM(o.val) AS salesvalue
FROM Sales.OrderValues AS o
INNER JOIN Sales.Customers AS c
ON c.custid = o.custid
GROUP BY c.custid, c.contactname
ORDER BY salesvalue DESC;


--- soal 1
EXEC Sales.GetTopCustomers;


--- soal 2
--- SS

--- soal 3
GO
ALTER PROCEDURE Sales.GetTopCustomers
AS
SELECT c.custid, c.contactname,
SUM(o.val) AS salesvalue
FROM Sales.OrderValues AS o
INNER JOIN Sales.Customers AS c
ON c.custid = o.custid
GROUP BY c.custid, c.contactname
ORDER BY salesvalue DESC
OFFSET 0 ROWS FETCH NEXT 10 ROWS ONLY;

EXEC Sales.GetTopCustomers;

--- soal 5
--- kedua T-SQL tersebut berguna untuk mengambil 10 data teratas, namun pada T-SQL pertama menggunakan top(10) dan T-SQL kedua menggunakan OFFSET-FETCH

--- soal 6
GO
ALTER PROCEDURE Sales.GetTopCustomers
@orderyear int
AS
SELECT c.custid, c.contactname,
SUM(o.val) AS salesvalue
FROM Sales.OrderValues AS o
INNER JOIN Sales.Customers AS c
ON c.custid = o.custid
WHERE YEAR(o.orderdate) = @orderyear
GROUP BY c.custid, c.contactname
ORDER BY salesvalue DESC
OFFSET 0 ROWS FETCH NEXT 10 ROWS ONLY;

EXEC Sales.GetTopCustomers
2007;


--- soal 8
EXEC Sales.GetTopCustomers
2008;

--- saol 9
GO
EXEC Sales.GetTopCustomers;

--- soal 10
--- Msg 201, Level 16, State 4, Procedure Sales.GetTopCustomers, Line 0 [Batch Start Line 62]
--- Procedure or function 'GetTopCustomers' expects parameter '@orderyear', which was not supplied.
--- Eror tersebut dikarenakan tidak adanya parameter pada kode executenya


--- saol 11
GO
ALTER PROCEDURE Sales.GetTopCustomers
@orderyear int = NULL
AS
SELECT c.custid, c.contactname,
SUM(o.val) AS salesvalue
FROM Sales.OrderValues AS o
INNER JOIN Sales.Customers AS c
ON c.custid = o.custid
WHERE YEAR(o.orderdate) = @orderyear
OR @orderyear IS NULL
GROUP BY c.custid, c.contactname
ORDER BY salesvalue DESC
OFFSET 0 ROWS FETCH NEXT 10 ROWS ONLY; 

--- soal 11
EXEC Sales.GetTopCustomers;
--- Pada kode pertama, tidak terjadi error karena parameter @orderyear diberi nilai default NULL dengan sintaks @orderyear int = NULL. Hal ini memungkinkan stored procedure dijalankan tanpa harus menyertakan nilai untuk @orderyear. Jika @orderyear tidak diberikan nilai saat pemanggilan, maka secara otomatis akan bernilai NULL.

--- saol 12
--- Secara umum, jika perubahan pada stored procedure mengubah cara pemanggilan atau hasil yang dikembalikan, aplikasi mungkin perlu diperbarui. Namun, perubahan internal atau optimasi prosedur sering kali tidak mempengaruhi aplikas

--- saol 13
GO
ALTER PROCEDURE Sales.GetTopCustomers
@orderyear int = NULL,
@n int = 10
AS
SELECT c.custid, c.contactname,
SUM(o.val) AS salesvalue
FROM Sales.OrderValues AS o
INNER JOIN Sales.Customers AS c
ON c.custid = o.custid
WHERE YEAR(o.orderdate) = @orderyear
OR
@orderyear IS NULL
GROUP BY c.custid, c.contactname
ORDER BY salesvalue DESC
OFFSET 0 ROWS FETCH NEXT @n ROWS ONLY; 

EXEC Sales.GetTopCustomers;


--- Soal 14
EXEC Sales.GetTopCustomers @orderyear = NULL, @n = 20;



--- saol 16
GO
ALTER PROCEDURE Sales.GetTopCustomers
@customerpos int = 1,
@customername nvarchar(30) OUTPUT
AS
SET @customername = (
SELECT c.contactname
FROM Sales.OrderValues AS o
INNER JOIN Sales.Customers AS c
ON c.custid = o.custid
GROUP BY c.custid, c.contactname
ORDER BY SUM(o.val) DESC
OFFSET @customerpos - 1 ROWS FETCH NEXT 1 ROW ONLY
); DECLARE @outcustomername nvarchar(30);EXEC sys.sp_help;--- soal 17EXEC sys.sp_help 'Sales.Customers';
--- soal 18
EXEC sys.sp_helptext 'Sales.GetTopCustomers';


--- saol 19
EXEC sys.sp_columns @table_name = 'Customers', @table_owner = 'Sales';
