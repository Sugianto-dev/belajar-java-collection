package programmer.zaman.now.collection;

import java.util.Collections;
import java.util.NavigableSet;
import java.util.Set;
import java.util.TreeSet;

// MATERI NAVIGABLESET
public class NavigableSetApp {
    public static void main(String[] args) {

        NavigableSet<String> names = new TreeSet<>();
        names.addAll(Set.of("Eko", "Kurniawan", "Khannedy", "Programmer", "Zaman", "Now"));

        NavigableSet<String> namesReverse = names.descendingSet(); // Mengubah urutan Set jadi DESCENDING
//        NavigableSet<String> kurniawan = names.headSet("Kurniawan", true); // Mengurutkan dari data awal sampai Kurniawan (true = Termasuk Kurniawan, false = Tidak Termasuk Kurniawan)
        NavigableSet<String> kurniawan = names.tailSet("Kurniawan", true); // Mengurutkan sampai data akhir dari Kurniawan (true = Termasuk Kurniawan, false = Tidak Termasuk Kurniawan)

        for (var name : kurniawan) {
            System.out.println(name);
        }

        // Membuat Immutable NavigableSet
        NavigableSet<String> immutable = Collections.unmodifiableNavigableSet(names);
//        immutable.add("Ups"); // ERROR, Data Immutable tidak bisa diubah

    }
}
