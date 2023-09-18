package programmer.zaman.now.collection;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

// MATERI ENTRY MAP
public class EntryApp {
    public static void main(String[] args) {

        Map<String, String> map = new HashMap<>();

        map.put("Eko", "Eko Value");
        map.put("Budi", "Budi Value");
        map.put("Joko", "Joko Value");

        // Beberapa Method Map
        map.keySet(); // Untuk mengambil semua yang ada di key nya, berupa Set
        map.values(); // Untuk mengambil semua value nya, berupa Collection
        map.entrySet(); // Untuk mengambil keduanya, berupa Set dari Entry

        Set<Map.Entry<String, String>> entries = map.entrySet();

        for (var entry : entries) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }

    }
}
