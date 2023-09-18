package programmer.zaman.now.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

// MATERI COLLECTION
public class CollectionApp {
    public static void main(String[] args) {

        Collection<String> collection = new ArrayList<>();

        // Cara Menambah Data
        collection.add("Eko");
        collection.add("Kurniawan");
        collection.add("Khannedy");
        collection.addAll(List.of("Programmer", "Zaman", "Now"));

        // Cara Menampilkan Data
        for(var value : collection) {
            System.out.println(value);
        }

        // Cara Menghapus Data
        System.out.println("REMOVE");

        collection.remove("Eko");
        collection.remove("Budi"); // Jika menghapus data yang tidak ada, tidak ada pengaruh apapun (Hasilnya false karna return boolean)
        collection.removeAll(List.of("Zaman", "Now"));

        for(var value : collection) {
            System.out.println(value);
        }

        // Cara Mencari Data
        System.out.println(
                collection.contains("Kurniawan") // TRUE
        );

        System.out.println(
                collection.containsAll(List.of("Khannedy", "Programmer")) // TRUE
        );

        // Cara Menampilkan Jumlah Data
        System.out.println(collection.size());

        /*
        * Dan masih banyak method lainnya di Collection
        * > Lihat langsung Ctrl+Klik di Collection
        * */

    }
}
