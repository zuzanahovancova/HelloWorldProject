package basicexamples.exercises;

import basicexamples.exercises.model.Kniha;
import basicexamples.exercises.model.KnihaSpravne;

import java.util.ArrayList;

public class Kniznica {
    public static void main(String[] args) {

        Kniha kniha1 = new Kniha(); //vytvorili sme premennu kniha1= (instancia alebo objekt) pomocou triedy Kniha
        Kniha kniha2 = new Kniha(); //vytvorili sme dalsiu knihu s nazvom kniha2

        //Toto funguje ale je to nespravy pristup k premennym fields,nemalo by sa to pouzivat!!! Kvoli bezpecnosti
        kniha1.nazov = "Ja,robot";
        kniha1.autor = "Isaac Asimov";
        kniha1.cena = 12.50;
        kniha1.rok = 1965;
        kniha1.obsah = "Kniha ohľadom robotiky.";
        kniha1.pocetStran = 230;
        kniha1.zaner = "SCI-FI";

        System.out.println("Názov knihy: " + kniha1.nazov);
        System.out.println("Autor: " + kniha1.autor);
        System.out.println("Rok: " + kniha1.rok);
        System.out.println("Cena: " + kniha1.cena);
        System.out.println("Obsah: " + kniha1.obsah);
        System.out.println("Počet strán: " + kniha1.pocetStran);
        System.out.println("Žáner: " + kniha1.zaner);

        kniha2.nazov = "Duna";
        kniha2.autor = "Frank Herbert";
        kniha2.rok = 1970;
        kniha2.zaner = "SCI-FI";

        System.out.println("Názov knihy: " + kniha2.nazov);
        System.out.println("Autor: " + kniha2.autor);
        System.out.println("Rok: " + kniha2.rok);
        System.out.println("Žáner: " + kniha2.zaner);
// nespravny pristup (kvoli bezpecnosti) az po tadial :))

        //Toto je SPRAVNY pristup
        KnihaSpravne knihaSpravne1 = new KnihaSpravne();
        knihaSpravne1.setNazov("Ja,robot");
        knihaSpravne1.setAutor("Isaac Asimov");
        knihaSpravne1.setZaner("SCI-FI");

        System.out.println("\n\nVypísanie knihy tak,ako by sa mala správne vypisovať.");
        System.out.println("Názov knihy: " + knihaSpravne1.getNazov());
        System.out.println("Autor knihy: " + knihaSpravne1.getAutor());
        System.out.println("Žáner: " + knihaSpravne1.getZaner());

        KnihaSpravne knihaSpravne2 = new KnihaSpravne();
        knihaSpravne2.setNazov("Ako správne žiť");
        knihaSpravne2.setAutor("James Holiday");

        //Vytvorenie zoznamu knih cez dynamicke pole (ArrayList)
        ArrayList<KnihaSpravne> zoznamKnihSpravne = new ArrayList<KnihaSpravne>(); //vytvorenie dynamickeho pola zoznamKnihSpravne
        zoznamKnihSpravne.add(knihaSpravne1); //naplnenie premennej zoznamKnihSpravne prvou knihou
        zoznamKnihSpravne.add(knihaSpravne2); //naplnenie premennej zoznamKnihSpravne druhou knihou

        //vypisanie niekolkych udajov z dynamickeho pola zoznamKnihSpravne
        System.out.println("\n\nVýpis kníh z dynamického poľa zoznamKnihSprávne");
        for (KnihaSpravne vystup:zoznamKnihSpravne){
            System.out.println("Názov knihy je: " + vystup.getNazov());
            System.out.println("Autor knihy je: " + vystup.getAutor());
            System.out.println("Žáner: " + vystup.getZaner());

        }

    }
}
