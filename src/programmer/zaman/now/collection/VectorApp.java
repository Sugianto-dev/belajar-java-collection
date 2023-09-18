package programmer.zaman.now.collection;

import java.util.List;
import java.util.Vector;

// MATERI LEGACY COLLECTION
public class VectorApp {
    public static void main(String[] args) {

        /*
        * Notes!
        * > Bedanya dengan ArrayList adalah Vector menggunakan syncronized di setiap class nya jadi lebih thread safe
        * > Tapi lebih lambat
        * */

        List<String> list = new Vector<>();

        list.add("Eko");
        list.add("Kurniawan");
        list.add("Khannedy");

        for (var value : list) {
            System.out.println(value);
        }

    }
}
