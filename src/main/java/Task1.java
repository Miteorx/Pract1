public class Task1 {

  public int[] positiveNumbers(int[] arr) {
    if (arr == null || arr.length == 0) {
      return null;
    }
    int length = 0;
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] >= 0) {
        length++;
      }
    }

    int[] returned = new int[length];
    for (int i = 0, j = 0; i < arr.length; i++) {
      if (arr[i] >= 0) {
        returned[j] = arr[i];
        j++;
      }
    }

    int temp;
    for (int i = 0; i < returned.length; i++) {
      for (int j = 1; j < (returned.length - i); j++) {
        if (returned[j - 1] < returned[j]) {
          temp = returned[j - 1];
          returned[j - 1] = returned[j];
          returned[j] = temp;
        }
      }
    }
    return returned;
  }
}
