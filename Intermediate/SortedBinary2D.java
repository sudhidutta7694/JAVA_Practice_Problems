

import java.util.Arrays;

public class SortedBinary2D {
    public static void main(String[] args) {
        int[][] arr = { //User-Input
        {1, 2, 3},
        {4, 5, 6},
        {7, 8, 9}
        }; 
        int target = 6; //User-Input
        System.out.println("The target number is found in the increasingly sorted array at index " + Arrays.toString(search(target, arr)));
    }

    //This method has a time-complexity of (O[log(M)] + O[log(N)])
    private static int[] search(int target, int[][] arr) {

        int rows = arr.length;
        int cols = arr[0].length; //provided the array is non empty (Be Cautious!!!)

        //Check for empty array
        if (cols == 0) {
            return new int[]{-1, -1}; //default index
        }if (rows == 1) {
            return binarySearch(arr, target, 0, cols - 1, 0);
        }

        int rStart = 0; //Upper Bound for Binary Search
        int cMid = cols / 2;
        int rEnd = rows -1; //Lower Bound for Binary Search

        //Logic to reduce the array to only two rows
        while (rStart < (rEnd - 1)) {
            int rMid = rStart + (rEnd - rStart) / 2;
            if (target == arr[rMid][cMid]) return new int[]{rMid, cMid};
            else if (target > arr[rMid][cMid]) rStart = rMid;
            else rEnd = rMid;
        }

        //Now, array consists of two rows only

        //Check for the middle Column
        if (arr[rStart][cMid] == target) return new int[]{rStart, cMid};
        else if (arr[rEnd][cMid] == target) return new int[]{rEnd, cMid};

        //Consider checking the other four sections

        //1st Half
        if (target <= arr[rStart][cMid - 1]) return binarySearch(arr, target, 0, cMid - 1, rStart);

        //2nd Half
        if (target >= arr[rStart][cMid + 1] && target <= arr[rStart][cols -1]) return binarySearch(arr, target, cMid + 1, cols - 1, rStart);

        //3rd Half
        if (target <= arr[rEnd][cMid - 1]) return binarySearch(arr, target, 0, cMid - 1, rEnd);

        //4th Half
        if (target <= arr[rEnd][cMid + 1]) return binarySearch(arr, target, cMid + 1, cols - 1, rEnd);

        return new int[]{-1, -1};
    }

    //This method has a time-complexity of O[log(N)]
    private static int[] binarySearch(int[][] arr, int target, int cStart, int cEnd, int row) {
        while (cStart <= cEnd) {
            int cMid = cStart - (cEnd - cStart) / 2;
            if (target == arr[row][cMid]) return new int[]{row, cMid};
            else if (target < arr[row][cMid]) cEnd = cMid - 1;
            else cStart = cMid + 1;
        }
        return new int[]{-1, -1};
    }
    
}