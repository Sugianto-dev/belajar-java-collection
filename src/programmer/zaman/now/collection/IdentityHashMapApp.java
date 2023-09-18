package programmer.zaman.now.collection;

import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.Map;

// MATERI MAP
public class IdentityHashMapApp {
    public static void main(String[] args) {

        Map<String, String> map = new IdentityHashMap<>();
//        Map<String, String> map = new HashMap<>(); // Coba dengan HashMap

        String key1 = "name.first";

        String name = "name";
        String dot = ".";
        String first = "first";

        String key2 = name + dot + first;

        System.out.println(key1.equals(key2));
        System.out.println(key1 == key2);

        map.put(key1, "Eko");
        map.put(key2, "Eko");

        System.out.println(map.size());
        /*
        * Notes!
        * > IdentityHashMap membandingkan dengan reference equality (==)
        * > HashMap membandingkan dengan equals()
        * */

    }
}
