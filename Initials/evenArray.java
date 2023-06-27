package Initials;

import java.util.ArrayList;

public class evenArray {

  public static void main(String[] args) {
    int[] arr = { 24, 027, 79879, 732, 879, -2065, -265, -0, 8709, 0 };
    ArrayList<Integer> evenArr = new ArrayList<>();
    for (int i : arr) {
      if (count(i) % 2 == 0 && i != 0) {
        evenArr.add(i);
      }
    }
    System.out.println(
      "The array consisting of even digit numbers is " + evenArr
    );
  }

  static int count(int num) {
    int comp = -1 * num; //this is a check meant for negative numbers
    if (num < 0) return count(comp); 
    else if (num == 0) return 0;
    else {
        //Faster than 95% of java submissions in leet code
        return (int)(Math.log10(num) + 1); //Will learn about this in number systems
        //Faster than 16% of java submisions in leet code
    //   int count = 0;
    //   while (num > 0) {
    //     num = num / 10;
    //     count++;
    //   }
    //   return count;
    }
  }
}
