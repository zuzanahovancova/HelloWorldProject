package basicexamples.exercises;

import java.util.ArrayList;
import java.util.Scanner;

/*Vytvorte dynamicke pole (prostredníctvom ArrayList), ktorý od používateľa bude žiadať zadanie číselných hodnôt, ktoré budeme do dynamického poľa pridávať. Tento vstup bude “nekonečný”, kým nezadáme záporné číslo.
        Výstupom bude výpis všetkých čísel, ktoré sme v konzole (ArrayListe) zadali.
        Dodatočná úloha: Sčítanie všetkých hodnôt, ktoré používateľ v konzole zadal.*/
public class InputValuesIntoDynamicArray {
    public static void main(String[] args) {

        int hodnota = 0;

        ArrayList zadaneHodnoty = new ArrayList(); //vytvaram dynamicke pole

        Scanner scn = new Scanner(System.in);

        System.out.println("Zadaj akékoľvek kladné čísla. Pri zadaní záporného (napr. -1) aplikácia skončí.");

        // chceme aby apl. od pouzivatela ziadala zadavanie "nekonecneho" mnozstva hodnot, kym nezada zaporne cislo
        while (hodnota >= 0) {
            hodnota = scn.nextInt(); //jedna hodnota zadana pouzivatelom
            zadaneHodnoty.add(hodnota); // a tu hodnotu vlozime do dznamickeho pola
        }

        // Uloha c.1: V tomto mieste chceme vypisat vsetky zadane kladne cisla
        for (int i = 0; i <zadaneHodnoty.size(); i++) {
            System.out.println(zadaneHodnoty.get(i));

        }

        // Uloha c.2 : Chceme scitat vsetky kladne cisla a vypisat vysledok.

        int sum = 0;
        for (int i = 0; i < zadaneHodnoty.size()-1; i++) {
            sum = sum + (int)zadaneHodnoty.get(i);
        }
        System.out.println("Sumár všetkých hodnôt je:" + sum);
    /*
        while (true) {
            hodnota = scn.nextInt(); //realna vstupna hodnota od pouzivatela,ktoru vlozime do premennej hodnota
            if (hodnota < 0)             //ak je hodnota vo hodnota mensia ako , cize zaporna,tak cyklus,teda zadavanie prerusime
                break;*/
    }

    }
