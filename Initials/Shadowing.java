package Initials;

// package Initials;

// import java.util.Scanner;

//Best Shadowing Example
/*
class Outer {
  int x = 10;

  void method() {
    int x = 20; // This variable shadows the outer x variable.
    System.out.println(x); // Prints 20
  }
}

public class Main {
  public static void main(String[] args) {
    Outer outer = new Outer();
    System.out.println(outer.x); // Prints 10
    outer.method(); // Prints 20
  }
}
 */

// public class Shadowing {
//     static float x = 428.934903f;
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);
//         System.out.print("Enter a floating point number: ");
//         float x = scanner.nextFloat();
//         System.out.println("The entered number in integral form is " + (int)(x)); //Here the previously defined x is being shadowed
//         scanner.close();
//         use(); //Previous number being reused
//     }
//     static void use() {//Function protytype
//         System.out.println("Here we are making reuse of the previosly entered number i.e. " + x);
//     }
// }


// package Initials

import java.util.*;

public class Shadowing{
    static int x = 20; //This is shadowed at line 33
    public static void main(String[] args) {
        System.out.println("x is " + x); //x is 20
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the new value for x: ");
        int x = scan.nextInt();
        System.out.println("x is " + x);//x is user-input integer (now 20 is hidden) //This is shadowed at line 39
        scan.close();
        print();
    }

    static void print() {
        System.out.println("x is " + x);//Now, again x is 20 (now user-input value is hidden)
    }
}