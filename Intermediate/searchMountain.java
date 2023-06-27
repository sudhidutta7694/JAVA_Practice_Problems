

public class searchMountain {

  public static void main(String[] args) {
    int[] arr = { 13, 23, 83, 83, 822, 828, 2920, 2, -1 , 1};
    int target = 1;
    int peakIndex = peakSearch(arr);
    int targetIndex = -1;

    try {
      if (binarySearch(target, arr, 0, peakIndex) != -1) {
        targetIndex = binarySearch(target, arr, 0, peakIndex);
      } else if (binarySearch(target, arr, peakIndex + 1, arr.length) != -1) {
        targetIndex = binarySearch(target, arr, peakIndex + 1, arr.length);
      }
      if (targetIndex != -1) {
        System.out.println("The number " + target + " is found in the array at index " + targetIndex);
      } else {
        System.out.println("The number " + target + " is not found in the array.");
      }
    } catch (ArrayIndexOutOfBoundsException e) {
      System.out.println("The number " + target + " is not found in the array.");
    }
  }
  private static int peakSearch(int[] arr) {
    int beginning = 0;
    int end = arr.length - 1;

    while (beginning < end) {
      int mid = beginning + (end - beginning) / 2;
      if (arr[mid] > arr[mid + 1]) {
        end = mid;
      } else {
        beginning = mid + 1;
      }
    }

    return beginning;
  }

  private static int binarySearch(int target, int[] arr, int beginning, int end) {
    while (beginning <= end) {
      int mid = beginning + (end - beginning) / 2;
      if (target == arr[mid]) {
        return mid;
      } else if (target < arr[mid]) {
        end = mid - 1;
      } else {
        beginning = mid + 1;
      }
    }
    return -1; // target not found
  }
}