# 06 Super Keyword

- Kadang kita ingin mengakses field/method yang terdapat di class parent yang sudah terlanjut kita overriding di class child
- Lalu bagaimana cara mengakses method class parentnya? jawabanya tentu kita dapat menggunakan kata kunci ```super``` didalam scope class childnya
- Sederhananya jika kata kunci ```this``` berfungsi untuk mengakses si object itu sendiri, sedangkan kata kunci ```super``` ini digunakan untuk mengakses si class parentnya
- Tidak hanya method, field milik class parent dapat diakses menggukan kata kunci super tersebut
- Kapan kira-kira kita menggunakan kata kunci super? Ketika mendapatkan case variable shadowing di class childnya

```
~/src/Shape.java

class Shape {
  int valueShape = 0;
  final String wording = "Hello World";

  int getCorner() {
    return this.valueShape;
  }
}
```

```
~/src/Rectangle.java

class Rectangle extends Shape {
  /*
   * method overriding
   */

  int getCorner() {
    return 4;
  }

  /*
   * Super keyword
   * untuk mengakses method gerCorner
   * yang ada di class Parent (Shape)
   */

  int getParentCorner() {
    return super.getCorner();
  }

  void getText() {
    System.out.println(super.wording);
  }
}

```

```
~/src/App.java

public class App {
  public static void main(String[] args) throws Exception {
    Shape shape = new Shape();
    System.out.println("Shape: " + shape.getCorner());
    // output Shape: 0

    Rectangle rectangle = new Rectangle();
    System.out.println("Rectangle: " + rectangle.getCorner());
    // output Rectangle: 4

    System.out.println("GetParentCorner: " + rectangle.getParentCorner());
    // output GetParentCorner: 0

    rectangle.getText();
    // output Hello World
  }
}
```
