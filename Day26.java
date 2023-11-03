import java.util.Scanner;
public class day26 {
    public static void main(String[] args){
       Scanner in=new Scanner(System.in);
     int a,b,i;
        
        System.out.print("masukan nilai a=");
         a=in.nextInt();
        System.out.print("masukan nilai b=");
        b=in.nextInt();
        
        
       if (a < b){
         for(i=a; i<=b; i++){
         System.out.println(i);
            }
         }else{
             for(i=b; i<=a; i++){
             System.out.println(i);
            }
        
             
        }
    }
}
