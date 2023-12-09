public class day62 {
    public static void main(String[] args){
        int [][] data={
            {1,2,3,4},
            {5,6,7,8}
        };
            int i=0;
            do{
                int j=0;
                do{
                    System.out.print(data[i][j]+" ");
                    j++;
                }while(j<data[i].length);
                System.out.println();
                i++;
            
            }while(i<data.length);
        
                
        }
}
