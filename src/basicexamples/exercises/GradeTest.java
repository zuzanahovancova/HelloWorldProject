package basicexamples.exercises;

import java.util.Scanner;

public class GradeTest {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in); // initialize console for input values by user
        System.out.println("Zadaj percento v teste: ");
        int percent = scn.nextInt(); //input value for percent is int

        if (percent > 90) {
            System.out.println("Dostal si známku A");
        } else if (percent > 75) {
            System.out.println("Dostal si známku B");
        } else if (percent > 65) {
            System.out.println("Dostal si známku C");
        } else if (percent > 51) {
            System.out.println("Dostal si známku D");
        } else {

            System.out.println("Dostal si známku F. Nespravil si test.");
        }
    }

}

