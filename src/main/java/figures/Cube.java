package figures;

public class Cube implements Figures {

  private int a, b, c;

  public Cube(int a, int b, int c) {
    this.a = a;
    this.b = b;
    this.c = c;
  }


  public double area() {
    return a * b * c;
  }
}
