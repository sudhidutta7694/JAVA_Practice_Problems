package Initials;

import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the no. of the day: ");
        int day = input.nextInt();
        //Normal Format:
        // switch(day) {
        //     case 2:
        //     case 3:
        //     case 4:
        //     case 5:
        //     case 6:
        //         System.out.println("It's a Weekday.");
        //         break;
        //     case 1:
        //     case 7:
        //         System.out.println("It's a Weekend.");
        //         break;
        //     default:
        //         System.out.println("Please enter a valid number.");
        // }
        //Enhanced Format:
        switch (day) {
           case 2, 3, 4, 5, 6 -> System.out.println("It's a Weekday.");
           case 1,7 -> System.out.println("It's a Weekend.");
           default -> System.out.println("Please enter a valid number.");
        }input.close();
    }
}
