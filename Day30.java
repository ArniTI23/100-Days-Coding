import java.util.Scanner;
public class ISC {
    public static void main(String[] args){
        Scanner pesanki = new Scanner(System.in);
        String menu = null;
        int pilihan, harga= 0, porsi=0;
        System.out.println("*daftar menu*");
        System.out.println("1.nasi goreng \n2.kuah tahu \n3.Bakso beranak");
        System.out.println("4.ayam krispiy \n5.lalapan ");
        System.out.print("\nPesanan \t: ");        
        pilihan = pesanki.nextInt();
        
        if(pilihan == 1){
            menu = "nasi goreng"; 
            harga = 13000;
       }else if(pilihan == 2){
            menu = "kuah tahu";
            harga = 7000;
       }else if(pilihan == 3){
            menu = "Bakso beranak";
            harga = 21000;
       }else if(pilihan == 4){
            menu = "ayam krispiy"; 
            harga = 13000;
       }else if(pilihan == 5){
            menu = "lalapan";
            harga = 20000;
       }
 
        if(menu == null){
            System.err.println("iyek mau ki pesan apa ? jangan sembarang na itu ji menu yang sedia liat pake mata nah jangki rese karana lagi pms ka ^~^");
        }else{
        System.out.print("berapa porsi ? \t: ");
        porsi = pesanki.nextInt();
        System.out.println("_____________________________");
        System.out.println("baik jadi " + pilihan +" di pesan");
        System.out.println(menu +   " perporsi nya itu " + harga +"k");
        harga = harga * porsi;
        System.out.println(porsi  + " di pesan jadi Total harga Rp " + harga );
            System.out.println("_____________________________");
            System.out.println("baik silahkan duduk pak");
}
    }
}
