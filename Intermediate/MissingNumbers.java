//Google Interview Question
import java.util.ArrayList;

public class MissingNumbers {
    public static void main(String[] args) {
        int arr[] = {1, 1, 5, 2, 9, 9, 9, 7, 3};
        int sortedArr[] = cyclicSort(arr);
        System.out.println("The missing numbers are: " + missingNumbers(sortedArr));
    }

    static ArrayList<Integer> missingNumbers(int[] sortedArr) {
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        for (int i = 0; i < sortedArr.length; i++) {
            if (sortedArr[i] != i + 1) {
                numbers.add(i + 1);
            }
        }
        return numbers;
    }

    static int[] cyclicSort(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            int correct = arr[i] - 1;
            if (arr[correct] != arr[i]) {
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
