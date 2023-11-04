import java.util.Scanner;
public class DDP {
   public static void main(String[] args) {
       Scanner in=new Scanner(System.in);
       System.out.print("Masukkan angka : ");
       int angka=in.nextInt();
       
       
       angka %=2;
       
       if(angka==1){
           System.out.println("Angka ganjil");
       }else{
           System.out.println("Angka genap");
       }
       
   }
}
