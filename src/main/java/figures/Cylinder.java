package figures;

public class Cylinder implements Figures {

  private static final double Pi = 3.14d;
  private int h;
  private int radius;

  public Cylinder(int h, int radius) {
    this.h = h;
    this.radius = radius;
  }

  @Override
  public double area() {
    return 2 * Pi * radius * (h + radius);
  }
}
