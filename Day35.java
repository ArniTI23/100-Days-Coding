public class day35 {
    public static void main(String args[]) {

      char grade = 'A';

      switch(grade) {
         case 'A' :
            System.out.println("sangat baik");
            break;
         case 'B' :
            System.out.println("bagus sekali");
            break;
         case 'C' :
            System.out.println("lebih bagus");
            break;
         case 'D' :
            System.out.println("bagus");
         case 'F' :
            System.out.println("lebik baik coba lagi");
            break;
         default :
            System.out.println("Nilai tidak valid");
      }
      System.out.println("Your grade is " + grade);
   }
}
