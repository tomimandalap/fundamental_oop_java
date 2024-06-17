public class App {
  public static void main(String[] args) throws Exception {
    Shape shape = new Shape();
    System.out.println("Shape: " + shape.getCorner());

    Rectangle rectangle = new Rectangle();
    System.out.println("Rectangle: " + rectangle.getCorner());
    System.out.println("GetParentCorner: " + rectangle.getParentCorner());

    rectangle.getText();
  }
}
