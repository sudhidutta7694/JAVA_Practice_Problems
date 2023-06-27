package Initials;
import java.util.*;

class Solution {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input: ");
        String input = in.next();
        int size = dataTypeSize(input);
        System.out.println("Output: " + size);
        in.close();
    }

    static int dataTypeSize(String str) {
        // code here
        if (str.equals("Character"))
            return (Character.SIZE) / 16;
        else if (str.equals("Integer"))
            return (Integer.SIZE) / 8;
        else if (str.equals("Long"))
            return (Long.SIZE) / 8;
        else if (str.equals("Float"))
            return (Float.SIZE) / 8;
        else if (str.equals("Double"))
            return (Double.SIZE) / 8;
        else
            return 0;
    }
}