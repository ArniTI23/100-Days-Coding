import java.util.Scanner;
public class daysoal {
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        System.out.println("Masukkan data diri anda");
        System.out.print("Nama              :");
        String nama=in.nextLine();
        System.out.print("Nim               :");
        String nim=in.nextLine();
        System.out.print("Tinggi badan      :");
        float tb=in.nextFloat();
        System.out.print("Ukuran baju       :");
        char ub=in.next().charAt(0);
        System.out.print("Status pernikahan false/true :");
        boolean status=in.nextBoolean();
        System.out.print("Agama             :");
        String agm=in.next();
        
        
        
        System.out.println("_________________________");
        System.out.println("Berikut data diri anda");
        System.out.println(
        "Nama              :"+nama+"\n"+
        "Nim               :"+nim+"\n"+
        "Tinggi badan      :"+tb+"\n"+
        "Ukuran baju       :"+ub+"\n"+
        "Status pernikahan :"+status+"\n"+
        "Agama             :"+agm);
        System.out.println("_________________________");
    }
}
