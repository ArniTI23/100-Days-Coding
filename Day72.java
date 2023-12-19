import java.util.Scanner;
public class fujy {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        
    System.out.println("Masukkan bilangan :");
        int bilangan=in.nextInt();
        for(int i=1; i<=10; i++){
            int hasil=bilangan*i;
            System.out.println(bilangan+"×"+i+"="+hasil);
        }
    }
}
