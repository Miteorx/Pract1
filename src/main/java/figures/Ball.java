package figures;

public class Ball implements Figures {

  private final int radius;

  public Ball(int radius) {
    this.radius = radius;
  }

  @Override
  public double getVolume() {
    return 4.0 / 3 * Math.PI * radius * radius * radius;
  }

}
