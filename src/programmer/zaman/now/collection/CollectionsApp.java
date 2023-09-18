package programmer.zaman.now.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

// MATERI COLLECTIONS CLASS
public class CollectionsApp {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        list.addAll(List.of("Eko", "Kurniawan", "Khannedy", "Programmer", "Zaman", "Now"));

        System.out.println(list);

        Collections.reverse(list); // reverse() ini void, jadi mengubah existing list (Hati - hati)
        System.out.println(list);

        Collections.shuffle(list);
        System.out.println(list);

    }
}
