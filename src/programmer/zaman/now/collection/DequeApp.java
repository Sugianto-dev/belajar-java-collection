package programmer.zaman.now.collection;

import java.util.Deque;
import java.util.LinkedList;

// MATERI DEQUE
public class DequeApp {
    public static void main(String[] args) {

        // TUMPUKAN
        Deque<String> stack = new LinkedList<>();

        stack.offerLast("Eko");
        stack.offerLast("Kurniawan");
        stack.offerLast("Khannedy");

//        for (var value : stack) {
//            System.out.println(value);
//        }

        // Cara ambil data nya (LIFO)
        System.out.println(stack.pollLast());
        System.out.println(stack.pollLast());
        System.out.println(stack.pollLast());

        // ANTRIAN
        Deque<String> queue = new LinkedList<>();
        queue.offerLast("Eko");
        queue.offerLast("Kurniawan");
        queue.offerLast("Khannedy");

        // Cara ambil data nya (FIFO)
        System.out.println(queue.pollFirst());
        System.out.println(queue.pollFirst());
        System.out.println(queue.pollFirst());

    }
}
