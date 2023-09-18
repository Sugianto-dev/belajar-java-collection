package programmer.zaman.now.collection;

import java.util.Collections;
import java.util.Comparator;
import java.util.SortedMap;
import java.util.TreeMap;

// MATERI SORTEDMAP
public class SortedMapApp {
    public static void main(String[] args) {

        // 2. Dengan Comparator
        Comparator<String> stringComparator = new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o2.compareTo(o1); // Untuk mengatur ASC atau DESC tinggal balik objek yang di compareTo nya saja
            }
        };
        /*
        * Notes!
        * > Tujuan dengan menggunakan Comparator sendiri adalah agar bisa diatur ASC atau DESC urutan data nya
        * */

        SortedMap<String, String> sortedMap = new TreeMap<>(stringComparator);
//        SortedMap<String, String> sortedMap = new TreeMap<>(); // 1. Contoh tanpa Comparator

        sortedMap.put("Eko", "Eko");
        sortedMap.put("Joko", "Joko");
        sortedMap.put("Budi", "Budi");

        for (var key : sortedMap.keySet()) {
            System.out.println(key); // Maka Hasilnya akan terurut
        }

        // Immutable SortedMap
        SortedMap<String, String> empty = Collections.emptySortedMap();
        SortedMap<String, String> immutable = Collections.unmodifiableSortedMap(sortedMap);

//        immutable.put("Nugraha", "Nugraha"); // ERROR

    }
}
