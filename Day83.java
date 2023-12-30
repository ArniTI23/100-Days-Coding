import java.util.Scanner;
public class day83 {
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        System.out.print("Masukkan angka pertama :");
        int j=in.nextInt();
        System.out.print("Masukkan angka kedua :");
        int p=in.nextInt();
        int i=0;
        while(i<j){
            i++;
            if(i==p){
                break;
            }
            System.out.println("angka ke-"+i);
        }
    }
}
