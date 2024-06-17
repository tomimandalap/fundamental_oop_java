public class App {
  public static void main(String[] args) throws Exception {
    Manager manager = new Manager("Tomi");
    System.out.println("Name is: " + manager.name);

    VicePresident vicePresident = new VicePresident("Tono");
    vicePresident.sayHello("Budi");

    var vp = new VicePresident("Putra", "vice president");
    vp.getNameAndPosition("Joko");
  }
}
