package Initials;
public class minIn2DArray {
    public static void main(String[] args) {
        int[][] arr = {
            {5,9,2},
            {4,34},
            {90,45,765,6},
            {9,0}
        };
        int min = min(arr);
        System.out.println("The minimum in the 2D Array is " + min);
    }

    static int min(int[][] arr) {
        int min = Integer.MAX_VALUE;
        for (int[] i : arr) {
            for (int j : i) {
                if (j < min) min = j;
            }
        }return min;
    }
}