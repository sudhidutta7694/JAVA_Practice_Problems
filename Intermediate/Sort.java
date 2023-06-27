
import java.util.Arrays;

public class Sort {
    public static void main(String[] args) {
        int arr[] = {5, 6, 1, 4, 2, 3};
        // int sortedArr[] = bubbleSort(arr);
        // int sortedArr[] = selectionSort(arr);
        // int sortedArr[] = insertionSort(arr);
        int sortedArr[] = cyclicSort(arr);
        System.out.println("The sorted array is: " + Arrays.toString(sortedArr));
    }

    private static int[] cyclicSort(int[] arr) {
        int i = 0;
        while ( i< arr.length ) {
            int correctIndex = arr[i] - 1;
            if (arr[i] != arr[correctIndex]) swap(arr, correctIndex, i);
            else i++;
        }
        return arr;
    }

    // private static int[] insertionSort(int[] arr) {
    //     for (int i = 0; i < arr.length - 1; i++) {
    //         for (int j = i; j >= 0; j--) {
    //             if (arr[j] > arr[j + 1]) swap(arr, j, j + 1);
    //         }
    //     }
    //     return arr;
    // }

    // private static int[] selectionSort(int[] arr) {
    //     for (int i = 0; i <arr.length; i++) {
    //         int lastIndex = arr.length - i - 1;
    //         int maxIndex = maxIndex(arr, 0, lastIndex);

    //         swap(arr, lastIndex, maxIndex);
    //     }
    //     return arr;
    // }

    // private static int[] bubbleSort(int[] arr) {
    //     boolean swapped;
    //     for (int i = 0; i < arr.length - 1; i++) {  
    //         swapped = false;
    //         for (int j = 0; j < arr.length - i - 1; j++) {
    //             if (arr[j] > arr[j + 1]) {
    //                 int temp = arr[j];
    //                 arr[j] = arr[j + 1];
    //                 arr[j + 1] = temp;
    //                 swapped = true;
    //             }
    //         }
    //         if (!swapped) {
    //             break;
    //         }
    //     }
    //     return arr;
    // }


    private static void swap(int[] arr, int lastIndex, int maxIndex) {

        int temp = arr[lastIndex];
        arr[lastIndex] = arr[maxIndex];
        arr[maxIndex] = temp;
    }

    // private static int maxIndex(int[] arr, int start, int lastIndex) {
    //     int maxIndex = 0;
    //     for (int i = start; i <= lastIndex; i++) {
    //         if (arr[i] > arr[lastIndex]) {
    //             maxIndex = i;
    //         }
    //     }
    //     return maxIndex;
    // }
}

