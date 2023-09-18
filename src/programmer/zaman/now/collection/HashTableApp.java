package programmer.zaman.now.collection;

import java.util.Hashtable;
import java.util.Map;

// MATERI LEGACY COLLECTION
public class HashTableApp {
    public static void main(String[] args) {

        /*
         * Notes!
         * > Bedanya dengan HashMap adalah HashTable menggunakan syncronized di setiap class nya jadi lebih thread safe
         * > Tapi lebih lambat
         * */

        Map<String, String> map = new Hashtable<>();

        map.put("Eko", "Eko");
        map.put("Budi", "Budi");
        map.put("Joko", "Joko");

        for (var key : map.keySet()) {
            System.out.println(key);
        }

    }
}
