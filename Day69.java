import java.util.Arrays;
public class day69 {
    public static void main(String[] args) {
        int[] nilai = {2,7,5,6,1,4,3};
        
        Arrays.sort(nilai);
        for(int i=0; i<nilai.length; i++){
        System.out.print(nilai[i]);
        }
    }
}
