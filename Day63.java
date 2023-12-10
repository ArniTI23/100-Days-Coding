public class day63 {
    public static void main(String[] args){
        int [][] data={
            {1,2,3,4},
            {5,6,7,8}
        };
        int jum=0;
        for(int i=0; i<data.length; i++){
            for(int j=0; j<data[i].length; j++){
                jum+=data[i][j];
            }
        }
        System.out.println(jum);
    }
}
