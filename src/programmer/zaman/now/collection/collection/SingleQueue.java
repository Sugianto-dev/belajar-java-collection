package programmer.zaman.now.collection.collection;

import java.util.AbstractQueue;
import java.util.Collections;
import java.util.Iterator;

// MATERI ABSTRACT COLLECTION
/*
* Notes!
* > Daripada implements Queue, lebih baik extends AbstractQueue
* > Karena kalo implements Queue harus implements banyak method
* > beda dengan extends AstractQueue
* */
public class SingleQueue<E> extends AbstractQueue<E> {

    private E data;

    @Override
    public Iterator<E> iterator() {
        return Collections.singleton(data).iterator();
    }

    @Override
    public int size() {
        return data == null ? 0 : 1;
    }

    @Override
    public boolean offer(E e) { // Insert data
        if (data == null) {
            data = e;
            return true;
        }
        return false;
    }

    @Override
    public E poll() { // Mengambil data & menghapus data
        E temp = data;
        data = null;
        return temp;
    }

    @Override
    public E peek() { // Mengambil data tapi tidak menghapus data
        return data;
    }
}
