package basicexamples.homework;

import java.util.Scanner;
import static java.lang.Math.*;


public class Circle {
    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);

        while (true) {

            int myRadius;
            String text = "";

            System.out.println("Zadaj polomer kruhu");
            System.out.println("Ukončenie programu, zadaj slovo: koniec");

            if (scn.hasNextInt()) {
                myRadius = scn.nextInt();
                double circumferenceOfCircle = 2 * PI * myRadius;
                double areaOfCircle = PI * myRadius * myRadius;
                System.out.println("Obvod kruhu je: " + circumferenceOfCircle);
                System.out.println("Obsah kruhu je: " + areaOfCircle);
            } else {
                text = scn.nextLine();
                if (text.equals("koniec")) {
                    System.out.println("Zjavne ta uz nezaujimaju obvody ani obsahy kruhov. Serus.");
                    break;
                } else {
                    System.out.println("Zadal si dajaky blud, skusaj esci daco");
                }
            }
        }
    }
}