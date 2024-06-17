# 02 Method

- Selain menambahakan field. kita juga dapat menambahkan method ke object
- cara dengan mendeklarasikan method tersebut di dalam block class
- sama seperti method biasanya, kita juga dapat menambhakan return value, parameter dan method overloading di method yang ada di dalam block class
- untuk mengakses method tersebut, kita bisa menggunakan tanda titik (.) dan diikuti dengan nama methodnya. Sama seperti mengakses field

```
~/src/Person.java

class Person {
  String name;
  String address;
  final String country = "Indonesia";

  void sayHello(String paramName) {
    System.out.println("Hello " + paramName + ", My name is " + name);
  }
}
```

```
~/src/App.java

public class App {
  public static void main(String[] args) throws Exception {
    Person person = new Person();
    person.name = "Tomi Mandala Putra";
    person.address = "Jl. Kenagan";
    person.sayHello("Jhony");
  }
}

```