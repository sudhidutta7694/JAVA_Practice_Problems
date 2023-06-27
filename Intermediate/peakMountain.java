
//This has a time complexity of O(log2(N))
public class peakMountain {
    public static void main(String[] args) {
        int[] arr = {13, 23, 83, 83, 822, 828, 2920, 2, -1};
        int max = peakSearch(arr);
        System.out.println("The maximum number in the array is " + arr[max] + " at index no." + max);
    }

    private static int peakSearch(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start != end) {
            int mid = start + (end - start)/2;
            if (arr[mid] > arr[mid + 1]) end = mid;
            else if (arr[mid] < arr[mid + 1]) start = mid + 1;
        }
        return start;
    }
}