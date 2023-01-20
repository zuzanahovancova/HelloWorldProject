package basicexamples.exercises;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ExcelBasicFormulas {

    public static double getSum(double[] values) {
        //tu musi byt logika vypoctu
        double sum = 0;
        for (int i = 0; i < values.length; i++) { // cyklus s pevnym poctom opakovani, i nadobuda hodnoty od 0 do 3
            sum = sum + values[i]; // Java interpretuje tento riadok najprv tak, ze zoberie alebo vypocita to, co je napravo od =
        }
        return sum;
    }

    public static double getAverage(double sum, double count) {

        double average = sum / count;
        return average;
    }

    /* 2.SPOSOB
    public static double getAverageFromArray (double [] values) {
       double sum = getSum(values);
       int count = values.length;
       double average = sum/count;
       return average;
     */
    /* 3.SPOSOB
    public static double DOPISAT!!*/
    public static double getMax(double[] values) {

        Arrays.sort(values); // pole values je zoradene
        double max = values[values.length - 1];
        return max;
    }

    public static double getMin(double[] values) {

        Arrays.sort(values); // pole values je zoradene
        double min = values[0];
        return min;
    }

    public static double getCount(double[] values) {

        double count = values.length;
        return count;
    }

    public static void main(String[] args) {

        double[] values = {10, 20, 30, 40}; // [] pole,{}// hodnoty v poli

        //System.out.println(values[0]); //0 je index,ktory zacina 0...0 je prva hodnota v poli...1 je druha,atd.

        double sum = getSum(values);

        double count = values.length;
        double average = getAverage(sum, count);

        //v premennej sum dostanem posledny sucet
        System.out.println("SUM" + " " + getSum(values));
        System.out.println("AVERAGE" + " " + getAverage(sum, count));
        System.out.println("COUNT" + " " + getCount(values));

        // Ako vypocitat MAX

        System.out.println("MAX" + " " + getMax(values));
        System.out.println("MIN" + " " + getMin(values));

    }

    @Test
    public void testGetSum() {
        double [] values = {1,2,3}; //naplnene pole s nazvom values hodnotami
        assertEquals(6,getSum(values));

        double [] values2 = {3,8,10,100};
        assertEquals(121, getSum(values2));
    }

}
