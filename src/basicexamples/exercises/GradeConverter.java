package basicexamples.exercises;

import java.util.Scanner;

public class GradeConverter {
    public static void main(String[] args) {
        System.out.println("Vyber známku (napr. výborný, chválitebný, dobrý, dostatočný, nedostatočný.)");
        Scanner scn = new Scanner(System.in);
        String gradeAsText = scn.nextLine();

        System.out.println("Napísal si známku " + gradeAsText);

        if (gradeAsText .equals ("výborný"))
            System.out.println("1");
        else if (gradeAsText.equals("chválitebný"))
            System.out.println("2");
        else if (gradeAsText.equals("dobrý"))
            System.out.println("3");
        else if (gradeAsText.equals("dostatočný"))
            System.out.println("4");
        else if (gradeAsText.equals("nedostatočný"))
            System.out.println("5");
        else
        System.out.println("Nezadal si slovnú známku správne!");

    }
}
