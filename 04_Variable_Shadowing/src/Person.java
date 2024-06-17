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