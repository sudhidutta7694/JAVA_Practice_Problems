

public class RotationNumber {
    public static void main(String[] args) {
        int[] arr = { -1, -1, 0, 5, 30 , 35, -1};
        int pivotIndex = searchPivot(arr);
        if (Timesrotated(arr, pivotIndex)[0] != 0) System.out.print("The array has been rotated " + Timesrotated(arr, pivotIndex)[0] + ((Timesrotated(arr, pivotIndex)[0] == -1) ? " times in clockwise" : " times in anti-clockwise") + " direction.");
        else System.out.println("The array has not been rotated at all");
    }
    private static int[] Timesrotated(int[] arr, int pivotIndex) {
        int n[] = {0, 0};
        int start = 0;
        int end = arr.length - 1;
        if ( (pivotIndex - start) > (end - pivotIndex) ){ n[0] = (end - pivotIndex); n[1] = -1;}
        else{ n[0] = (pivotIndex - start) + 1; n[1] = 1;}
        return n;
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
}