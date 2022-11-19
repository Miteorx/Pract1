package figures;

public class Cube implements Figures {

  private final int sideLength;

  public Cube(int side) {
    this.sideLength = side;
  }


  public double getVolume() {
    return Math.pow(sideLength, 3);
  }
}
