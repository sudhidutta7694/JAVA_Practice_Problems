package Initials;
// import java.util.*;

// public class MulipleArrays {
//     public static void main(String[] args) {
//         Scanner in = new Scanner(System.in);
//         int[][] arr = new int[2][2];
//         for (int i = 0; i < arr.length; i++) {
//             for (int j = 0; j < arr[i].length; j++) {
//                 int input = in.nextInt();
//                 arr[i][j] = input;
//             }
//         }
//         System.out.println("\nThe 2D array is ");
//         // Shortest Method to print a 2D array
//         for (int[] i : arr) {
//             System.out.print(Arrays.toString(i));
//         }
//         in.close();
//     }
// }

import java.util.Scanner;

public class MulipleArrays {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[][] arr = new int[3][3];
        System.out.println("Enter the elements of the 2D array:");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = in.nextInt();
            }
        }
        System.out.println("The 2D array is:");
        // Shortest Method to print a 2D array
        // for (int i = 0; i < arr.length; i++) {
        // System.out.print(Arrays.toString(arr[i]));
        // }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        in.close();
    }
}
