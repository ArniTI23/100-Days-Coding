import java.util.Scanner;
public class Day5 {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        int gaji_pokok,lembur,lama_lembur,gaji_bersih;
        System.out.println("Masukkan gaji pokok Anda : ");
        
        gaji_pokok= input.nextInt();
        System.out.println("Gaji lembur/jam : ");
        lama_lembur= input.nextInt();
        lembur= 55000*lama_lembur;
        gaji_bersih= lembur+gaji_pokok;
        System.out.println("Gaji bersih anda : "+gaji_bersih);
        
    }
}
