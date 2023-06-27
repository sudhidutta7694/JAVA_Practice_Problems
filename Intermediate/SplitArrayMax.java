//This is a leet-code Hard question #Google Interview Question


//The task is to get the minimized sum of the sub-Array
public class SplitArrayMax {
    public static void main(String[] args) {
        int arr[] = {4, 23, 84, 849, 999, 2999, 3000}; //user-input
        int pieces = 2; //user-input

        System.out.println("The minimum sum of the desired sub-Array is " + splitArrayMax(arr, pieces));

    }

    //this method has a time-complexity of O(log(N))
    private static int splitArrayMax(int[] arr, int pieces) {
        int start = 0;
        int end = 0; 
        for (int i=0; i<arr.length; i++) {
            start = Math.max(start, arr[i]);//This becomes the maximum number of the array by the end of the loop
            end += arr[i]; //This becomes the sum of all the elements of the array by the end of the loop
        }

        //the breaking condition
        while (start < end) {
            int mid = start + (end - start)/2;
            int sum = 0;
            int m = 1; //Initial number of pieces that is the entire array

            for (int num : arr) {
                if (sum + num > mid ) {
                    //The number can no longer be added to the sub-Array
                    //Make a new sub-Array
                    sum = num;
                    m ++;
                }else { //keep on adding the number in the sub-Array
                    sum += num;
                }
            }

            if (pieces < m) {
                start = mid + 1;
            }else {
                end = mid;
            }
        }return start; //Since (start==end) = true
    }
}