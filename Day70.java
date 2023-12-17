import java.util.Scanner;
public class day70 {
    public static void main(String[] args){
        Scanner in= new Scanner(System.in);
        
        System.out.print("masukkan panjang array: ");
        int panjang=in.nextInt();
        int[] nomor=new int[panjang];
        
        System.out.println("masukkan nilai-nilai array: ");
        for(int i=0; i<panjang; i++){
            System.out.print("index ke-"+i+": ");
            nomor[i]=in.nextInt();
        }
        System.out.println("nilai-nilai array : ");
        for(int i=0; i<panjang; i++){
            System.out.println("index ke-"+i+": "+nomor[i]);
        }
    }
}
