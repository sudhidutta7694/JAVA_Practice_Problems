

//Flooring of a number means the greatest number smaller than the target
public class floorNumber {
    public static void main(String[] args) {
        int arr[] = {1, 35, 73, 93, 83736, 3637383, Integer.MAX_VALUE};
        int target = 90;
        int floor = floor(target, arr);
        System.out.println("The floor of " + target + " in the array is " + floor);
    }

    public static int floor(int target, int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        
        while (start <= end) {
            int mid = start + (end-start)/2;
            if (target == mid ) return mid;
            else if (target < arr[mid]) end = mid -1;
            else if (target > arr[mid]) start = mid + 1;
        }return arr[end];
    }
}
