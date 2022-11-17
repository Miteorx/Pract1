package figures;

public class Cylinder implements Figures {

  private final int height;
  private final int radius;

  public Cylinder(int h, int radius) {
    this.height = h;
    this.radius = radius;
  }

  @Override
  public double getVolume() {
    return (2 * Math.PI * radius * height) + (2 * Math.PI * radius * radius);
  }
}
