import java.util.Scanner;
public class Day28 {
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        System.out.print("Masukkan nama anda     :");
        String nama = in.nextLine();
        
        System.out.print("Masukkan alamat        :");
        String alamat =in.nextLine();
        
        System.out.print("Masukkan umur          :");
        int umur=in.nextInt();
        
        System.out.print("Masukkan statuspelajar true/fals:");
        boolean statusPelajar=in.nextBoolean();
        
        System.out.println("===============================");
        System.out.println("DATA YANG ANDA MASUKKAN ADALAH");
        System.out.println("Nama           :"+nama);
        System.out.println("Alamat         :"+alamat);
        System.out.println("Umur           :"+umur);
        if(statusPelajar==true){
            System.out.println("Status Pelajar : Pelajar");
        }else{
            System.out.println("Status Pelajar : Bukan pelajar");
        }
        System.out.println("===============================");
    }
}
