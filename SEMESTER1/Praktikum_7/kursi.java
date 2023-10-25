
    import java.util.Scanner;
public class kursi {
    public static void main(String[] args){
        Scanner sc17 = new Scanner(System.in);

        String kursi; 
        int jmlPesan;
        int jmlTersisa = 2;
        int i = 1;

        for (i = 1; i <=10000  ; i++) {
            System.out.print("Kursi yang ingin dipesan : ");
            jmlPesan = sc17.nextInt();
            
            if(jmlTersisa < jmlPesan) {
                System.out.println("Kursi yang tersedia "+ jmlTersisa);
                
            }else{
                break;
            }
           
            }
                System.out.println("Pesanan anda tersdia") ;
        }
    }

