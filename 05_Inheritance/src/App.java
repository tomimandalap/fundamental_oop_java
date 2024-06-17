public class App {
  public static void main(String[] args) throws Exception {
    Manager manager = new Manager();
    manager.name = "Tomi";
    manager.sayHello("Joko");

    var vicePresident = new VicePresident();
    vicePresident.name = "Putra";
    // vicePresident.sayHello("Budi", "Jl. Merdeka"); // overloading on method
    vicePresident.sayHello("Budi");
  }
}
