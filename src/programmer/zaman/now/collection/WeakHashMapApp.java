package programmer.zaman.now.collection;

import java.util.HashMap;
import java.util.Map;
import java.util.WeakHashMap;

// MATERI MAP
public class WeakHashMapApp {
    public static void main(String[] args) {

        Map<Integer, Integer> map = new WeakHashMap<>();
//        Map<Integer, Integer> map = new HashMap<>(); // Coba dengan HashMap

        for (int i = 0; i < 1_000_000; i++) {
            map.put(i, i);
        }

        System.gc();
        /*
        * Notes!
        * > System.gc(); adalah gerbage Collection
        * > berfungsi untuk menghapus data yang paling lama dan tidak pernah terpakai
        * */

        System.out.println(map.size());
        /*
        * Notes!
        * > Size data akan berkurang setelah gerbage Collection jika menggunakan WeakHashMap
        * > Size data tidak akan berkurang jika menggunakan HashMap
        * */

    }
}
