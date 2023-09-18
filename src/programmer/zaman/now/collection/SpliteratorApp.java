package programmer.zaman.now.collection;

import java.util.List;
import java.util.Spliterator;
import java.util.function.Consumer;

// MATERI SPLITERATOR
public class SpliteratorApp {
    public static void main(String[] args) {

        // Input Data
        List<String> list = List.of("Eko", "Kurniawan", "Khannedy", "Programmer", "Zaman", "Now");
//        list.add("Budi"); // Error, Karena List immutable

        // Cara Penggunaan Spliterator
        Spliterator<String> spliterator1 = list.spliterator();
        Spliterator<String> spliterator2 = spliterator1.trySplit(); // Men-Split spliterator1
//        Spliterator<String> spliterator3 = spliterator2.trySplit(); // Men-Split spliterator2

        System.out.println(spliterator1.estimateSize());
        System.out.println(spliterator2.estimateSize());
//        System.out.println(spliterator3.estimateSize());

        // Iterasi 1 per 1
        spliterator1.forEachRemaining(new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        });

        spliterator2.forEachRemaining(new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        });

    }
}
