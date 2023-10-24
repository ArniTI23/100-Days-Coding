import java.util.Scanner;
import java.util.Locale;
public class Day16 {
  public static void main(String args[]){
            
    Scanner input = new Scanner(System.in).useLocale(Locale.US);
       
    System.out.println("##  Program Java Menghitung Luas Persegi  ##");
    System.out.println("============================================");
    System.out.println();
      
    double sisi, luas;
  
    System.out.print("Input panjang sisi persegi: ");
    sisi = input.nextDouble();
   
    luas = sisi * sisi;
    luas = Math.round(luas*100)/100.0;
       
    System.out.println("Luas persegi: "+luas);
  
  }

}
