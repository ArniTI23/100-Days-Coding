import java.util.Scanner; 
public class day45 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan sebuah angka: ");
        int angka = scanner.nextInt();
        angka *= 2;
        
        System.out.println("Hasil perkalian dengan 2: " + angka);
       // scanner.close();
    }


}
