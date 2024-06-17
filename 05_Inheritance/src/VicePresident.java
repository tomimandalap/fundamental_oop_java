class VicePresident extends Manager {
  /*
   * Method overriding
   */

  void sayHello(String name) {
    System.out.println("Hello " + name + ", My name is " + this.name + " position level VP");
  }
}
