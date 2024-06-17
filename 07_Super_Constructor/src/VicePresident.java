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
