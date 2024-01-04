public class day88 {
    public static void main(String[] args) {
        String kata1="Hello";
        String kata2="world";
        
        String hasil=gabung(kata1,kata2);
        System.out.println(hasil);
    }
    public static String gabung(String kata1,String kata2){
        String hasilGabung=kata1+" "+kata2;
        return hasilGabung;
    }
}
