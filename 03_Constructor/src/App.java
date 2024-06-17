public class App {
  public static void main(String[] args) throws Exception {
    // Contructor
    Person person1 = new Person("Tomi Mandala Putra", "Jl. Kenangan");
    person1.sayHello("Joko");

    /*
     * Constructor overloading examples
     */

    var person2 = new Person("Tono");
    person2.address = "Jl. Merdeka";
    person2.sayHello("Budi");

    Person person3;
    person3 = new Person();
    person3.name = "Koko";
    person3.address = "Jl. Sudirman";
    person3.sayHello("Putri");
  }
}
