package basicexamples.exercises;

import basicexamples.exercises.model.Zamestnanec;

public class ZamestnanciEvidencia {
    public static void main(String[] args) {
        Zamestnanec zamestnanec1 = new Zamestnanec();
        zamestnanec1.setMeno("Ján");
        zamestnanec1.setPriezvisko("Žitniak");
        zamestnanec1.setPohlavie('m');
        zamestnanec1.setRokNarodenia(2000);

        Zamestnanec zamestnanec2 = new Zamestnanec("Ivan","Mrkvička",'m',2005);//vytvorenie objektu priamym naplnenim,
        System.out.println("\n");

        System.out.println("Všetky údaje 2. zamestnanca cez toString()");
        System.out.println(zamestnanec2);
    }
}
