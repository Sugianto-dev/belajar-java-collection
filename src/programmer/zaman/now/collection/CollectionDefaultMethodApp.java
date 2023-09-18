package programmer.zaman.now.collection;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.UnaryOperator;

// MATERI DEFAULT METHOD
public class CollectionDefaultMethodApp {
    public static void main(String[] args) {

        // Input Data
        List<Integer> numbers = new ArrayList<>();
        for (int i = 1; i <= 100; i++) {
            numbers.add(i);
        }

        System.out.println(numbers);

        // replaceAll(), Mengubah semua data
        numbers.replaceAll(new UnaryOperator<Integer>() {
            @Override
            public Integer apply(Integer integer) {
//                return 2;
                return integer * 10; // Custom sendiri
            }
        });

        System.out.println(numbers);

        // forEach()
        /*
        * Notes!
        * > Terlihat lebih panjang dari for biasa, karena belum belajar java lambda
        * */
//        for (var number : numbers) { // for biasa
//            System.out.println(number);
//        }

        // forEach dengan java Lambda
//        numbers.forEach(integer -> System.out.println(integer));

        numbers.forEach(new Consumer<Integer>() { // forEach
            @Override
            public void accept(Integer integer) {
                System.out.println(integer); // Custom sendiri
            }
        });

        // removeIf()
        numbers.removeIf(new Predicate<Integer>() {
            @Override
            public boolean test(Integer integer) {
                return integer > 500; // Custom sendiri
            }
        });

        System.out.println(numbers);

    }
}
