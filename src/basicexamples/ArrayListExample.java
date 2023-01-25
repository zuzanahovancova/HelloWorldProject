package basicexamples;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;


//ArrayListExample bude sluzit na pridavanie lubovolneho poctu knih a ich vypis
public class ArrayListExample {
    public static void main(String[] args) {
        ArrayList<String> poleKnih = new ArrayList<String>(); //vytvorili sme dynamicke pole s nazvom poleKnih

        String kniha1 = "Hobbit";
        String kniha2 = "Portret Doriana Greya";
        String kniha3 = "Motýľ";
        String kniha4 = "Učebnica jazyka Java";

        poleKnih.add(kniha1);
        poleKnih.add(kniha2);
        poleKnih.add(kniha3);
        poleKnih.add(kniha4);

        poleKnih.remove(2); //odstranenie poleKnih s indexom 2
        poleKnih.remove(0);

        Collections.sort(poleKnih); //Zoradime ArrayList poleKnih od A po Z

        //vypiseme knihu v poradi prvu,cize s indexom 0
        System.out.println("Prvá kniha v zozname");
        System.out.println("---------------");
        System.out.println(poleKnih.get(0));

        // vypiseme poslednu knihu v zozname,v dynamickom poli
        System.out.println("\nPosledná kniha v zozname");
        System.out.println("------------------");
        System.out.println(poleKnih.get(poleKnih.size()-1));

        System.out.println("\nVšetky vypísané poleKnih");
        System.out.println("------------------");

// prechadzame vsetkymi prvkami dynamickeho pola poleKnih
        for (int i = 0; i < poleKnih.size(); i++) {
            System.out.println(poleKnih.get(i));

        }
        System.out.println("\nVšetky vypísané poleKnih,SPOSOB c.2");
        System.out.println("------------------");

        //prechadzame vsetkymi prvkami dynamickeho pola poleKnih, SPOSOB c.2
        for (String kniha:poleKnih) {
            System.out.println(kniha);
        }
//Zadajte názvy kníh cez konzolu, kým používateľ nenapíše slovo koniec. Následne zoznam kníh vypíšeme.
// Používanie aplikácie: Používateľ spustí program s názvom ZadavanieKnih (InputBooks), ktorý používateľa vyzve na zadanie názvov kníh. Zároveň mu vypíše inštrukciu, že po zadaní slova koniec program zadávanie ukončí a následne vypíše zoznamu všetkých zadaných kníh.

        ArrayList <Integer> poleCiselNoh = new ArrayList<Integer>();

        Integer cisloNohy1 = 40; //int sa ako primitivny datovy typ nepouziva (ako napr. double,char...)...String nie je primit.datovy typ!!!
        Integer cisloNohy2 = 41;
        Integer cisloNohy3 = 42;

        poleCiselNoh.add(cisloNohy1);
        poleCiselNoh.add(cisloNohy2);
        poleCiselNoh.add(cisloNohy3);

        System.out.println("\nVšetky vypísané čísla nohy,SPOSOB 2");
        System.out.println("-----------------");
        //vypiseme vsetky cisla noh

        for (int i = 0; i < poleCiselNoh.size(); i++) {
            System.out.println("Zadané číslo nohy:" + poleCiselNoh.get(i));

        }
//Vypiseme vsetky cisla noh SPOSOB2

        for (int cisloNohy:poleCiselNoh) {
            System.out.println(cisloNohy);
            // for (Integer cisloNohy:poleCiselNoh)
            //System.out.println(cisloNohy);
        }

    }
}
