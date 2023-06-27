package Initials;

import java.util.Scanner;

public class Occurence {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        long number = input.nextLong();
        System.out.print("\nEnter the integer whose occurence is to be checked in " + number + ": ");
        int i = input.nextInt();
        int remain, count = 0;
        long numcopy = number;
        while (number!=0) {
            remain = (int)(number % 10);
            if (remain==i) count++;
            number /= 10;
        }System.out.println("\nThe occurence of " + i + " in " + numcopy + " is: " + count + " times.");
        input.close();
    }
}
