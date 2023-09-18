package programmer.zaman.now.collection;

import java.util.Collections;
import java.util.NavigableMap;
import java.util.TreeMap;

// MATERI NAVIGABLEMAP
public class NavigableMapApp {
    public static void main(String[] args) {

        NavigableMap<String, String> map = new TreeMap<>();

        map.put("Eko", "Eko");
        map.put("Budi", "Budi");
        map.put("Joko", "Joko");

        for (var key : map.keySet()) {
            System.out.println(key); // Otomatis terurut karena turunan SortedMap
        }

        System.out.println(map.lowerKey("Eko")); // Kurang dari
        System.out.println(map.higherKey("Eko")); // Lebih dari
        System.out.println(map.floorKey("Nugraha")); // Kurang dari sama dengan
        System.out.println(map.ceilingKey("Nugraha")); // Lebih dari sama dengan

        // Membalikan urutan map
        NavigableMap<String, String> mapDesc = map.descendingMap();
        for (var key : mapDesc.keySet()) {
            System.out.println(key);
        }

        // Immutable NavigableMap
        NavigableMap<String, String> empty = Collections.emptyNavigableMap();
        NavigableMap<String, String> immutable = Collections.unmodifiableNavigableMap(mapDesc);

//        immutable.put("Eko", "Eko"); // ERROR

    }
}
