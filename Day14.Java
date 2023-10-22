import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner inputUser = new Scanner(System.in);
        System.out.println("operator:");
        System.out.println("penjumlahah (+)");
        System.out.println("pengurangan (-)");
        System.out.println("perkalian (*)");
        System.out.println("pembagian (/)");
        float a,b,hasil;
        char operator;
        
        
        System.out.println("masukan nilai a=");
        a=inputUser.nextFloat();
        System.out.println("masukan operator=");
        operator = inputUser.next().charAt(0);
        System.out.println("masukan nilai b=");
        b=inputUser.nextFloat();
        
        System.out.println("input:" + a +" "
        +operator +" "+ b);
        if (operator=='+'){
            hasil=a + b;
            System.out.println("hasil=" +hasil);
        } else if (operator=='-'){
            hasil=a - b;
        System.out.println("hasil=" +hasil);
        } else if (operator=='*'){
            hasil=a * b;
        System.out.println("hasil=" +hasil);
        } else if(operator=='/'){
        if(b==0){
                System.out.println("tak terhingga");
            } else{
                hasil=a / b;
        System.out.println("hasil=" +hasil);
            }
        } else{
            System.out.println("operator tidak ditemukan");
        
        }
    }
    
}
