/**
 * Author: Emirhan Bekmez
 * Date: 28.04.2022
 * Version: 0.1
 **/

public class Main {
    public static void main(String[] args) {
        int[] werte={1, 3, 7, 5, 5, 7, 3, 1};
        Util.headLine("PALINDROME CHECK", "*");

        boolean check= Palindrome.isPalindrome(werte);
        System.out.println("\nIst Palindrom " + check);
    }
}


