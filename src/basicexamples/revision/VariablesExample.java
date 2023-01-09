package basicexamples.revision;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;
import java.util.Locale;
import java.time.format.DateTimeFormatter;

/*
Trieda vypíše nasledujúci text do konzoly,pričom hodnoty ako dátum,známka,rok a aktuálny dátum môže používateľ meniť cez premenné.
Text bude vyzerať nasledovne:
Študent Jozef Mrkvička sa narodil 03.04.2000, z maturitnej skúšky má známku 1.5 a od septembra 2022 nastúpi do nového zamestnania ako Java programátor.
 V Bratislave dňa 18.06.2022
 */
public class VariablesExample {
    public static void main(String[] args) {
       String text1 = "Študent Jozef Mrkvička sa narodil ";
       String date = "03.04.2000";
       String text2 = ", z maturitnej skúšky má známku ";
       float grade = 1.5f; // TODO Print grade with comma
        grade = grade + 0.5f; // Increasing grade to +0.5, also this is same: grade += 0.5f;
       String gradeWithComma = String.format ("%.1f",grade);
       String text3 = " a od septembra";
       int year = 2022;
       String text4 = "nastúpi do nového zamestnania ako Java programátor.%n";
       String text5 = "V Bratislave dňa ";

        //String currentDate = "18.06.2022";
        //Generate current date and reformat to Slovak one
        // DateFormat dateFormat = new SimpleDateFormat ("dd.MM.yyyy");//Date format
        //Date currentDate = new Date();//Gez current Date and Time
        //String formattedCurrentDate = dateFormat.format(currentDate);//Change currentDate*/
        //SimpleDateFormat currentDateInSlovakFormat = new SimpleDateFormat("dd.MM.yyyy",currentDate);

        //Locale locale = new Locale ("sk", "SR");
        //DateFormat dateFormat = DateFormat.getDateInstance(DateFormat.DEFAULT,locale);
        //String formattedCurrentDate = dateFormat.format(new Date());//

        //alebo takto

        String formattedCurrentDate = DateTimeFormatter.ofPattern("dd.MM.yyyy").format(LocalDate.now());

        String wholeText = text1 + date + text2 + gradeWithComma + text3 + year + text4 + text5 + formattedCurrentDate;

        System.out.printf(wholeText);
    }
}
