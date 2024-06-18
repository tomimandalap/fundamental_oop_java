public class App {
  public static void main(String[] args) throws Exception {
    Employee employee = new Employee("Tomi");
    employee.sayHello("Budi");

    employee = new Manager("Toto");
    employee.sayHello("Rara");

    employee = new VicePresident("Putra");
    employee.sayHello("Putri");
    // employee.getGreeting();

    VicePresident vp = new VicePresident("Putra");
    vp.getGreeting();

    /*
     * Dengan adanya polymophism membantu
     * kita dalam merubah sebuah object ke dalam bentuk object lain.
     * seperti pada static method yang didefine dengan type Employee (class parent)
     * maka method tersebut dapat digunakan secara berulang
     * meski bentuk object turunan berbuah ubah;
     */

    sayHello(new Employee("Tomi"));
    sayHello(new Manager("Toto"));
    sayHello(new VicePresident("Putra"));
  }

  static void sayHello(Employee employee) {
    System.out.println("Hello " + employee.name);
  }
}
