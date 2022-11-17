package figures;

public class Cylinder implements Figures {

  private final int height;
  private final int radius;

  public Cylinder(int height, int radius) {
    this.height = height;
    this.radius = radius;
  }

  @Override
  public double getVolume() {
    return Math.PI * radius * radius * height;
  }
}
