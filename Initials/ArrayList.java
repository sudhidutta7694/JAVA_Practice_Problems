package Initials;
import java.util.*;

public class ArrayList {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // Syntax:
        // ArrayList<Wrapper_Class> = new ArrayList<Wrapper_Class>(elements)
        java.util.ArrayList<Integer> list = new java.util.ArrayList<>();
        // Method to add elements
        System.out.print("Enter the no. of elements to be added in the arraylist: ");
        int n = in.nextInt(), ele;
        for (int i = 0; i < n; i++) {
            System.out.print("Enter the " + (i + 1) + "th element: ");
            ele = in.nextInt();
            list.add(ele);
        }
        // Printing an ArrayList
        System.out.println("The Arraylist is " + list);
        // Updating an Arraylist
        System.out.print("Do you want to update the ArrayList (y/n): ");
        char response = in.next().trim().charAt(0);
        if (response == 'y') {
            System.out.print("How many index(s) do you want to update? ");
            int t = in.nextInt();
            int[] responses = new int[t];
            System.out.print("Enter the index(s) which you want to update: ");
            for (int i = 0; i < t; i++) {
                responses[i] = in.nextInt();
            }
            int val;
            System.out.print("Enter the new value for the index(s): ");
            for (int i : responses) {
                val = in.nextInt();
                list.set(i, val); // ArrayList.set(index, value)
            }
        }
        System.out.println("The updated Arraylist is " + list);
        in.close();
    }
}
// Some Other ArrayList Methods are:
/*
 * (i) For checking if an element is present in an ArrayList:
 * ArrayList.contains(element)
 * (ii) For removing an element from a list:
 * ArrayList.remove(element)
 */