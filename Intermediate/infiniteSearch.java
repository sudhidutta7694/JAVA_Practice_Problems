//This is an Amazon Interveiw question (***)

//Code to search for a number in an infinite array (having a complexity of O(log2(N)))
public class infiniteSearch {
    public static void main(String[] args) {
        int[] arr = {-51, -12, 0, 25, 50, 50, 597, 6237, 95675};
        int target = 50;
        System.out.println("The index of " + target + " in the array is " + search(target, arr));
    }

    public static int search(int target, int[] arr) {
        //This is the current box, here, boxSize is 2
        int start = 0;
        int end = 1;

        while (target > arr[end]) {
            int newStart = end + 1;
            // Formula for box-size: (end - start + 1)
            int boxSize = (end - start + 1);
            end += boxSize * 2; //This has O(log2(N)) complexity
            start = newStart;
        }
        return binarySearch(target, arr, start, end);
    }

    public static int binarySearch(int target, int[] arr, int start, int end) {
        int ans = -1; //default index if target not found
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target > arr[mid]) start = mid + 1;
            else if (target < arr[mid]) end = mid -1;
            else {
                ans = mid;
                break; // Terminate the loop when target is found
            }
        }
        return ans;
    }
}