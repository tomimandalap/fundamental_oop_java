# 04 Variable Shadowing - OOP

- Variable shadowing merupakan kejadian dimana ketika kita membuat nama variable dengan nama yang sama dengan nama varible scope diatasnya
- Hal ini dapat terjadi seperti kita membuat nama ```parameter``` di method/contructor sama dengan ```nama field``` di class
- Saat terjadi variable shadowing, maka secara otomatis variable di scope yang ada diatasnya tidak dapat diakses

```
class Person {
  String name;
  String address;

  Person(String name, String address) {
    // field name dari scope class di atas tidak berubah karena penamaan variable
    // sama (terjadi variable shadowing)

    name = name; 
    address = address; // filed address juga sama...
  }

  void sayHello(String name) {
    System.out.println("Hello " + name + ", My name is " + name);
  }
}
```


## ```This``` Keyword
- Saat kita membuat block kode di dalam contructor/method di dalam scope class, kita dapat menggunakan kata kunci ```this``` untuk mengakses object saat ini
- Misalkan kita membutuhkan untuk mengakses sebuah field dalam sebuah class yang namanya sama dengan parameter disebuah method/constructor maka, hal ini tidak bisa dilakukan (terjadi variable shadowing). Lalu bagaimana cara mengakses field tersbut, jika nama field dan parameternya sama? Tentu jawabanya dapat dilakukan dengan menggunakan ```this``` kita dapat mengakses nama field
- ```this``` juga tidak hanya digunakan untuk mengakses field milik object saat ini, namun juga dapat digunakan untuk mengakses method

```
~/src/Person.java

class Person {
  String name;
  String address;

  /*
   * this merujuk pada object saat ini (Person),
   * kemudian setelah titik merupakan field yang ada di object Person itu sendiri.
   */

  Person(String name, String address) {
    this.name = name;
    this.address = address;
  }

  void sayHello(String name) {
    System.out.println("Hello " + name + ", My name is " + this.name);
  }
}
```

```
~/src/App.java

public class App {
  public static void main(String[] args) throws Exception {
    Person person = new Person("Tomi", "Jl. Kenangan");
    person.sayHello("Joko"); // Hello Joko, My name is Tomi
  }
}

```