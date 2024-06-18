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
