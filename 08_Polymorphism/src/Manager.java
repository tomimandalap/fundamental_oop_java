class Manager extends Employee {
  Manager(String name) {
    super(name);
  }

  void sayHello(String name) {
    System.out.println("Hi " + name + ", My name is " + this.name + ". I'm Manager in ...");
  }
}
