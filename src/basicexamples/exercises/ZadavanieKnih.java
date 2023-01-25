package basicexamples.exercises;
/* Zadajte názvy kníh cez konzolu, kým používateľ nenapíše slovo koniec. Následne zoznam kníh vypíšeme.
   Používanie aplikácie: Používateľ spustí program s názvom ZadavanieKnih (InputBooks), ktorý používateľa
   vyzve na zadanie názvov kníh. Zároveň mu vypíše inštrukciu, že po zadaní slova koniec program zadávanie
   ukončí a následne vypíše zoznamu všetkých zadaných kníh.*/

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ZadavanieKnih {
    public static void main(String[] args) {
        ArrayList<String> zoznamKnih = new ArrayList<String>();//inicializuje dynamicke pole ktore je prazdne

        Scanner scn = new Scanner(System.in);
        System.out.println("Zadaj názvy kníh. Názov potvrď klávesom ENTER. Príkaz ´koniec´ ukončí zadávanie.");

        // cyklus zacina tu
        while (true) { //nekonecny cyklus,funguje kym true

            String kniha = scn.nextLine(); //nextLine je pre String,cize text
            //System.out.println("Zadaná kniha je:" + kniha);
            if (kniha.toLowerCase().equals("koniec")) break; //ukonci cyklus,ked premenna kniha bude obsahovat slovo koniec
            zoznamKnih.add(kniha); //pridali sme knihu
        }
        Collections.sort(zoznamKnih); //zoznam knih je zoradeny abecedne
        //premenna zoznamKnih tu uz nie je dostupna (dostupna je len v cykle ("od zlozenej zatvorky po zlozenu v cykle while)
        //cyklus konci tu
        //vypis vsetkych knih
        for (String vystup : zoznamKnih) {
            System.out.println(vystup);
        }
        for (int i = 0; i < zoznamKnih.size(); i++) {
            System.out.println(zoznamKnih.get(i)); //vypiseme kazdu knihu cez jej index,cize get(i)
        }


    }
}