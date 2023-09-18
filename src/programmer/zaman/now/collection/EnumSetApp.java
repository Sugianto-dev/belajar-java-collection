package programmer.zaman.now.collection;

import java.util.EnumSet;
import java.util.Set;

// MATERI SET
public class EnumSetApp {

    public static enum Gender {
        MALE, FEMALE, NOT_MENTION
    }

    public static void main(String[] args) {

//        EnumSet<Gender> genders = EnumSet.allOf(Gender.class); // Semua gender
//        EnumSet<Gender> genders = EnumSet.of(Gender.MALE, Gender.FEMALE, Gender.FEMALE); // Beberapa gender saja

        Set<Gender> genders = EnumSet.of(Gender.MALE, Gender.FEMALE, Gender.FEMALE); // Contoh pakai Set juga bisa tidak harus EnumSet

        for (var gender : genders) {
            System.out.println(gender);
        }

        // Sebenarnya cara untuk dapat semua value gender tinggal seperti ini :
//        Gender[] values = Gender.values();

    }
}
