

import java.util.Arrays;

public class Binary2D {
    public static void main(String[] args) {
        int[][] arr = {
            {10, 20, 30, 40},
            {15, 25, 35, 45},
            {18, 36, 54},
            {20, 40, 60, 80, 100}
        };
        int target = 36;
        System.out.println("The index of the element " + target + " is " + Arrays.toString(search2D(arr, target)));
    }

    private static int[] search2D(int[][] arr, int target) {
        int r = 0;
        int c = arr[r].length -1;
        while (r < arr.length && c > 0) {
            if (arr[r][c] == target) {
                return new int[]{r, c};
            }else if (arr[r][c] < target) {
                r ++;
            }else c --;
            c = arr[r].length -1;
        }return new int[]{-1, -1};
    }
}
