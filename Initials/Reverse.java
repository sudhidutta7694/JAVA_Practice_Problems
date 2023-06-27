package Initials;

import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a number: ");
        long num = scan.nextLong(), rev = 0;
        while (num>0) {
            rev += (num%10);
            num /= 10;
            rev *= 10;
        }rev /= 10;
        System.out.println("\nThe reverse of the number is " + rev);
        scan.close();
    }
}
