public class App {
  public static void main(String[] args) throws Exception {
    var person = new Person();
    person.name = "Tomi Mandala Putra";
    person.address = "Jl. Kenangan";
    // person.country = "Poland";

    System.out.println(person.name);
    System.out.println(person.address);
    System.out.println(person.country);
  }
}
