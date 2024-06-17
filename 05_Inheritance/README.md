# 05 Inheritance

- Inheritance atau disebut juga dengan pewarisan merupakan kemampuan untuk menurunkan sebuah class ke class lain
- dalam hal ini, kita dapat membuat class Parent dan class Child
- Class Child, hanya bisa memiliki satu keals Parent, namin satu class Parent bisa mempunyai banyak class Child
- Saat sebuah class diturunkan, maka semua field dan method yang ada di scope class Parent, secara otomatis akan dimiliki oleh class Childnya
- Untuk melakukan pewarisa, di class Child, kita harus menggunakan kata kunci extends lalu diikuti dengan nama class parentnya

```
~/src/Manager.java

class Manager {
  String name;

  void sayHello(String name) {
    System.out.println("Hello " + name + ", My name is " + this.name);
  }
}

```

```
~/src/VicePresident.java

class VicePresident extends Manager {

}
```

```
~/src/App.java

public class App {
  public static void main(String[] args) throws Exception {
    Manager manager = new Manager();
    manager.name = "Tomi";
    manager.sayHello("Joko");

    var vicePresident = new VicePresident();
    vicePresident.name = "Putra";
    vicePresident.sayHello("Budi");
  }
}

```

## Method Overriding

- Method overriding merupakan kemampuan mendeklarasikan ulang method di child class, yang sudah ada di class parent
- Saat kita melakukan proses overriding tersebut, secara otomatis ketika kita membuat object dari class child, method yang di class parent tidak dapat diakses kembali

```
~/src/Manager.java

class Manager {
  String name;

  void sayHello(String name) {
    System.out.println("Hello " + name + ", My name is " + this.name + " position level manager");
  }
}

```

```
~/src/VicePresident.java

class VicePresident extends Manager {
  void sayHello(String name) {
    System.out.println("Hello " + name + ", My name is " + this.name + " position level VP");
  }
}
```

```
~/src/App.java

public class App {
  public static void main(String[] args) throws Exception {
    Manager manager = new Manager();
    manager.name = "Tomi";
    manager.sayHello("Joko");

    var vicePresident = new VicePresident();
    vicePresident.name = "Putra";
    vicePresident.sayHello("Budi"); // output method overriding
  }
}

```