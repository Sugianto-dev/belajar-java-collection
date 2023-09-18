package programmer.zaman.now.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

// MATERI BINARY SEARCH
public class BinarySearchApp {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>(1000); // Ditambahkan langsung kapasitasnya 1000 supaya tidak melakukan penambahan setelah lebih dari 10
        for (int i = 1; i <= 1000 ; i++) {
            list.add(i);
        }

        int index = Collections.binarySearch(list, 333); // Tanpa Comparator
        System.out.println(index);

        Comparator<String> comparator = new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o2.compareTo(o1); // Melakukang pencarian dari belakang
            }
        };

        int index2 = Collections.binarySearch(list, 333); // Dengan Comparator
        System.out.println(index2);

    }
}
