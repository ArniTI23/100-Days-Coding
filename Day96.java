import java.util.Arrays;
public class day96 { 
    public static void main(String[] args) {
        String[] namaHewan = {"Singa", "Gajah", "Jerapah", "Harimau", "Kucing", "Anjing", "Kuda", "Kanguru", "Koala", "Panda"};

        namaHewan = removeElement(namaHewan, 3);

        namaHewan = addElement(namaHewan, "Burung Hantu");

        // Tampilkan nama hewan di index 8
        System.out.println("nama hewan  index 3      : "+namaHewan[3]);
        System.out.println("nama hewan yang ditambah : "+namaHewan[9]);
        System.out.println("Nama hewan di index 8    : " + namaHewan[8]);
        System.out.println("semua nama hewan         : "+Arrays.toString(namaHewan));
 
    }
    private static String[] removeElement(String[] array, int index) {
        String[] newArray = new String[array.length - 1];
        System.arraycopy(array, 0, newArray, 0, index);
        System.arraycopy(array, index + 1, newArray, index, array.length - index - 1);
        return newArray;
    }
    private static String[] addElement(String[] array, String element) {
        String[] newArray = Arrays.copyOf(array, array.length + 1);
        newArray[array.length] = element;
        return newArray;
    }
}
