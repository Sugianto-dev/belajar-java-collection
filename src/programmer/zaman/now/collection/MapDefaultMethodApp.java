package programmer.zaman.now.collection;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiConsumer;

// MATERI DEFAULT METHOD
public class MapDefaultMethodApp {
    public static void main(String[] args) {

        Map<String, String> map = new HashMap<>();
        map.put("Eko", "Eko Value");
        map.put("Budi", "Budi Value");
        map.put("Joko", "Joko Value");

        // forEach(), Akan lebih simple jika dibuat dengan java lambda (hanya jadi 1 baris)
        map.forEach(new BiConsumer<String, String>() {
            @Override
            public void accept(String key, String value) {
                System.out.println(key + ":" + value); // Custom sendiri
            }
        });

    }
}
