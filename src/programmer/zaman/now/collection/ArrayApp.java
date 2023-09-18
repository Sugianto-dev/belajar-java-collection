package programmer.zaman.now.collection;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;

// MATERI KONVERSI KE ARRAY
public class ArrayApp {
    public static void main(String[] args) {

        List<String> names = List.of("Eko", "Kurniawan", "Khannedy");

        // Cara Konversi ke Array
        Object[] objects = names.toArray(); // Object ke Array
        String[] strings = names.toArray(new String[]{}); // String ke Array

        System.out.println(Arrays.toString(objects));
        System.out.println(Arrays.toString(strings));

    }
}
