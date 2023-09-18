package programmer.zaman.now.collection;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

// MATERI IMMUTABLE SET
public class ImmutableSetApp {
    public static void main(String[] args) {

        Set<String> empty = Collections.emptySet(); // Contoh 1
        Set<String> one = Collections.singleton("Eko"); // Contoh 2

        // Contoh 3
        Set<String> mutable = new HashSet<>();
        mutable.add("Eko");
        mutable.add("Kurniawan");
        Set<String> immutable = Collections.unmodifiableSet(mutable);

        Set<String> set = Set.of("Eko", "Kurniawan"); // Contoh 4

//        set.add("Eko"); // ERROR
//        set.remove("Eko"); // ERROR

    }
}
