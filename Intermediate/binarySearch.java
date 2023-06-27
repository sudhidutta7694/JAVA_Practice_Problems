
import java.util.Arrays;

public class binarySearch {

  public static void main(String[] args) {
    // int[] arr = {
    //   Integer.MIN_VALUE,
    //   -2,
    //   0,
    //   0,
    //   2,
    //   35,
    //   38,
    //   289,
    //   943743,
    //   796996769,
    //   Integer.MAX_VALUE,
    // }; // Increasingly sorted array
    int arr2[] = { 2562, 739, 36, 8, 0, 0, -8, -33, -272, -8935 };
    int ele = 8;
    int index = search(ele, arr2);
    System.out.println(
      "The element, " +
      ele +
      " is present in the " +
      index +
      "th index of the array, " +
      Arrays.toString(arr2)
    );
  }

  static int search(int ele, int[] arr) {
    int start = 0;
    int end = arr.length - 1;
    while (start <= end) {
      int mid = start + (end - start) / 2;
      if (ele == arr[mid]) return mid;
      if (arr[start] < arr[end]) {
        if (ele < arr[mid]) end = mid - 1; else start = mid + 1;
      } else {
        if (ele > arr[mid]) end = mid - 1; else start = mid + 1;
      }
    }
    return -1;
  }
}
