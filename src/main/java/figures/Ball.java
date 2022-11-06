package figures;

public class Ball implements Figures {

  private static final double Pi = 3.14d;
  private int radius;

  public Ball(int radius) {
    this.radius = radius;
  }

  @Override
  public double area() {
    return 4 * Pi * radius;
  }

}
