public class day61 {
    public static void main(String[] args){
        int [][] data={
            {1,2,3,4},
            {5,6,7,8}
        };
        int i=0;
        while(i<data.length){
            int j=0;
            while (j<data[i].length){
                System.out.println(data[i][j] + " ");
                j++;
            }
            System.out.println();
            i++;
        }
    }
}
