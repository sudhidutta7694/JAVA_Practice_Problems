package Initials;

import java.util.Scanner;

public class Problem2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the temperature in C: ");
        float tempC = input.nextFloat();
        float tempF = (tempC * 9/5) + 32;
        System.out.println("The temperature in F is: " + tempF);
        input.close();
    }
}
