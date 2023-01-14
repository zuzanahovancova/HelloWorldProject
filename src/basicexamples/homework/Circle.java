package basicexamples.homework;

import java.util.Scanner;
import static java.lang.Math.*;


public class Circle {
/*
//    static double circumference(double r) {
//
//        double PI = 3.1415;
//        double cir = 2*PI*r;
//        return cir;
    }
*/

    public static void main(String[] args) {


        Scanner scn = new Scanner(System.in);

        while (true) {

            System.out.println("Zadaj polomer kruhu");
            System.out.println("Ukončenie programu, zadaj slovo: koniec");
            int myRadius;
            String text = "";

            if(scn.hasNextInt()) {
                myRadius = scn.nextInt();
                double circumferenceOfCircle = 2 * PI * myRadius;
                double areaOfCircle = PI * myRadius * myRadius;
                System.out.println("Obvod kruhu je: " + circumferenceOfCircle);
                System.out.println("Obsah kruhu je: " + areaOfCircle);
            }
            else {
                text = scn.nextLine();
                if (text.equals("koniec")){
                    System.out.println("Zjavne ta uz nezaujimaju obvody ani obsahy kruhov. Serus.");
                    break;
                }
                else {
                    System.out.println("Zadal si dajaky blud, skusaj esci daco");
                        }
                    }
                }
            }


            //int myRadius = scn.nextInt();
            //double circumferenceOfCircle = 2 * PI * myRadius;
            //double areaOfCircle = PI * myRadius * myRadius;
            //double result = Math.round(circumferenceOfCircle*1000) /1000;


            //System.out.println("Obvod kruhu je: " + circumferenceOfCircle);
            //System.out.println("Obsah kruhu je: " + areaOfCircle);


            }



        /*double r = 5;
        double result = Math.round(circumference(r)) * 1000 / 1000.0;
        System.out.println("CircumferenceOfCircle = " + result);*/

            // Vytvorte program na výpočet obvodu a obsahu kruhu. Ako vypočítať obsah (nazvite premennú pre obsah nasledovne: areaOfCircle) a obvod kruhu (nazvite circumferenceOfCircle) nájdete na
            //https://www.calculat.org/sk/obsah-obvod/kruh.html
            //Pomôcka
            //Math.PI v triede java.lang.Math je statická konštanta reprezentujúce Ludolfovo číslo, hovorovo {π} (pí), v praxi môžeme použiť Math.PI pri násobení, napr takto:
            //twoTimesPI = Math.PI * 2;
            //https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/lang/Math.html#PI
            //Math.pow je metóda na výpočet mocniny.
            //https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/lang/Math.html#pow(double,double)
            //Popis programu
            //Program Circle bude od používateľa vyžadovať vstupnú hodnotu a to polomer kruhu, ktorý bude v centimetroch. Výsledkom bude obsah a obvod kruhu, ktorý vypíše používateľovi do “konzoly”. Program pôjde dovtedy, kým nezadáme slovo: koniec.
            //Hint:
            //Vzorec na výpočet obsahu kruhu je nasledujúci:
            //S = π.r²
            //Vzorec na výpočet obvodu kruhu je:
            //o = 2.p.r
            //Bonusová úloha: vytvorte metódy z daných vzorcoch.
        //}
    //}


