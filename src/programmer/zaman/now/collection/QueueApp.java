package programmer.zaman.now.collection;

import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

// MATERI QUEUE
public class QueueApp {
    public static void main(String[] args) {

        // ArrayDeque
//        Queue<String> queue = new ArrayDeque<>(10); // numElements nya boleh di definisikan atau tidak, karna jika data melebihi kapasitas, kapasitas akan otomatis di tambah
//        Queue<String> queue = new ArrayDeque<>();

        // PriorityQueue
//        Queue<String> queue = new PriorityQueue<>(); // Jika ingin data nya berurut pakai PriorityQueue

        // LinkedList
        Queue<String> queue = new LinkedList<>(); // Perbedaannya dengan ArrayDeque sama dengan perbedaannya dengan ArrayList di materi sebelumnya

        // Test 1
//        for (int i = 0; i < 20; i++) {
//            queue.add(String.valueOf(i));
//        }

        // Test 2
        queue.add("Eko");
        queue.add("Kurniawan");
        queue.add("Khannedy");

        for (String next = queue.poll(); next != null; next = queue.poll()) {
            System.out.println(next);
        }

        System.out.println(queue.size()); // Hasilnya = 0
        /*
        * Notes!
        * > Kenapa hasilnya = 0
        * > Karena kita menggunakan poll()
        * > poll() = ngambil dan menghapus data paling depan
        * */

    }
}
