package basicexamples.test;

public class ArrayExample {

    public static void main(String[] args) {

        int [] values = {8, 7, 3, 2};
        //System.out.println(values[3]); //odkazujeme sa na poziciu (index) pola zapisuje nazovPola(index), pricom index zacina vzdy 0 a konci poctom prvkov -1

        //chceme vypisat vsetky hodnoty pola values EFEKTIVNE!!!

        for (int i = 0; i <4; i++) {
            System.out.println(values[i]); //vypiseme obsah pola prostrednictvom kombinacie nazovPola[i]

        }
    }
}
