package programmer.zaman.now.collection.data;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

// MATERI IMMUTABLE LIST
public class Person {

    private String name;

    private List<String> hobbies;

    public Person(String name) {
        this.name = name;
        this.hobbies = new ArrayList<>();
    }

    public void addHobby(String hobby) {
        hobbies.add(hobby);
    }

    public List<String> getHobbies() {
//        return hobbies; // Muttable List (Data bisa diubah di method lain)
        return Collections.unmodifiableList(hobbies); // Konversi jadi Immutable List (Data tidak bisa diubah di method lain)
    }

    public String getName() {
        return name;
    }
}
