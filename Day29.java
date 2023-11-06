import java.util.Scanner;
public class day29 {
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        System.out.print("Masukkan batas angka :");
        int batas=in.nextInt();
        for(int i=1; i<=batas; i++){
            System.out.println("Masukkan angka :");
            int angka=in.nextInt();
            if(angka%2==0 && angka!=0){
                System.out.println("Bilangan genap");
            }else if(angka%2!=0){
                System.out.println("Bilangan ganjil");
            }else{
                System.out.println("Tidak bernilai");
            }
        }
        System.out.println("perulangan sudah mencapai batas");
    }
}
