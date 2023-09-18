package programmer.zaman.now.collection.data;

import java.util.Comparator;

// MATERI SORTEDSET
public class PersonComparator implements Comparator<Person> {

    @Override
    public int compare(Person o1, Person o2) {
        return o1.getName().compareTo(o2.getName());
        /*
        * Notes!
        * > Diatas Diurutkan secara ASCENDING
        * > Jika ingin DESCENDING tinggal dibalik saja o1 ke o2
        * */
    }

}
