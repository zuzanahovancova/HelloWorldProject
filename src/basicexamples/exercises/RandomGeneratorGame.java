package basicexamples.exercises;

import java.util.Random;
import java.util.Scanner;
// Generator nahodnych cisel od 1-10. Uzivatel hada cislo,ktore vymysli pocitac.
// Vytvorte program, kde Java vygeneruje náhodné číslo od 1 do 10.
// Používateľ musí uhádnuť číslo. Ak uhádne menšie, tak mu Java vypíše
// Neuhádol si, moje číslo je menšie,  analogicky Neuhádol si, moje číslo je
// väčšie a pri úspešnom uhádnutí BINGO! Uhádol si!
public class RandomGeneratorGame {
    public static void main(String[] args) {

        //START Generator nahodnych cisel od min do max
       /* int min = 100;
        int max = 110;
        int range = (max - min) +1;
        int randomValue = (int) (Math.random() * range + min);*/
        //END Generator nahodnych cisel od min do max

     /*   double min = 1;
        double max = 10;
        double randomValue = Math.random() * ;
        System.out.println(randomValue);*/

        // Vygeneruj číslo od 105 do 183
        int min = 1;
        int max = 10;
        int range = (max - min) + 1;
        Random randomObject = new Random();
        int randomValue = randomObject.nextInt(range) + min; //vygeneruje číslo od 0 do 9 ako int

        System.out.println("Toto je náhodne vygenerované číslo " + randomValue);

        System.out.println("Ahoj, ja som umelá inteligencia :), myslím si číslo od 1 do 10. Skús ho uhádnuť!");

        int inuptUserNumber = 0;
        //START  cyklus s podmienkou je príkaz while (podmienka kým nie je splnená) {ďalšie príkazy}
        while (inuptUserNumber != randomValue) {
            System.out.println("Zadaj číslo:");

            Scanner scn = new Scanner(System.in); //Trieda Scanner sluzi na uzivatelsky vstup. System.in priamo na vstup z konzoly (okna Run)
            // alebo Scanner objectScanner namiesto scn
            inuptUserNumber = scn.nextInt(); //Priamy uzivatelsky vstup,vyzaduje ine cislo

            if (inuptUserNumber > randomValue) {
                System.out.println("Neuhádol si. Moje číslo je menšie.");
            } else if (inuptUserNumber < randomValue) {
                System.out.println("Neuhádol si. Moje číslo je väčšíe.");
            } else {
                System.out.println("Bingo! Uhádol si!");

            }

        }
        // END cyklus s podmienkou
    }
}
