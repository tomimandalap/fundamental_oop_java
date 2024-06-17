class Rectangle extends Shape {
  /*
   * method overriding
   */

  int getCorner() {
    return 4;
  }

  /*
   * Super keyword
   * untuk mengakses method gerCorner
   * yang ada di class Parent (Shape)
   */

  int getParentCorner() {
    return super.getCorner();
  }

  void getText() {
    System.out.println(super.wording);
  }
}
