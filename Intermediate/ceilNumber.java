
//Ceiling of a number means the smallest number greater than the target
public class ceilNumber {
    public static void main(String[] args) {
        int arr[] = {1, 35, 73, 93, 83736, 3637383, Integer.MAX_VALUE};
        int target = 90;
        int ceil = ceil(target, arr);
        System.out.println("The ceiling of " + target + " in the array is " + ceil);
    }

    public static int ceil(int target, int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        
        while (start <= end) {
            int mid = start + (end-start)/2;
            if (target == mid ) return mid;
            else if (target < arr[mid]) end = mid -1;
            else if (target > arr[mid]) start = mid + 1;
        }return arr[start];
    }
}
