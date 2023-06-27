package Initials;

import java.util.*;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of terms desired in the Fibonacci series: ");
        long terms = input.nextLong();
        long i=0, a=1,  b=1, c;
        System.out.print("The"+ terms + " terms of the Fibonacci Series are: 0, 1, "); 
        while (i<terms-2) {
            c = a + b;
            if (i<terms-3) 
            System.out.print(c + ", ");
            else
            System.out.print(c + ".");
            a = b;
            b = c;
            i++;
        }input.close();
    }
}
