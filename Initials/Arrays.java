package Initials;
import java.util.*;

public class Arrays {
    public static void main(String[] args) {
        // Left Side: Declaration of reference variable in stack
        // Right Side: Initialisation of the object containing five primitive variables
        // in the heap
        // new results in the creation of an object
        /*
         * Points about Heap:
         * 1) The heap is not continuous in nature.
         * 2) The heap depends on the java virtual machine.
         * 3) It supports dynamic memory allocation.
         */

        int[] arr = new int[5];
        Scanner scan = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scan.nextInt();
        }
        scan.close();
        // Ways printing elements in an array
        // for loop:
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        } // for each loop:
        for (int num : arr) {
            System.out.print(num + " ");
        } // Arrays.toString() method:
        System.out.println(Arrays.toString(arr));

    }

    static char[] toString(int[] index) {
        return null;
    }
}
