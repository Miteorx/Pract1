import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertNull;

import org.junit.Test;

public class Task1Tests {

  Task1 task1 = new Task1();

  @Test
  public void correctlyWorkTesting() {
    int[] testArray = new int[]{-3, -5, 0, 5, 1, 2};
    int[] expect = new int[]{5, 2, 1, 0};
    int[] resultArray = task1.positiveNumbers(testArray);

    assertArrayEquals(expect, resultArray);
  }

  @Test
  public void nullTesting() {
    int[] testArray = null;
    int[] resultArray = task1.positiveNumbers(testArray);

    assertNull(resultArray);
  }

  @Test
  public void emptyArrayTesting() {
    int[] testArray = new int[0];
    int[] resultArray = task1.positiveNumbers(testArray);

    assertNull(resultArray);
  }


}
