import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;
import java.util.stream.Collectors;
import org.junit.Test;

public class Task2Tests {

  Task2 task2 = new Task2();

  @Test
  public void correctlyWorkTesting() {
    String[] testStrings = {"#hi i am hi #hi", "#hi", "#let #me #see #see #see", "#let", "#hi",
        "#a", "#b"};
    HashMap<String, Integer> temp = new HashMap<>();
    temp.put("#hi", 3);
    temp.put("#let", 2);
    temp.put("#see", 1);
    temp.put("#me", 1);
    temp.put("#a", 1);
    List<Entry<String, Integer>> expect = temp.entrySet().stream()
        .sorted((e1, e2) -> -e1.getValue().compareTo(e2.getValue()))
        .collect(Collectors.toList()).subList(0, 5);
    assertEquals(expect, task2.topFive(testStrings));
  }

  @Test
  public void justOneElementTesting() {
    String[] testStrings = {"#hi"};
    HashMap<String, Integer> temp = new HashMap<>();
    temp.put("#hi", 1);
    List<Entry<String, Integer>> expect = temp.entrySet().stream()
        .sorted((e1, e2) -> -e1.getValue().compareTo(e2.getValue()))
        .collect(Collectors.toList()).subList(0, 1);

    assertEquals(expect, task2.topFive(testStrings));

  }

  @Test
  public void nullTesting() {
    String[] testStrings = null;
    assertNull(task2.topFive(testStrings));
  }

  @Test
  public void emptyArrayTesting() {
    assertNull(task2.topFive(new String[]{}));
  }

}
