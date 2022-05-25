/**
 * Author: Emirhan Bekmez
 * Date: 28.04.2022
 * Version: 0.1
 **/

public class Util {

    /** Methode für die Überschrift */
    public static void headLine(String text, String zeichen){
        String starsLine ="";
        String space =" ";

        for (int i = 0; i < text.length()+20; i++) {
            starsLine = starsLine + zeichen;
        }
        System.out.println(starsLine);

        for (int i = 0; i < (starsLine.length() - text.length())/2 ; i++) {
            System.out.print(space);
        }

        System.out.println(text);
        System.out.println(starsLine);
    }
}

