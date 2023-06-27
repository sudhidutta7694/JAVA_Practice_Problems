package Initials;

import java.util.ArrayList;

public class maxWealth {

  public static void main(String[] args) {
    int bank[][] = {
      { 230200, 4300, 450440 },
      { 22177, 373734, 389699 },
      { 756892, 2622, 722821 },
    };
    ArrayList<Integer> wealth = new ArrayList<>();
    for (int[] person : bank) {
      wealth.add(wealth(person));
    }
    System.out.println("The maximum wealth is " + max(wealth));
  }

  static int max(ArrayList<Integer> wealth) {
    int max = Integer.MIN_VALUE;
    for (int i : wealth) {
      if (i > max) max = i;
    }
    return max;
  }

  static int wealth(int[] person) {
    int wealth = 0;
    for (int i : person) wealth += i;
    return wealth;
  }
}
