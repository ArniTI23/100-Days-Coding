import java.math.BigDecimal;
public class Day15 {
    public static void main(String[] args) {
        BigDecimal sum; 
        
        String input1= "545456468445645468464645"; 
        String input2= "4256456484464684864864"; 
        
        BigDecimal a= new BigDecimal(input1);
        BigDecimal b= new BigDecimal(input2);
        
        sum = a.add(b);
        System.out.println("Jumlah dari\n"+ a + " \ndan\n" + b + " "+ "\nadalah\n" + sum + "\n");
    }
                   

                        
}
