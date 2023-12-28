public class day81 {
    public static void main(String[] args){
        int i=0;
        while(i<10){
            i++;
            if(i==5 || i==6){
                continue;
            }
            System.out.println("angka ke-"+i);
        }
    }
}
