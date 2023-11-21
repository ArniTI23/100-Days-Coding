import java.util.Scanner;
public class mn {
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        String a,b;
        System.out.print("masukkan no ATM :");
         a=in.nextLine();
        
        if(a.equals("100303")){
            System.out.print("masukkan pasword :");
        }else{
            System.out.println("no yg anda masukkan salah");
          // break;
        }
        
        String x="transfer";
        String y="cek saldo";
        b=in.nextLine();
        if(b.equalsIgnoreCase("arni")){
             System.out.println("1."+x);
             System.out.println("2."+y);
        }else{
            System.out.println("paswor anda salah");
            
        }
        
        
    }
}
