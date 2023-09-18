package programmer.zaman.now.collection;

import programmer.zaman.now.collection.data.Person;

import java.util.List;

// MATERI IMMUTABLE LIST
public class MutableApp {
    public static void main(String[] args) {

        Person person = new Person("Eko");

        person.addHobby("Game");
        person.addHobby("Coding");

        doSomethingWithHobbies(person.getHobbies()); // Masih terlihat tanpa ada masalah

        for (var hobby : person.getHobbies()) {
            System.out.println(hobby);
        }

    }

    public static void doSomethingWithHobbies(List<String> hobbies){
        // Namun masalah akan terjadi, dimana method lain bisa mengubah data hobby di person
//        hobbies.add("Bukan Hobby"); // Setelah diubah menjadi Immutable di Person.java maka ini akan ERROR
        /*
        * Notes!
        * > Cara mengatasinya liat di Person.java (getHobbies())
        * */
    }
}
