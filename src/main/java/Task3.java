import figures.CompareFigures;
import figures.Figures;
import java.util.List;

public class Task3 {

  public static List<Figures> getSortedFiguresByVolume(List<Figures> figuresList) {
    if (figuresList == null || figuresList.size() == 0) {
      return null;
    }
    CompareFigures compareFigures = new CompareFigures();
    figuresList.sort(compareFigures);
    return figuresList;
  }
}
