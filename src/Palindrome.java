/**
 * Author: Emirhan Bekmez
 * Date: 28.04.2022
 * Version: 0.1
 **/

public class Palindrome {

    /** Überprüft die Elemente der Array auf Palindrom */
    public static boolean isPalindrome(int[] array) {
        for(int i = 0; i < array.length / 2; ++i) {
            ausgabe(array, i);
            if (array[i] != array[array.length - 1 - i]) {
                return false;
            }
        }
        return true;
    }

    /** Gibt die Elemente aus */
    private static void ausgabe(int[] array, int i) {
        System.out.print(array[i] + "=");
        System.out.print("=" + array[array.length - 1 - i] + ",");
    }
}