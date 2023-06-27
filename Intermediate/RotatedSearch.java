

public class RotatedSearch {
    public static void main(String[] args) {
        int[] arr = {35, 35, 40, 45, 45, 45, 50, 55, 55, 55, -1, -1, 0, 5, 30 , 35};
        int target = 35;
        int pivotIndex = searchPivot(arr);
        int targetIndex = -1;

        try {
            if (binarySearch(target, arr, 0, pivotIndex) != -1) {
                targetIndex = binarySearch(target, arr, 0, pivotIndex);
            } else if (binarySearch(target, arr, pivotIndex + 1, arr.length - 1) != -1) {
                targetIndex = binarySearch(target, arr, pivotIndex + 1, arr.length - 1);
            }
            if (targetIndex != -1) {
                System.out.println("The number " + target + " is found in the array at index " + targetIndex);
            } else {
                System.out.println("The number " + target + " is not found in the array.");
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("The number " + target + " is not found in the array.");
        }
    }
    //(Improved): Supports Duplication of array elements
    private static int searchPivot(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start < end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] > arr[mid + 1]) {
                return mid;
            }
            if (arr[mid] < arr[mid - 1]) {
                return mid - 1;
            }
            if (arr[start] == arr[mid] || arr[mid] == arr[end]) {
                if (arr[end] <= arr[end - 1])
                    return end - 1;
                end--;
                if (arr[start] > arr[start + 1])
                    return start;
                start++;
            } else if (arr[start] < arr[mid] || (arr[mid] == arr[start] && arr[end] < arr[mid])) {
                start = mid + 1;
            }else {
                end = mid - 1;
            }
        }
        return -1;
    }

    private static int binarySearch(int target, int[] arr, int beginning, int end) {
        while (beginning <= end) {
            int mid = beginning + (end - beginning) / 2;
            if (target == arr[mid]) {
                return mid;
            } else if (target < arr[mid]) {
                end = mid - 1;
            } else {
                beginning = mid + 1;
            }
        }
        return -1; // target not found
    }
}
