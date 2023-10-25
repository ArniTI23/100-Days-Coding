import java.math.BigInteger;
public class Day17 {
    public static void main(String[] args) {
        
        BigInteger bigInt1 = new BigInteger("123456789012345678901234567890");
        BigInteger bigInt2 = new BigInteger("987654321098765432109876543210");
        
        BigInteger hasilPenjumlahan = bigInt1.add(bigInt2);
        
        BigInteger hasilPengurangan = bigInt1.subtract(bigInt2);
        
        BigInteger hasilPerkalian = bigInt1.multiply(bigInt2);
        
        System.out.println("Penjumlahan: " + hasilPenjumlahan);
        System.out.println("Pengurangan: " + hasilPengurangan);
        System.out.println("Perkalian: " + hasilPerkalian);
    }
}

