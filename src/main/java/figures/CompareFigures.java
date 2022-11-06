package figures;

import java.util.Comparator;

public class CompareFigures implements Comparator<Figures> {

  @Override
  public int compare(Figures o1, Figures o2) {
    return (int) (o1.area()-o2.area());
  }
}
