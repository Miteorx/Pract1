import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

import figures.Ball;
import figures.Cube;
import figures.Cylinder;
import figures.Figures;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.junit.Test;

public class Task3Tests {

  @Test
  public void correctlyWorkTesting() {
    Ball ball = new Ball(3);
    Cube cube = new Cube(3);
    Cylinder cylinder = new Cylinder(3, 3);
    List<Figures> figuresList = Arrays.asList(ball, cube, cylinder);

    List<Figures> expected = Arrays.asList(cube,cylinder, ball);
    List<Figures> result = Task3.sortFigures(figuresList);

    assertEquals(expected,result);
  }

  @Test
  public void nullTesting(){
    List<Figures> result = Task3.sortFigures(null);

    assertNull(result);
  }
  @Test
  public void emptyListTesting(){
    List<Figures> result = Task3.sortFigures(new ArrayList<>());

    assertNull(result);
  }

}
