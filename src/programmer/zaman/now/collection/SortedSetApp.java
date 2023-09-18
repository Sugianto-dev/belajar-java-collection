package programmer.zaman.now.collection;

import programmer.zaman.now.collection.data.Person;
import programmer.zaman.now.collection.data.PersonComparator;

import java.util.Collections;
import java.util.SortedSet;
import java.util.TreeSet;

// MATERI SORTEDSET
public class SortedSetApp {
    public static void main(String[] args) {

//        SortedSet<Person> people = new TreeSet<>(); // ERROR, Karena Person.java tidak implements Comparator (Berandai jika Person.java adalah library orang lain)

        // Cara Mengatasinya, Tambahkan PersonComparator.java yang sudah dibuat sebelumnya
//        SortedSet<Person> people = new TreeSet<>(new PersonComparator());

        // Cara agar diurutkan secara DESCENDING
        SortedSet<Person> people = new TreeSet<>(new PersonComparator().reversed());

        people.add(new Person("Eko"));
        people.add(new Person("Budi"));
        people.add(new Person("Joko"));

        for (var person : people) {
            System.out.println(person.getName());
        }

        // Cara Mengubah Mutable SortedSet menjadi Immutable SortedSet
        SortedSet<Person> sortedSet = Collections.unmodifiableSortedSet(people);
//        sortedSet.add(new Person("Kurniawan")); // ERROR, Karena sudah Immutable jadi datanya tidak bisa diubah lagi

    }
}
