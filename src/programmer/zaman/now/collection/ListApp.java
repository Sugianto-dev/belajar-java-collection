package programmer.zaman.now.collection;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

// MATERI LIST
public class ListApp {
    public static void main(String[] args) {

        List<String> strings = new ArrayList<>();
//        List<String> strings = new ArrayList<>(100); // Untuk merubah default kapasitas array nya dari 10 menjadi 100, jadi add di 100 data pertama menjadi lebih cepat
//        List<String> strings = new LinkedList<>(); // Bisa juga pakai LinkedList

        // Menambah Data
        strings.add("Eko");
        strings.add("Kurniawan");

        // Mengubah Data
        strings.set(0, "Budi");

        // Menghapus Data
        strings.remove(1);

        // Remove method bawaan Collection dengan parameter object nya
//        strings.remove(object);
        /*
        * Notes!
        * > Apapun yang kita buat di Collection bisa dipakai di List juga
        * */

        // Mengambil Data
        System.out.println(strings.get(0));

        // Menampilkan Data dengan foreach
        for (var value : strings) {
            System.out.println(value);
        }

    }
}
