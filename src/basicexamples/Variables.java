package basicexamples;

public class Variables {
    public static void main(String[] args) {
        int myNum;
        myNum = 15;
        String name = "John";
        final double conversionRate = 30.126;
        float myFloatNum = 5.99f ;
        char myLetter = 'D';
        boolean myBool = true;

        System.out.println("Konverzný kurz Eur / Sk je " + conversionRate + " ku dňu 21.12.2022.");
        System.out.println("Moje meno je " + name);
        System.out.println("Vypisujem celé číslo " + myNum);
        System.out.println("Vypisujem desatinné číslo " + myFloatNum);
        System.out.println("Vypisujem písmeno, ktoré je toto: " + myLetter);
        System.out.println("A toto je hodnota typu boolean premennej myBool " + myBool);

        String firstName = "John";
        String lastName = "Doe";
        String fullName = firstName + lastName;
        System.out.println(fullName);

        int x = 5;
        int y = 6;
        int result = x + y;
        System.out.println("Výsledok súčtu je : " + result );

        // Zadanie : Vypis text Vysledok scitanie 3 premennych (a,b,c) je:
        // a k tomu vysledok tych 3 premennych.
        int a = 15;
        int b = 26;
        int c = 150;
        System.out.println("Výsledok sčítania 4 premenných (a=" + a +", b=" + b +" , c=" + c +") je: " + (a+b+c) );

        String cas = "16.30"; // cas skolenia sa moze menit, chcem o tom vcas informovat
        System.out.println( "Dnes o " + cas + " hod. zacal kurz Java Develop. Jun. .");

        String meno = "Ján";
        String priezvisko = "Žitniak";
        System.out.println("Meno zamestnanca je:" + meno + " " + priezvisko);




    }
}
