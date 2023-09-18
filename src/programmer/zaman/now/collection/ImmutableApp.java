package programmer.zaman.now.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

// MATERI IMMUTABLE LIST
public class ImmutableApp {
    public static void main(String[] args) {

        List<String> one = Collections.singletonList("Satu"); // Contoh 1
        List<String> empty = Collections.emptyList(); // Contoh 2

        // Contoh 3
        List<String> mutable = new ArrayList<>();
        mutable.add("Eko");
        mutable.add("Kurniawan");
        List<String> immutable = Collections.unmodifiableList(mutable);

        List<String> elements = List.of("Eko", "Kurniawan", "Khannedy"); // Contoh 4
//        elements.add("Budi"); // ERROR karena data elements adalah immutable List (List yang tidak bisa dirubah lagi isi datanya)

    }
}
