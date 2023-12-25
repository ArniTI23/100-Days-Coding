public class day78 {
    public static boolean Genap(int bilangan) {
        return bilangan % 2 == 0;
    }
    public static void main(String[] args) {
        int angka = 6;
        boolean hgenap = Genap(angka);
        System.out.println(angka + " adalah bilangan genap? = " + hgenap);
    }
}
