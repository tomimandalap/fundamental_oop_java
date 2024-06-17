# Super Consturctor

- Tidak hanya untuk mengakses field/method yang ada di class Parent, kata kunci ```super``` juga dapat digunakan untuk mengases contructor
- Namun syaratnya untuk mengakses constructor yang ada di class parent, dengan demikian kita dapat mengakses constructor tersebut ke dalam class child
- Jika sebuah class parent tidak memiliki contructor yang tidak ada parameternya (tidak memiliki default constructor), maka class child wajin mengakses constructor yang ada di class parent tersebut


### Example Default Constuctor

```
~/src/Manager.java

class Manager {
  String name;

  /*
   * default constructor
   */

  Manager() {
  }
}
```

```
~/src/VicePresident.java

class VicePresident extends Manager {
  /*
   * tidak perlu mendeklarasikan constructor
   */

  void sayHello(String name) {
    System.out.println("Hi " + name + ", My Name is " + this.name);
  }
}
```

```
~/src/App.java

public class App {
  public static void main(String[] args) throws Exception {
    Manager manager = new Manager();
    manager.name = "Tomi";
    System.out.println("Name is: " + manager.name);
    // output Name is: Tomi

    VicePresident vicePresident = new VicePresident();
    vicePresident.name = "Tono";
    vicePresident.sayHello("Budi");
    // output Hi Budi, My Name is Tono
  }
}
```


### Example Constuctor with parameter
```
~/src/Manager.java

class Manager {
  String name;

  Manager(String name) {
    this.name = name;
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
    System.out.println("Hi " + name + ", My Name is " + this.name);
  }
}
```

```
~/src/App.java

public class App {
  public static void main(String[] args) throws Exception {
    Manager manager = new Manager("Tomi");
    System.out.println("Name is: " + manager.name);
    // output Name is: Tomi

    VicePresident vicePresident = new VicePresident("Tono");
    vicePresident.sayHello("Budi");
    // output Hi Budi, My Name is Tono
  }
}
```


### Example Constuctor overloading with parameter
```
~/src/Manager.java

class Manager {
  String name;
  String position;

  /*
   * Constructor overloading parent
   */

  Manager(String name) {
    this.name = name;
  }

  Manager(String name, String position) {
    this.name = name;
    this.position = position;
  }
}
```

```
~/src/VicePresident.java

class VicePresident extends Manager {

  /*
   * Dibebaskan untuk membuat super constructor
   * berdasarkan constructor overloading yang ada di class parentnya
   * minimal satu constructor yang harus dipanggil di class childnya
   */

  VicePresident(String name) {
    super(name); // option 1 constructor
  }

  VicePresident(String name, String position) {
    super(name, position); // option 2 constructor
  }

  void sayHello(String name) {
    System.out.println("Hi " + name + ", My Name is " + this.name);
  }

  void getNameAndPosition(String name) {
    System.out.println("Hi " + name + ", My Name is " + this.name + ", last position is " + this.position);
  }
}
```

```
~/src/App.java

public class App {
  public static void main(String[] args) throws Exception {
    Manager manager = new Manager("Tomi");
    System.out.println("Name is: " + manager.name);
    // output Name is: Tomi

    VicePresident vicePresident = new VicePresident("Tono");
    vicePresident.sayHello("Budi");
    // output Hi Budi, My Name is Tono

    var vp = new VicePresident("Putra", "vice president");
    vp.getNameAndPosition("Joko");
    // Hi Joko, My Name is Putra, last position is vice president
  }
}
```