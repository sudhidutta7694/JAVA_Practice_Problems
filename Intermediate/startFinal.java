

import java.util.Arrays;
//This program finds the starting and ending position of a number
public class startFinal {

  public static void main(String[] args) {
    int arr[] = {
      -1,
      -1,
      1,
      35,
      35,
      35,
      73,
      93,
      93,
      83736,
      3637383,
      Integer.MAX_VALUE,
    };
    int target = 35;
    int occurences[] = startEnd(target, arr);
    System.out.println(
      "The required position values of " +
      target +
      " in the array are " +
      Arrays.toString(occurences)
    );
  }

  private static int[] startEnd(int target, int[] arr) {
    int[] res = { -1, -1 };
    res[0] = startEndSearch(target, arr, true);
    if (res[0] != -1) res[1] = startEndSearch(target, arr, false);
    return res;
  }

  private static int startEndSearch(
    int target,
    int[] arr,
    boolean findStartIndex
  ) {
    int ans = -1; // Set default answer as -1 to signify non-existence
    int start = 0;
    int end = arr.length - 1;

    while (start <= end) {
      int mid = start + (end - start) / 2;
      if (target < arr[mid]) end = mid - 1; else if (target > arr[mid]) start =
        mid + 1; else {
        // Possible answer found
        ans = mid;
        if (findStartIndex) end = mid - 1; else start = mid + 1;
      }
    }
    return ans;
  }
}
