package Initials;

//This is a program for arralists in arraylists
import java.util.*;

public class MultipleArrayLists {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        java.util.ArrayList<java.util.ArrayList<Integer>> list = new java.util.ArrayList<>();
        System.out.print("Enter the number of rows: ");
        int m = in.nextInt();
        System.out.print("Enter the number of columns: ");
        int n = in.nextInt();
        // Initialisation:
        for (int i = 0; i < m; i++) {
            list.add(new java.util.ArrayList<>());
        }
        // Adding Elements
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                list.get(i).add(in.nextInt());
            }
        }
        System.out.println("The 2D ArrayList is " + list);
        in.close();
    }
}
