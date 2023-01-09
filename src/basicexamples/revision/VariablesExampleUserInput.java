package basicexamples.revision;


import java.sql.SQLOutput;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

/*
Trieda vypíše nasledujúci text do konzoly,pričom hodnoty ako dátum,známka,rok a aktuálny dátum môže používateľ meniť cez premenné.
Text bude vyzerať nasledovne:
Študent Jozef Mrkvička sa narodil 03.04.2000, z maturitnej skúšky má známku 1.5 a od septembra 2022 nastúpi do nového zamestnania ako Java programátor.
 V Bratislave dňa 18.06.2022
 */
public class VariablesExampleUserInput {
    public static void main(String[] args) {
       String text1 = "Študent Jozef Mrkvička sa narodil ";
       String date = "" ;
       String text2 = ", z maturitnej skúšky má známku ";
       float grade = 0f; // TODO Print grade with comma
        //grade = grade + 0.5f; // Increasing grade to +0.5, also this is same: grade += 0.5f;
       String gradeWithComma = String.format ("%.1f",grade);
       String text3 = " a od septembra ";
       int year = 0;
       String text4 = " 1nastúpi do nového zamestnania ako Java programátor.%n";
       String text5 = "V Bratislave dňa ";

        Scanner scn = new Scanner(System.in);
        System.out.println("Zadaj dátum:");
        date = scn.nextLine();

        System.out.println("Zadaj známku:");
        grade = scn.nextFloat();
        gradeWithComma = String.format("%.1f",grade);

        System.out.println("Zadaj rok:");
        year = scn.nextInt();

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

        System.out.println(); //vloží nový riadok
        //TODO Ak má známku do 1,5 vrátane,tak vypíšem je prijatý, v opačnom prípade NIE JE PRIJATÝ!
        //TODO Ak má známku od 1,5 do 3 vrátane, tak vypíšem MOŽNO BUDE PRIJATÝ
        //TODO Ak má horšiu známku ako 3, tak vypíšem NIE JE PRIJATÝ
        if (grade <= 1.5f) {
            System.out.println("JE PRIJATÝ");
            System.out.println("SUPER!");
        } else if (grade > 1.5f && grade <=3f ) {
            System.out.println("MOŽNO BUDE PRIJATÝ");
            //Tu môže byť ďalší zdrojový kód
        }else {
            System.out.println("\nNIE JE PRIJATÝ");
            System.out.println("TO JE ŠKODA!");
        }
    }
}
