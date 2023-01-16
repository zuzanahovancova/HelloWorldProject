package basicexamples.homework;

import java.util.Scanner;
import static java.lang.Math.PI;

public class CreateMethod {
static double circumferenceOfCircle (double r) {
    return 2 * PI * r;
}
static double areaareaOfCircle (double r) {
        return PI * r * r;
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String text = "";

            System.out.println("Zadaj polomer kruhu:");

        if (scn.hasNextInt()) {
            double obvod = circumferenceOfCircle(scn.nextDouble());
            double obsah = areaareaOfCircle(scn.nextDouble());
            System.out.println("Obvod kruhu je: " + obvod);
            System.out.println("Obsah kruhu je: " + obsah);
        } else {
            text = scn.nextLine();
            System.out.println("Zadal si dajaky blud, skusaj esci daco");
            }

        }

}
