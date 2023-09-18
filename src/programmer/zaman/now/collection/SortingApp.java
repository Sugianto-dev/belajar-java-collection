package programmer.zaman.now.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortingApp {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        list.addAll(List.of("Eko", "Kurniawan", "Khannedy", "Programmer", "Zaman", "Now"));

        Collections.sort(list); // Untuk mengurutkan sesua Huruf pertama, Sorting dengan Comparable bawaan (ASC)

//        for (var value : list) {
//            System.out.println(value);
//        }

        Comparator<String> reverse = new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o2.compareTo(o1); // Reverse jadi DESC
            }
        };

        Collections.sort(list, reverse); // Sorting dengan Comparator

        for (var value : list) {
            System.out.println(value);
        }

    }
}
