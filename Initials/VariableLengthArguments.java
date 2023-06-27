package Initials;
// package Initials;

import java.util.Arrays;

public class VariableLengthArguments {
    public static void main(String[] args) {
        fun(5,8,9,6,4);
    }

    static void fun(int ...num) { 
        System.out.println(Arrays.toString(num));
    }
    static void fun(String ...string) {
        System.out.println(string);
    }
}
