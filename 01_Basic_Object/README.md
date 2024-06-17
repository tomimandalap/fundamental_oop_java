# 01 Basic OOP

## Membuat Object
- Object adalah hasil instansiasi dari sebuah class
- untuk membuat sebuah object kita dapat menggunakan kata kunci ```new```, dan diikuti dengan nama ```Class``` serta tanda kurung ```()```.


```
~/src/Person.java
class Person {};
```

```
~/src/PersonApp.java

public class App {
  public static void main(String[] args) throws Exception {
    var person1 = new Person();

    Person person2 = new Person();

    Person person3;
    person3 = new Person();

    System.out.println(person1); // Person@7ad041f3;
    System.out.println(person2); // Person@251a69d7;
    System.out.println(person3); // Person@7344699f;
  }
}

note: output dalam bentuk informasi uniq id posisi didalam memory.
```

## Field
- Fields/properties/attributes adalah data yang bisa kita sisipkan di dalam Object
- Namu sebelum kita dapat memasukan data di fields, kita harus mendeklarasikan data apa saja yang dimiliki object tersebut di dalam deklarasi classnya
- Membuat filed sama seperti membuat variable namun ditempakan di block class

```
~/src/Person.java
class Person {
  String name;
  String address;
  final String country = "Indonesia";
};
```

## Manipulasi Field 
- Fields yang ada di object, dapat dimanipulasi bergantung dengan final atau bukan
- Jika final, berarti filelds tidak data dapat diubah, tetapi jika tidak maka kita dapat megubah data fieldnya
- untuk memanipulasi data field, sama seperti cara pada variable
- untuk mengakses field kita butuh kata kunci titik (.) setalah nama object dan diikuti nama fieldsnya

```
~/src/PersonApp.java

public class App {
  public static void main(String[] args) throws Exception {
    var person = new Person(); // from object person
    person.name = "Tomi Mandala Putra";
    person.address = "Jl. Kenangan";
    // person.country = "Poland"; // error fianl cannot assigned 

    System.out.println(person.name); // Tomi Mandala Putra
    System.out.println(person.address); // Jl. Kenangan
    System.out.println(person.country); // Poland
  }
}

```