package programmer.zaman.now.collection;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

// MATERI SET
public class SetApp {
    public static void main(String[] args) {

//        Set<String> names = new HashSet<>(); // Data yang dihasilkan tidak bisa duplikat, Dan tidak terurut
        Set<String> names = new LinkedHashSet<>(); // Data yang dihasilkan tidak bisa duplikat, Tapi Data terurut
        /*
        * Notes!
        * > Kalian butuh List ketika data yang ingin dimasukan bebas / bisa duplikat
        * > Kalian butuh Set ketika data yang ingin dimasukan adalah data unik / tidak bisa duplikat
        * */

        names.add("Eko");
        names.add("Kurniawan");
        names.add("Khannedy");
        names.add("Eko");
        names.add("Kurniawan");
        names.add("Khannedy");

        for (var name : names) {
            System.out.println(name);
        }

    }
}
