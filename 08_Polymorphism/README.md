# 08 Polymorphism OOP

- Polimorphism adalah kemampuan sebuah object berubah bentuk menjadi bentuk lain
- Polymorphism erat hubungannya dengan Inheritance

```
~/src/Employee.java

class Employee {
  String name;

  Employee(String name) {
    this.name = name;
  }

  void sayHello(String name) {
    System.out.println("Hi " + name + ", My name is " + this.name + ". I'm Employee in ...");
  }
}
```

```
~/src/Manager.java

class Manager extends Employee {
  Manager(String name) {
    super(name);
  }

  void sayHello(String name) {
    System.out.println("Hi " + name + ", My name is " + this.name + ". I'm Manager in ...");
  }
}
```

```
~/src/VicePresident.java

class VicePresident extends Manager {
  VicePresident(String name) {
    super(name);
  }

  void sayHello(String name) {
    System.out.println("Hi " + name + ", My name is " + this.name + ". I'm Vice President in ...");
  }

  void getGreeting() {
    System.out.println("Hello World");
  }
}
```

```
~/src/App.java

public class App {
  public static void main(String[] args) throws Exception {
    Employee employee = new Employee("Tomi");
    employee.sayHello("Budi");

    // output Hi Budi, My name is Tomi

    employee = new Manager("Toto");
    employee.sayHello("Rara");

    // output Hi Rara, My name is Toto

    employee = new VicePresident("Putra");
    employee.sayHello("Putri");

    // output = Hi Putri, My name is Putra
  }
}
```

## Conclustion

- Untuk case code di atas, dapat dilihat bahwa polymorphism berkaitan erat dengan inheritance dimana class Employee akan menurunkan field/method terhapat class Manager maupun VicePresident.

- Lalu apakah polymorphism ini dapat mengakses field/method yang ada di Class childnya? untuk kondisi field/method yang diwariskan (inheritance) maupun saat kondisi dengan method overriding di class child tentunya masih dapat diakses, tetapi tidak berlaku untuk field/method yang hanya dideklarasikan di class childnya. Hal ini sangat berkaitan dengan type data variable saat pembuatan objectnya. Sebagai contohnya

```
~/src/VicePresident.java

class VicePresident extends Manager {
  ...

  void getGreeting() {
    System.out.println("Hello World");
  }
}
```

Method ```getGreeting``` yang ada di class VicePresident tidak dapat dijalankan atau dipanggil di object class parent maupun turunan class childnya selama type datanya undefined. Seperti berikut

```
~/src/App.java

public class App {
  public static void main(String[] args) throws Exception {
    Employee employee = new Employee("Tomi"); // dari sini define type Employee yang dimaksud
    employee.sayHello("Budi");

    // output Hi Budi, My name is Tomi

    employee = new Manager("Toto");
    employee.sayHello("Rara");

    // output Hi Rara, My name is Toto

    employee = new VicePresident("Putra");
    employee.sayHello("Putri");

    // output = Hi Putri, My name is Putra

    // employee.getGreeting(); 

    /*
     * Akan muncul error 
     * The method getGreeting() is undefined for the type Employee
     * Solusinya harus memanggil object sesuai dengan define type class dan turunannya
     */

    VicePresident vp = new VicePresident("Putra");
    vp.getGreeting();

    // output Hello World
  }
}
```


## Polymorphism sebagai parameter di Method

- Polymorphism juga dapat digunakan sebagai parameter di sebuah method, yang berlaku dengan class turunanya (inheritance) dari define type class parent.

```
public class App {
  public static void main(String[] args) throws Exception {
    ...

   /*
     * Dengan adanya polymophism membantu
     * kita dalam merubah sebuah object ke dalam bentuk object lain.
     * seperti pada static method yang didefine dengan type Employee (class parent)
     * maka method tersebut dapat digunakan secara berulang
     * meski bentuk object turunan berbuah ubah;
     */

    sayHello(new Employee("Tomi")); // Hello Tomi
    sayHello(new Manager("Toto")); // Hello Toto
    sayHello(new VicePresident("Putra")); Hello Putra
  }

  // method static 
  static void sayHello(Employee employee) {
    System.out.println("Hello " + employee.name);
  }
}
```