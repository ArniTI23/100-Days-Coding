import java.util.Scanner;
public class day98 {
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        System.out.print("Masukkan nama anda :");
        String nama=in.nextLine();
        System.out.print("Masukkan nim       :");
        String nim=in.next();
        System.out.print("Hasil data         :");
        String hasil=nama.concat(" ").concat(nim);
        
        System.out.println(hasil);
    }
}
