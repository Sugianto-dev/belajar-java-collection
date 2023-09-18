package programmer.zaman.now.collection;

import java.util.Iterator;
import java.util.List;

// MATERI ITERABLE & ITERATOR
public class IterableApp {
    public static void main(String[] args) {

        // Cara Iterable dan auto Iterator
        /*
        * Notes!
        * > Kenapa Iterable bisa langsung menggunakan for-each ?
        * > Bukan magic, sebenarnya Iterable menggunakan implementasi Iterator
        * > Karena semua collection selain bagian Map adalah turunan Iterable
        * */
        Iterable<String> names = List.of("Eko", "Kurniawan", "Khannedy");

        for (var name : names) {
            System.out.println(name);
        }

        // Cara Manual dengan Iterator
        /*
        * Notes!
        * > Sebelum java 5, untuk melakukan Iterasi / Perulangan menggunakan Iterator manual
        * */
        System.out.println("ITERATOR");
        Iterator<String> iterator = names.iterator();

        while (iterator.hasNext()){
            String name = iterator.next();
            System.out.println(name);
        }

        /*
        * Kesimpulan!
        * > Semua collection yang bukan Map di java bisa dilakukan perulangan dengan menggunakan for-each
        * */

    }
}
