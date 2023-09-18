package programmer.zaman.now.collection;

import java.util.HashMap;
import java.util.Map;

// MATERI MAP
public class HashMapApp {
    public static void main(String[] args) {

        Map<String, String> map = new HashMap<>();
        map.put("name.first", "Eko");
        map.put("name.middle", "Kurniawan");
        map.put("name.last", "Khannedy");

        /*
        * Notes!
        * > Jika put dengan key yang sama artinya update
        * */

        System.out.println(map.get("name.first"));
        System.out.println(map.get("name.middle"));
        System.out.println(map.get("name.last"));

    }
}
