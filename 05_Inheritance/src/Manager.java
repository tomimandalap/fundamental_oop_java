class Manager {
  String name;

  /*
   * Implementation method overloading on scope class
   */

  void sayHello(String name) {
    System.out.println("Hello " + name + ", My name is " + this.name + " position level manager");
  }

  void sayHello(String name, String address) {
    System.out.println("Hello " + name + ", My name is " + this.name + ". I'm live at " + address);
  }
}
