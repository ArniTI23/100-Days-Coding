public class day87 {
    public static double bagi(double a, double b) {
        if (b != 0) {
            return a / b;
        } else {
            System.out.println("Error: Pembagian oleh nol.");
            return 0; // Nilai default jika pembagian oleh nol terjadi.
        }
    }

    public static void main(String[] args) {
        double hasilBagi = bagi(8.0, 2.0);
        System.out.println("Hasil pembagian: " + hasilBagi);
    }
}
