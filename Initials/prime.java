package Initials;
import java.util.*;

// public class prime {
//     public static void main(String[] args) {
//         Scanner scan = new Scanner(System.in);
//         int num = scan.nextInt();
//         boolean ans = isPrime(num);
//         boolean ans2 = isArmstrong(num);
//         System.out.println(ans+"\n"+ans2);
//         scan.close();
//     }static boolean isPrime(int num) {
//         if (num<=1) return false;
//         else {
//             int c = 2;
//             while (c*c <= num) {
//                 if (num%c == 0) return false;
//                 c++;
//             }
//         }
//         return true;
//     }static boolean isArmstrong(int num) {
//         int sum = 0, rem, num2=num;
//         while (num2>0) {
//             rem = num2%10;
//             sum += rem*rem*rem;
//             num2 /= 10;
//         }if (num==sum) return true;
//         else return false;
//     }
// }

//Least Space Complexity Method (deals with only the square root of the total cases)

public class prime{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a desired number: ");
        int num = input.nextInt();
        if (checkPrime(num)) System.out.print( num + " is a prime number."); 
        else System.out.println(num + " is not a prime number.");
        input.close();
    }
    static boolean checkPrime(int num) {
        if (num <= 1) return false;
        int c = 2;
        while (c*c <= num) {
            if (num%c == 0) return false;
            c++;
        }return (c*c > num);
    }
}