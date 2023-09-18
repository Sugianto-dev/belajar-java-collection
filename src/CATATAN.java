public class CATATAN {
    /*
    * Pendahuluan                   = > Agenda :
    *                                   > Pengenalan Collection
    *                                   > Iterable
    *                                   > List
    *                                   > Set
    *                                   > Queue
    *                                   > Deque
    *                                   > Map
    *                                   > Dan lain-lain
    *
    * Pengenalan Collection         = > Collection adalah hal umum yang biasa dimiliki di bahasa pemrograman, seperti PHP, Python, Ruby dan lain-lain
    *                                 > Collection atau kadang disebut container, adalah object yang mengumpulkan atau berisikan data-data, mirip seperti Array
    *                                 > Java telah menyediakan class-class collection yang sudah bisa langsung kita gunakan, tanpa tambahan library
    *                                 > Semua class-class collection di  Java adalah generic class, sehingga kita bisa menggunakan Java collection dengan data apapun
    *
    *                                 > Java Collection :
    *                                   > Java collection telah menyediakan semuanya yang berhubungan dengan collection, sehingga kita hanya cukup tinggal menggunakannya
    *                                     > Interfaces, ini adalah contract representasi dari collection. Semua collection di Java memiliki kontrak interface, sehingga jika kita mau, kita juga bisa membuat implementasinya sendiri
    *                                     > Implementations, tidak perlu khawatir, kita juga bisa menggunakan implementasi yang sudah dibuat oleh Java, semua interface collection sudah ada implementasi class nya di Java collection
    *                                     > Algorithms, Java juga sudah menyediakan algoritma-algoritma yang umum digunakan di collection, seperti pencarian dan pengurutan data di collection
    *
    *                                 > Java Collection Interface :
    *                                   > Iterable (Mirip array, menggunakan index)
    *                                   > Map (Berisi Key & Value, Jadi indexnya bisa bebas kita atur sendiri)
    *
    * Iterable Dan Iterator         = > Iterable Interface :
    *                                   > Iterable adalah parent untuk semua collection di Java, kecuali Map
    *                                   > Iterable sendiri sangat sederhana, hanya digunakan agar mendukung for-each loop
    *                                   > Karena semua collection pasti implement iterable, secara otomatis maka semua collection di Java mendukung perulangan for-each, jadi bukan cuma Array
    *
    *                                 > Iterator Interface :
    *                                   > Tidak ada magic di Java, sebenarnya for-each di Iterable bisa terjadi karena ada method iterator() yang mengembalikan object Iterator
    *                                   > Iterator adalah interface yang mendefinisikan cara kita melakukan mengakses element di collection secara sequential
    *                                   > For-each sendiri muncul sejak Java 5, sebelum Java 5 untuk melakukan iterasi collection, biasanya dilakukan manual menggunakan Iterator object
    *
    *                                 > IterableApp.java
    *
    * Collection                    = > Collection Interface
    *                                   > Selain Iterable interface, parent class semua collection di Java adalah Collection
    *                                   > Kalo Iterable interface digunakan sebagai kontrak untuk meng-iterasi data secara sequential
    *                                   > Collection merupakan kontrak untuk memanipulasi data collection, seperti menambah, menghapus dan mengecek isi data collection
    *                                   > Tidak ada direct implementation untuk Collection, karena collection nanti akan dibagi lagi menjadi List, Set dan Queue
    *
    *                                 > CollectionApp.java
    *
    * List                          = > List Interface
    *                                   > List adalah struktur data collection yang memiliki sifat sebagai berikut
    *                                     > Elemen  di list bisa duplikat, artinya bisa memasukkan data yang sama
    *                                     > Data list berurut sesuai dengan posisi kita memasukkan data
    *                                     > List memiliki index, sehingga kita bisa menggunakan nomor index untuk mendapatkan element di list
    *                                   > Di Java ada beberapa implementasi List, dan kita bisa memilih sesuai dengan kebutuhan kita
    *
    *                                 > Implementasi List
    *                                   > (I) Iterable <----- (I) Collection <----- (I) List <----- (C) ArrayList
    *                                                                               (I) List <----- (C) LinkedList
    *
    *                                   > (I)       = Interface
    *                                   > (C)       = Class Implementasi
    *                                   > <-----    = Parent
    *
    *                                 > ArrayList Class
    *                                   > ArrayList adalah implementasi dari List menggunakan array
    *                                   > Default kapasitas array di ArrayList adalah 10
    *                                   > Namun ketika kita memasukkan data dan array sudah penuh, maka secara otomatis ArrayList akan membuat array baru dengan kapasitas baru dengan ukuran kapasitas lama + data baru
    *
    *                                 > LinkedList Class
    *                                   > LinkedList adalah implementasi List dengan struktur data Double Linked List
    *                                   > Bagi yang sudah belajar tentang struktur data di sekolah / kampus pasti tau apa itu double linked list
    *
    *                                   Head ------> |--|---|--|--next-> |--|---|--|--next-> |--|---|--|--next-> |--|---|--|--next-> NULL
    *                                                |  | A |  |         |  | B |  |         |  | C |  |         |  | D |  |
    *                                   NULL <-prev--|--|---|--| <-prev--|--|---|--| <-prev--|--|---|--| <-prev--|--|---|--|
    *
    *                                 > ArrayList vs LinkedList
    *                                   -----------------------------------------------------------------------------------------------------
    *                                   | Operasi       | ArrayList                             | LinkedList                                |
    *                                   -----------------------------------------------------------------------------------------------------
    *                                   | add           | Cepat jika kapasitas Array masih      | Cepat karena hanya menambah node di akhir |
    *                                   |               | cukup, lambat jika sudah penuh        |                                           |
    *                                   -----------------------------------------------------------------------------------------------------
    *                                   | get           | Cepat karena tinggal gunakan index    | Lambat karena harus di cek dari node awal |
    *                                   |               | array                                 | sampai ketemu index nya                   |
    *                                   -----------------------------------------------------------------------------------------------------
    *                                   | set           | Cepat karena tinggal gunakan index    | Lambat karena harus di cek dari node awal |
    *                                   |               | array                                 | sampai ketemu                             |
    *                                   -----------------------------------------------------------------------------------------------------
    *                                   | remove        | Lambat karena harus menggeser data di | Cepat karena tinggal ubah prev dan next   |
    *                                   |               | belakang yang dihapus                 | di node sebelah yang dihapus              |
    *                                   -----------------------------------------------------------------------------------------------------
    *
    *                                 > ListApp.java
    *
    * Immutable List                = > Secara default, List di Java baik itu ArrayList ataupun LinkedList datanya bersifat mutable (Bisa diubah)
    *                                 > Di Java mendukung pembuatan Immutable List, artinya datanya tidak bisa diubah lagi.
    *                                 > Sekali List dibuat, datanya tidak bisa diubah lagi, alias final.
    *                                 > Tapi ingat, data list nya yang tidak bisa diubah, bukan reference object element nya. Kalo misal kiat membuat Immutable List berisikan data Person, field data Person tetap bisa diubah, tapi isi elemen dari Immutable List tidak bisa diubah lagi
    *                                 > Ini cocok ketika kasus-kasus misal, tidak sembarangan code yang boleh mengubah element di List
    *
    *                                 > Membuat Immutable List
    *                                   -----------------------------------------------------------------------------------------------------
    *                                   | Method                                | Keterangan                                                |
    *                                   -----------------------------------------------------------------------------------------------------
    *                                   | Collections.emptyList()               | Membuat immutable list kosong                             |
    *                                   | Collections.singletonList(e)          | Membuat immutable list berisi 1 element                   |
    *                                   | Collections.unmodifiableList(list)    | Mengubah mutable list menjadi immutable                   |
    *                                   | List.of(e...)                         | Membuat immutable list dari element - element             |
    *                                   -----------------------------------------------------------------------------------------------------
    *                                 > Contoh pembuatan ada di ImmutableApp.java
    *
    *                                 > Person.java, MutableApp.java, ImmutableApp.java
    *
    * Set                           = > Set Interface
    *                                   > Set adalah salah satu collection yang berisikan elemen-elemen yang unik, atau tidak boleh duplicate
    *                                   > Set tidak memiliki index seperti di List, oleh karena itu tidak ada jaminan data yang ada di Set itu akan terurut sesuai dengan waktu kita memasukkan data ke Set
    *                                   > Set tidak memiliki method baru, jadi hanya menggunakan method yang ada di interface parent nya, yaitu Collection dan Iterable
    *                                   > Karena tidak memiliki index, untuk mengambil data di Set juga kita harus melakukan iterasi satu per satu
    *
    *                                 > Implementasi Set
    *                                   (I) Iterable <---- (I) Collection <---- (I) Set <---- (C) EnumSet
    *                                                                           (I) Set <---- (C) HashSet <---- (C) LinkedHashSet
    *                                                                                                                     |
    *                                                                           (I) Set <---------------------------------|
    *
    *                                 > HashSet vs LinkedHashSet
    *                                   > Di belakang HashSet dan LinkedHashSet sebenarnya sama-sama ada hash table, dimana data disimpan dalam sebuah hash table dengan mengkalkulasi hashCode() function
    *                                   > Yang membedakan adalah, HashSet tidak menjamin data terurut sesuai dengan waktu kita menambahkan data, sedangkan LinkedHashSet menjamin data terurut sesuai dengan waktu kita menambahkan data.
    *                                   > Urutan data di LinkedHashSet bisa dijaga karena di belakang nya menggunakan double linked list
    *
    *                                 > EnumSet
    *                                   > EnumSet adalah Set yang elemen datanya harus Enum
    *                                   > Karena data Enum itu unik, sehingga sangat cocok menggunakan Set dibandingkan List
    *
    *                                 > SetApp.java, EnumSetApp.java
    *
    * Immutable Set                 = > Sama seperti List, Set pun memiliki tipe data Immutable
    *                                 > Cara pembuatan immutable Set di Java mirip dengan pembuatan immutable List
    *
    *                                 > Membuat Immutable Set
    *                                   -----------------------------------------------------------------------------------------------------
    *                                   | Method                                | Keterangan                                                |
    *                                   -----------------------------------------------------------------------------------------------------
    *                                   | Collections.emptySet()                | Membuat immutable set kosong                              |
    *                                   | Collections.singleton(e)              | Membuat immutable set berisi 1 element                    |
    *                                   | Collections.unmodifiableSet(set)      | Mengubah mutable set menjadi immutable                    |
    *                                   | Set.of(e...)                          | Membuat immutable set dari element - element              |
    *                                   -----------------------------------------------------------------------------------------------------
    *                                 > Contoh pembuatan ada di ImmutableSetApp.java
    *
    *                                 > ImmutableSetApp.java
    *
    * SortedSet                     = > SortedSet Interface
    *                                   > SortedSet adalah turunan dari Set, namun di SortedSet elemen-elemen yang dimasukkan kedalam SortedSet akan otomatis diurutkan
    *                                   > Jika element adalah turunan dari interface Comparable, maka secara otomatis akan diurutkan menggunakan comparable tersebut
    *                                   > Jika element bukan turunan dari interface Comparable, maka kita bisa menggunakan Comparator untuk memberi tahun si SortedSet bagaimana cara mengurutkan elemen-elemen nya
    *
    *                                 > Method di SortedSet Interface
    *                                   > (I)SortedSet
    *                                     > (O)Set
    *                                       > comparator()
    *                                       > subSet(E,E)
    *                                       > headSet(E)
    *                                       > tailSet(E)
    *                                       > first()
    *                                       > last()
    *
    *                                 > Implementasi SortedSet
    *                                   (I) Iterable <---- (I) Collection <---- (I) Set <---- (I) SortedSet <---- (I) NavigableSet <---- (C) TreeSet
    *
    *                                 > Membuat Immutable SortedSet
    *                                   -----------------------------------------------------------------------------------------------------
    *                                   | Method                                | Keterangan                                                |
    *                                   -----------------------------------------------------------------------------------------------------
    *                                   | Collections.emptySortedSet()          | Membuat immutable sorted set kosong                       |
    *                                   | Collections.unmodifiableSortedSet(set)| Mengubah mutable sorted set menjadi immutable             |
    *                                   -----------------------------------------------------------------------------------------------------
    *
    *                                 > PersonComparator.java, SortedSetApp.java
    *
    * NavigableSet                  = > NavigableSet Interface
    *                                   > NavigableSet adalah turunan dari SortedSet
    *                                   > NavigableSet menambah method-method untuk melakukan navigasi pencarian element, seperti mencari elemen yang lebih besar dari, kurang dari, membalikkan urutan set, dan lain-lain
    *
    *                                 > Method di NavigableSet
    *                                   > (I)NavigableSet
    *                                     > (O)Set
    *                                     > (O)SortedSet
    *                                     > lower(E)
    *                                     > floor(E)
    *                                     > ceiling(E)
    *                                     > higher(E)
    *                                     > pollFirst()
    *                                     > pollLast()
    *                                     > descendingSet()
    *                                     > descendingIterator()
    *                                     > subSet(E, boolean, E, boolean)
    *                                     > headSet(E, boolean)
    *                                     > tailSet(E, boolean)
    *
    *                                 > Implementasi NavigableSet
    *                                   (I) Iterable <---- (I) Collection <---- (I) Set <---- (I) SortedSet <---- (I) NavigableSet <---- (C) TreeSet
    *
    *                                 > Membuat Immutable NavigableSet
    *                                   -----------------------------------------------------------------------------------------------------
    *                                   | Method                                    | Keterangan                                            |
    *                                   -----------------------------------------------------------------------------------------------------
    *                                   | Collections.emptyNavigableSet()           | Membuat immutable navigable set kosong                |
    *                                   | Collections.unmodifiableNavigableSet(set) | Mengubah mutable navigable set menjadi immutable      |
    *                                   -----------------------------------------------------------------------------------------------------
    *
    *                                 > NavigableSetApp.java
    *
    * Queue                         = > Queue Interface
    *                                   > Queue adalah implementasi dari struktur data Antrian atau FIFO (First In First Out)
    *
    *                                 > Method di Queue Interface
    *                                   > (I)Queue
    *                                     > (O)Collection
    *                                       > offer(E)
    *                                       > remove()
    *                                       > poll()
    *                                       > element()
    *                                       > peek()
    *
    *                                 > Implementasi Queue
    *                                   (I) Iterable <---- (I) Collection <---- (I) Queue <---- (C) PriorityQueue
    *                                                                           (I) Queue <---- (I) Deque <---- (C) ArrayDeque
    *                                                                                           (I) Deque <---- (C) LinkedList
    *
    *                                 > ArrayDeque vs LinkedList vs PriorityQueue
    *                                   > ArrayDeque menggunakan array sebagai implementasi queue nya
    *                                   > LinkedList menggunakan double linked list sebagai implementasi queue nya
    *                                   > PriorityQueue menggunakan array sebagai implementasi queue nya, namun diurutkan mennggunakan Comparable atau Comparator
    *
    *                                 > QueueApp.java
    *
    * Deque                         = > Deque Interface
    *                                   > Deque singkatan dari double ended queue, artinya queue yang bisa beroperasi dari depan atau belakang
    *                                   > Jika pada queue, operasi yang didukung ada FIFO, namu pada deque, tidak hanya FIFO, naun juga mendukung LIFO (Last In First Out)
    *                                   > Bisa dibilang deque adalah implementasi struktur data antrian dan stack (tumpukan)
    *
    *                                 > Method di Deque
    *                                   > (I)Deque
    *                                     > (O)Queue
    *                                     > (O)Collection
    *                                       > addFirst(E)
    *                                       > addLast(E)
    *                                       > offerFirst(E)
    *                                       > offerLast(E)
    *                                       > removeFirst()
    *                                       > removeLast()
    *                                       > pollFirst()
    *                                       > pollLast()
    *                                       > getFirst()
    *                                       > getLast()
    *                                       > peekFirst()
    *                                       > peekLast()
    *                                       > removeFirstOccurrence(Object)
    *                                       > removeLastOccurrence(Object)
    *                                       > push(E)
    *                                       > pop()
    *                                       > descendingIterator()
    *
    *                                 > Implementasi Deque
    *                                   (I) Iterable <---- (I) Collection <---- (I) Queue <---- (I) Deque <---- (C) ArrayDeque
    *                                                                                           (I) Deque <---- (C) LinkedList
    *
    *                                 > DequeApp.java
    *
    * Map                           = > Map Interface
    *                                   > Map adalah struktur data collection yang berisikan mapping antara key dan value
    *                                   > Dimana key di map itu harus unik, tidak boleh duplikat, dan satu key cuma boleh mapping ke satu value
    *                                   > Map sebenarnya mirip dengan Array, cuma bedanya kalo di Array, key adalah index (integer), sedangkan di Map, key nya bebas kita tentukan sesuai keinginan kita
    *
    *                                 > Method di Map
    *                                   > ...
    *
    *                                 > Implementasi Map
    *                                   (I)Map <---- (C)HashMap
    *                                          <---- (C)WeakHashMap
    *                                          <---- (C)IdentityHashMap
    *                                          <---- (C)LinkedHashMap
    *                                          <---- (C)EnumHashMap
    *
    *                                 > HashMap
    *                                   > HashMap adalah implementasi Map yang melakukan distribusi key menggunakan hashCode() function
    *                                   > Karena HashMap sangat bergantung dengan hashCode() function, jadi pastikan kita harus membuat function hashCode seunik mungkin, karena jika terlalu banyak nilai hashCode() yang sama, maka pendistribusian key nya tidak akan optimal sehingga proses get data di Map akan semakin lambat
    *                                   > Di HashMap pengecekan data duplikat dilakukan dengan menggunakan method equals nya
    *
    *                                 > WeakHashMap
    *                                   > WeakHashMap adalah implementasi Map mirip dengan HashMap
    *                                   > Yang membedakan adalah WeakHashMap menggunakan weak key, dimana jika tidak digunakan lagi maka secara otomatis data di WeakHashMap akan dihapus
    *                                   > Artinya, jika terjadi garbage collection di Java, bisa dimungkinkan data di WeakHashMap akan dihapus
    *                                   > WeakHashMap cocok digunakan untuk menyimpan data cache di memory secara sementara
    *
    *                                 > IdentityHashMap
    *                                   > IdentittyHashMap adalah implementasi Map sama seperti HashMap
    *                                   > Yang membedakan adalah cara pengecekan kesamaan datanya, tidak menggunakan function equals, melainkan menggunakan operator == (reference equality)
    *                                   > Artinya data dianggap sama, jika memang lokasi di memory tersebut sama
    *
    *                                 > LinkedHashMap
    *                                   > LinkedHashMap adalah implementasi Map dengan menggunakan double linked list
    *                                   > Data di LinkedHashMap akan lebih terprediksi karena datanya akan disimpan berurutan dalam linked list sesuai urutan kita menyimpan data
    *                                   > Namun perlu diperhatikan, proses get data di LinkedHashMap akan semakin lambat karena harus melakukan iterasi data linked list terlebih dahulu
    *                                   > Gunakan LinkedHashMap jika memang kita lebih mementingkan iterasi data Map nya
    *
    *                                 > EnumMap
    *                                   > EnumMap adalah implementasi Map dimana key nya adalah enum
    *                                   > Karena data enum sudah pasti unik, oleh karena itu cocok dijadikan key di Map
    *                                   > Algoritma pendistribusian key dioptimalkan untuk enum, sehingga lebih optimal dibandingkan menggunakan hashCode() method
    *
    *                                 > HashMapApp.java, WeakHashMapApp.java, IdentityHashMapApp.java, LinkedHashMapApp.java, EnumHashMapApp.java
    *
    * Immutable Map                 = > Sama seperti List dan Set, Map pun punya tipe data Immutable
    *
    *                                 > Membuat Immutable Map
    *                                   -----------------------------------------------------------------------------------------------------
    *                                   | Method                                | Keterangan                                                |
    *                                   -----------------------------------------------------------------------------------------------------
    *                                   | Collections.emptyMap()                | Membuat immutable map kosong                              |
    *                                   | Collections.unmodifiableMap(map)      | Mengubah mutable map menjadi immutable                    |
    *                                   | Collections.singletonMap(key, value)  | Membuat map dengan satu jumlah key-value                  |
    *                                   | Map.of(...)                           | Membuat immutable map dari key-value                      |
    *                                   -----------------------------------------------------------------------------------------------------
    *
    *                                 > ImmutableMapApp.java
    *
    * SortedMap                     = > SortedMap Interface
    *                                   > SortedMap adalah implementasi Map dengan data key diurutkan sesuai dengan Comparable key atau bisa menggunakan Comparator
    *                                   > SortedMap cocok untuk kasus yang posisi key pada Map harus berurut
    *
    *                                 > Method di SortedMap
    *                                   > (I)sortedMap
    *                                     > (O)Map
    *                                       > comparator()
    *                                       > subMap(K, K)
    *                                       > headMap(K)
    *                                       > tailMap(K)
    *                                       > firstKey()
    *                                       > lastKey()
    *
    *                                 > Implementasi SortedMap
    *                                   (I) Map <---- (I) SortedMap <---- (C) TreeMap
    *
    *                                 > Membuat Immutable SortedMap
    *                                   -----------------------------------------------------------------------------------------------------
    *                                   | Method                                    | Keterangan                                            |
    *                                   -----------------------------------------------------------------------------------------------------
    *                                   | Collections.emptySortedMap()              | Membuat immutable sorted map kosong                   |
    *                                   | Collections.unmodifiableSortedMap(map)    | Mengubah mutable sorted map menjadi immutable         |
    *                                   -----------------------------------------------------------------------------------------------------
    *
    *                                 > SortedMapApp.java
    *
    * NavigableMap                  = > NavigableMap Interface
    *                                   > NavigableMap adalah turunan dari SortedMap
    *                                   > Namun NagivableMap memiliki kemampuan navigasi berdasarkan operasi kurang dari, lebih dari dan sejenisnya
    *                                   > Misal, kita ingin mengambil data yang lebih dari key x atau kurang dari key y, ini bisa dilakukan di NavigableMap
    *
    *                                 > Method di NavigableMap
    *                                   > (I)NavigableMap
    *                                     > (O)SortedMap
    *                                       > lowerEntry(K)
    *                                       > lowerKey(K)
    *                                       > floorEntry(K)
    *                                       > floorKey(K)
    *                                       > ceilingEntry(K)
    *                                       > ceilingKey(K)
    *                                       > higherEntry(K)
    *                                       > higherKey(K)
    *                                       > firstEntry()
    *                                       > lastEntry()
    *                                       > pollFirstEntry()
    *                                       > pollLastEntry()
    *                                       > descendingMap()
    *                                       > navigableKeySet()
    *                                       > descendingKeySet()
    *                                       > subMap(K, boolean, K, boolean)
    *                                       > headMap(K, boolean)
    *                                       > tailMap(K, boolean)
    *
    *                                 > Implementasi NavigableMap
    *                                   (I) Map <---- (I) SortedMap <---- (I) NavigableMap <---- (C) TreeMap
    *
    *                                 > Membuat Immutable NavigableMap
    *                                   -----------------------------------------------------------------------------------------------------
    *                                   | Method                                    | Keterangan                                            |
    *                                   -----------------------------------------------------------------------------------------------------
    *                                   | Collections.emptyNavigableMap()           | Membuat immutable navigable map kosong                |
    *                                   | Collections.unmodifiableNavigableMap(map) | Mengubah mutable navigable map menjadi immutable      |
    *                                   -----------------------------------------------------------------------------------------------------
    *
    *                                 > NavigableMapApp.java
    *
    * Entry Map                     = > Entry Interface
    *                                   > Saat kita menyimpan data di Map, data disimpan dalam pair (key-value)
    *                                   > Di Java collection, implementasi Pair di Map bernama Entry
    *                                   > Entry adalah interface sederhana yang berisikan method untuk mengambil key dan value
    *
    *                                 > Method di Entry Interface
    *                                   > (I)Entry
    *                                     > (O)Object
    *                                       > getKey()
    *                                       > getValue()
    *                                       > setValue(V)
    *                                       > comparingByKey()
    *                                       > comparingByValue()
    *                                       > comparingByKey(Comparator<? super K>)
    *                                       > comvaringByValue(Comparator<? super V>)
    *
    *                                 > EntryApp.java
    *
    * Legacy Collection             = > Collection sudah ada sejak Java versi 1, namun semakin kesini, Java Collection semakin berkembang
    *                                 > Sebenarnya ada beberapa legacy collection (collection jadul) yang belum kita bahas, namun jarang sekali digunakan sekarang ini
    *
    *                                 > Vector Class
    *                                   > Vector class adalah implementasi dari interface List
    *                                   > Cara kerja Vector mirip dengan ArrayList, yang membedakan adalah semua method di Vector menggunakan kata kunci  synchronized yang artinya dia thread safe
    *                                   > Namun problemnya adalah, karena semua method menggunakan kata kunci synchronized, secara otomatis impact nya ke-performance yang menjadi lambat dibandingkan menggunakan ArrayList
    *                                   > Lantai bagaimana jika kita ingin membuat List yang bisa digunakan di proses paralel? Di versi Java baru, sudah disediakan yang lebih canggih untuk itu, oleh karena itu penggunakan Vector sudah jarang sekali ditemui sekarang
    *
    *                                 > HashTable Class
    *                                   > HashTable adalah implementasi dari Map yang mirip dengan HashMap
    *                                   > Sama seperti Vector, semua method di HashTable memiliki kata kunci synchronized, sehingga performanya lebih lambat dibandingkan HashMap
    *                                   > Dan karena di versi Java baru sudah ada juga ConcurrentHashMap, sehingga penggunaan HashTable sudah jarang sekali ditemui
    *
    *                                 > Stack Class
    *                                   > Stack adalah implementasi struktur data tumpukan LIFO (Last In First Out)
    *                                   > Namun fitur yang lebih komplit dan konsisten sudah disediakan di Deque, jadi tidak ada alasan lagi menggunakan class Stack
    *
    *                                 > VectorApp.java, HashTableApp.java, StackApp.java
    *
    * Sorting                       = > Sorting atau pengurutan adalah algoritma yang sudah biasa kita lakukan
    *                                 > Di Java Collection juga sudah disediakan cara untuk melakukan pengurutan, jadi kita tidak perlu melakukan pengurutan secara manual
    *                                 > Namun perlu diingat, yang bisa di sort hanyalah List, karena Set, Queue, Deque dan Map cara kerjanya sudah khusus, jadi pengurutan hanya bisa dilakukan di List
    *
    *                                 > Sorting di List
    *                                   ------------------------------------------------------------------------------------------
    *                                   | Method                             | Keterangan                                        |
    *                                   ------------------------------------------------------------------------------------------
    *                                   | Collections.sort(list)             | Mengurutkan list dengan comparable bawaan element |
    *                                   | Collections.sort(list, comparator) | Mengurutkan list dengan comparator                |
    *                                   ------------------------------------------------------------------------------------------
    *
    *                                 > SortingApp.java
    *
    * Binary Search                 = > Secara default List di Java memiliki fitur search atau get data, namun implementasinya menggunakan sequential search, artinya data akan di cek satu per satu dari awal
    *                                 > Salah satu algoritma pencarian yang populer adalah binary search, namun binary search hanya bisa dilakukan jika datanya telah berurutan
    *                                 > Untungnya di Java Collection sudah ada implementasi binary search, sehingga kita tidak perlu membuatnya secara manual
    *
    *                                 > Binary Search di List
    *                                   -------------------------------------------------------------------------------------------------------------------
    *                                   | Method                                            | Keterangan                                                  |
    *                                   -------------------------------------------------------------------------------------------------------------------
    *                                   | Collections.binarySearch(list, value)             | Mencari menggunakan binary search                           |
    *                                   | Collections.binarySearch(list, value, comparator) | Mencari menggunakan binary search dengan bantuan comparator |
    *                                   -------------------------------------------------------------------------------------------------------------------
    *
    *                                 > BinarySearchApp.java
    *
    * Collections Class             = > Collections adalah class yang berisikan utility static method untuk membantu kita menggunakan Java Collection
    *                                 > Di materi-materi sebelumnya kita sudah bahas beberapa, seperti membuat immutable collection misalnya
    *                                 > Namun sebenarnya masih ada banyak static method yang bisa kita gunakan di class Collections
    *                                 > https://docs.oracle.com/en/java/javase/14/docs/api/java.base/java/util/Collections.html
    *
    *                                 > Static Method di Collections Class
    *                                   ---------------------------------------------------------------------------------------------------------------------
    *                                   | Method                                            | Keterangan                                                    |
    *                                   ---------------------------------------------------------------------------------------------------------------------
    *                                   | void copy(listTo, listFrom)                       | Copy semua data dari listFrom ke listTo                       |
    *                                   | int frequency(collection, object)                 | Mengambil berapa banyak element yang sama dengan object       |
    *                                   | max(collection) dan max(collection, comparator)   | Mengambil element paling tinggi di list                       |
    *                                   | min(collection) dan min(collection, comparator)   | Mengambil element paling kecil di list                        |
    *                                   | void reverse(list)                                | Membalikkan seluruh element di list                           |
    *                                   | void shuffle(list)                                | Mengacak posisi element di list                               |
    *                                   | void swap(list, from, to)                         | Menukar posisi from ke to di list                             |
    *                                   | ... dan masih banyak                              |                                                               |
    *                                   ---------------------------------------------------------------------------------------------------------------------
    *
    *                                 > CollectionsApp.java
    *
    * Abstract Collection           = > Struktur data collection di Java selalu berkembang, namun biasanya algoritma dasarnya selamu sama antar jenis collection
    *                                 > Hampir semua interface collection di Java sudah disediakan abstract class nya sebagai dasar algoritma nya, dan hampir semua implementasi class konkrit nya selalu extends abstract class collection
    *                                 > Hal ini mempermudah kita, jika ingin membuat collection manual, kita tidak perlu membuat dari awal, kita bisa menggunakan abstract class yang sudah disediakan
    *
    *                                 > Abstract CLass
    *                                   -----------------------------------------
    *                                   | Abstract Class        | Untuk         |
    *                                   -----------------------------------------
    *                                   | AbstractCollection    | Collection    |
    *                                   | AbstractList          | List          |
    *                                   | AbstractMap           | Map           |
    *                                   | AbstractQueue         | Queue         |
    *                                   | AbstractSet           | Set           |
    *                                   -----------------------------------------
    *
    *                                 > SingleQueue.java, SingleQueueApp.java
    *
    * Default Method                = > Di Java 8 ada fitur bernama Default Method, dimana kita bisa menambahkan konkrit method di interface
    *                                 > Fitur ini banyak sekali digunakan di Java Collection, karena kita tahu semua collection di Java memiliki kontrak interface, sehingga dengan mudah di Java bisa meng-improve kemampuan semua collection hanya dengan menambahkan default method di interface collection nya
    *
    *                                 > Default Method di Collection
    *                                   -----------------------------------------------------------------------------------------
    *                                   | Default Method                | Keterangan                                            |
    *                                   -----------------------------------------------------------------------------------------
    *                                   | Iterable.forEach(consumer)    | Melakukan iterasi seluruh data collection             |
    *                                   | List.removeIf(predicate)      | Menghapus data di collection menggunakan predicate    |
    *                                   | List.replaceAll(operator)     | Mengubah seluruh data di collection                   |
    *                                   -----------------------------------------------------------------------------------------
    *
    *                                 > Default Method di Map
    *                                   -------------------------------------------------------------------------------------------------------------
    *                                   | Default Method                    | Keterangan                                                            |
    *                                   -------------------------------------------------------------------------------------------------------------
    *                                   | getOrDefault(key, defaultValue)   | Mengambil data berdasarkan key, jika tidak ada, return defaultValue   |
    *                                   | forEach(consumer)                 | Melakukan iterasi seluruh data key-value                              |
    *                                   | replaceAll(function)              | Mengubah seluruh data value                                           |
    *                                   | putIfAbsent(key, value)           | Simpan data ke map jika belum ada                                     |
    *                                   | remove(key, value)                | Hapus jika key-value nya sama                                         |
    *                                   | replace(key, oldValue, newValue)  | Ubah key jika value sekarang sama dengan oldValue                     |
    *                                   | computeIfAbsent(key, function)    | Ubah key dengan value hasil function jika belum ada                   |
    *                                   | computeIfPresent(key, function)   | Ubah key dengan value hasil function jika sudah ada                   |
    *                                   | ... dan masih banyak              |                                                                       |
    *                                   -------------------------------------------------------------------------------------------------------------
    *
    *                                 > CollectionDefaultMethodApp.java, MapDefaultMethodApp.java
    *
    * Spliterator                   = > Spliterator Interface
    *                                   > Spliterator adalah interface yang bisa digunakan untuk melakukan partisi data collection
    *                                   > Biasanya ini digunakan ketika kita akan memproses collection dalam jumlah besar, lalu agar lebih cepat di split menjadi beberapa dan diproses secara paralel agar lebih cepat
    *                                   > Penggunaan Spliterator biasanya erat kaitannya dengan Java Thread atau Java Concurrency, namun di  materi ini kita tidak akan membahas tentang itu, lebih fokus ke Spliterator
    *
    *                                 > Method di Spliterator
    *                                   > (I)Spliterator
    *                                     > (I)OfPrimitive
    *                                     > (I)OfInt
    *                                     > (I)OfLong
    *                                     > (I)OfDouble
    *                                     > tryAdvance(Consumer<? super T>)
    *                                     > forEachRemaining(Consumer<? super T>)
    *                                     > trySplit()
    *                                     > estimateSize()
    *                                     > getExactSizeIfKnown()
    *                                     > characteristics()
    *                                     > hasChatacteristics(int)
    *                                     > getComparator()
    *                                     > (f)ORDERED
    *                                     > (f)DISTINCT
    *                                     > (f)SORTED
    *                                     > (f)SIZED
    *                                     > (f)NONNULL
    *                                     > (f)IMMUTABLE
    *                                     > (f)CONCURRENT
    *                                     > (f)SUBSIZED
    *
    *                                 > SpliteratorApp.java
    *
    * Konversi Ke Array             = > Collection Interface
    *                                   > Interface Collection memiliki method toArray() untuk melakukan konversi collection ke Array
    *                                   > Ini sangat cocok jika kita ingin mengubah collection ke Array, misal saja karena mau memanggil method yang memang parameternya tipenya array, bukan collection
    *
    *                                 > toArray Method di Collection
    *                                   -----------------------------------------------------------------
    *                                   | Method                | Keterangan                            |
    *                                   -----------------------------------------------------------------
    *                                   | Object[] toArray()    | Mengubah collection menjadi array     |
    *                                   | T[] toArray(T[])      | Mengubah collection menjadi array T   |
    *                                   -----------------------------------------------------------------
    *
    *                                 > ArrayApp.java
    *
    * Materi Selanjutnya            = > Apache Maven
    *                                 > Java Lambda Expression
    *                                 > Java Unit Testing
    *                                 > Java Stream
    *
    * */
}
