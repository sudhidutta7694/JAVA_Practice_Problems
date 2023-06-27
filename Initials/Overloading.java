package Initials;
// package Initials;

import java.util.*;

public class Overloading {
   public static void main(String[] args) {
      int a, b, c;
      Scanner scan = new Scanner(System.in);
      a = scan.nextInt();
      b = scan.nextInt();
      c = scan.nextInt();
      int result = add(a,b,c);
      result = add(a,b);
      System.out.println(result);
      scan.close();
   } 
   static int add(int a, int b, int c) {
      return a+b+c;
   }static int add(int a, int b) {
      return a+b;
   }
}
