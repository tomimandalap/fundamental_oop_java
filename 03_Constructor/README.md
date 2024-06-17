# 03_Constructor OOP

- Saat kita membuat Object, maka kita seperti memanggil sebuah method, karena kita menggunakan tanda kurung ()
- di dalam class Java, kita dapat membuat constructor, `Constructor merupakan method yang ada dipanggil saat pertama kali object dibuat`
- Mirip seperti di method, kita bisa memberikan parameter pada contructor
- nama constructor harus sama dengan **nama classnya**, dan tidak membutuhkan kata kunci void atau return value

```
~/src/Person.java

class Person {
  String name;
  String address;
  final String country = "Indonesia";

  // Contructor
  Person(String paramName, String paramAddress) {
    name = paramName;
    address = paramAddress;
  }

  void sayHello(String paramName) {
    System.out.println("Hello " + paramName + ", My name is " + name + ". I live in " + address);
  }
}
```

```
~/src/App.java

public class App {
  public static void main(String[] args) throws Exception {
    Person person = new Person("Tomi Mandala Putra", "Jl. Kenangan");
    person.sayHello("Joko"); // Hello Joko, My name is Tomi Mandala Putra. I live in Jl. Kenangan
  }
}

```


## Contructor Overloading

- Sama seperti di method, di contructor juga dapat melakukan overloading
- kita dapat membuat contructor lebih dari satu yaitu dengan syarat tipe data parameter harus berbeda atau jumlah parameter harus berbeda (hal ini membantu kita untuk membuat contructor menjadi lebih flexible)

```
~/src/Person.java

class Person {
  String name;
  String address;
  final String country = "Indonesia";

  // Contructor
  Person(String paramName, String paramAddress) {
    name = paramName;
    address = paramAddress;
  }

  /*
   * Contructor overloading examples
   */

  Person(String paramName) {
    name = paramName;
  }

  Person() {
  }

  void sayHello(String paramName) {
    System.out.println("Hello " + paramName + ", My name is " + name + ". I live in " + address);
  }
}
```

```
~/src/App.java

public class App {
  public static void main(String[] args) throws Exception {
    // Contructor
    Person person1 = new Person("Tomi Mandala Putra", "Jl. Kenangan");
    person1.sayHello("Joko"); // Hello Joko, My name is Tomi Mandala Putra. I live in Jl. Kenangan

    /*
     * Constructor overloading examples
     */

    var person2 = new Person("Tono");
    person2.address = "Jl. Merdeka";
    person2.sayHello("Budi"); // Hello Budi, My name is Tono. I live in Jl. Merdeka

    Person person3;
    person3 = new Person();
    person3.name = "Koko";
    person3.address = "Jl. Sudirman";
    person3.sayHello("Putri"); // Hello Putri, My name is Koko. I live in Jl. Sudirman
  }
}

```


## Cara memanggil Contructor lain
- Constructor juga dapat memanggil contructor lain
- Hal ini memudahkan saat kita membutuhkan untuk menginisialisasi data dengan berbagai kemungkinan
- Cara untuk memanggil contructor lain, kita hanya perlu memanggilnya seperti memanggil method, dengan kata kunci ```this```

```
~/src/Person.java

class Person {
  String name;
  String address;
  final String country = "Indonesia";

  // Contructor
  Person(String paramName, String paramAddress) {
    name = paramName;
    address = paramAddress;
  }

  /*
   * Contructor overloading
   */

  Person(String paramName) {
    // Memanggil constructor Person(paramName, paramAddress)
    // cukup dengan keyword this

    this(paramName, null);
  }

  Person() {
    // Memanggil constructor Person(paramName)
    // cukup dengan keyword this

    this(null);
  }

  void sayHello(String paramName) {
    System.out.println("Hello " + paramName + ", My name is " + name + ". I live in " + address);
  }
}
```

```
~/src/App.java

public class App {
  public static void main(String[] args) throws Exception {
    // Contructor
    Person person1 = new Person("Tomi Mandala Putra", "Jl. Kenangan");
    person1.sayHello("Joko"); // Hello Joko, My name is Tomi Mandala Putra. I live in Jl. Kenangan

    /*
     * Constructor overloading examples
     */

    var person2 = new Person("Tono");
    person2.address = "Jl. Merdeka";
    person2.sayHello("Budi"); // Hello Budi, My name is Tono. I live in Jl. Merdeka

    Person person3;
    person3 = new Person();
    person3.name = "Koko";
    person3.address = "Jl. Sudirman";
    person3.sayHello("Putri"); // Hello Putri, My name is Koko. I live in Jl. Sudirman
  }
}

```