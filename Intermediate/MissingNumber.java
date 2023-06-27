
import java.util.Arrays;

public class MissingNumber {
    public static void main(String[] args) {
        int arr[] = {4, 3, 0, 1};
        int sortedArr[] = cyclicSort(arr);
        System.out.println("The missing number is: " + missingNumber(sortedArr));
    }

    static int missingNumber(int[] sortedArr) {
        for (int i = 0; i < sortedArr.length; i++) {
            if (sortedArr[i] != i) {
                return i;
            }
        }
        return sortedArr.length;
    }

    static int[] cyclicSort(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            int correct = arr[i];
            if (correct < arr.length && arr[correct] != arr[i]) {
                swap(arr, i, correct);
            } else {
                i++;
            }
        }
        return arr;
    }

    static void swap(int[] arr, int i, int correct) {
        int temp = arr[i];
        arr[i] = arr[correct];
        arr[correct] = temp;
    }
}
