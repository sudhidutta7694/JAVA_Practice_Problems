package Initials;
import java.util.Arrays;

public class searchIn2DArray {

  public static void main(String[] Args) {
    int[][] arr = { { 12, 26, 87 }, { 45, 89, 27, 83 }, { 72 } };
    int element = 27;
    int[] index = searchIndex(element, arr);
    System.out.println(
      "The index of " + element + " in " + Arrays.toString(index)
    );
  }

  static int[] searchIndex(int element, int[][] arr) {
    for (int i = 0; i < arr.length; i++) {
      for (int j = 0; j < arr[i].length; j++) {
        if (arr[i][j] == element) return new int[] { i, j };
      }
    }
    return new int[] { -1, -1 };
  }
}
