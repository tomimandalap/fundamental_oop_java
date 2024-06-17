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