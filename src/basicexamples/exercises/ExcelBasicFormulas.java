package basicexamples.exercises;

public class ExcelBasicFormulas {
    public static void main(String[] args) {
        int[] values = {10, 20, 30, 40}; // [] pole,{}// hodnoty v poli

        //System.out.println(values[0]); //0 je index,ktory zacina 0...0 je prva hodnota v poli...1 je druha,atd.

        int sum = 0;

        for (int i = 0; i < 4; i++) {// do premennej i sme dali 0,aby sme vybrali prvy prvok v poli...cyklus s pevnym poctom opakovani, i nadobuda hodnoty od 0 do 4
            // i++ hodnota i zvacsena o 1,akoby i= i+1
            sum = sum + values[i];
            // v 1.cykle(iteracii) bude sum obsahovať hodnotu 10,pretože 0+10
            // v 2.cykle bude sum obsahovať hodnotu 30, pretože 10 + 20
            // v 3.cykle bude sum obsahovať hodnotu 60,pretože 30 + 30
            // v 4.cykle -II- 60+40

        }
        System.out.println("SUM" + " " + sum);

        for (int i = 0; i < values.length; i++) {
            sum = sum + values[i];
        }
        System.out.println(sum);

        double average = sum / values.length;
        System.out.println("AVERAGE" + " " + average);
    }

}
