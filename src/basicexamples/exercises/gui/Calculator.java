package basicexamples.exercises.gui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

//TODO Doplnit tlacidla s jednotl. cislami a matemat. operatormi */
//TODO Doplnit matematicke operacie ako je nasobenie a delenie, ktore aj logicky vypoctia a vysledok zobrazi na displeji kalkualcky

public class Calculator {
    private static String operation;
    private static double number1;
    private static boolean jeVysledok = false;
    private static String znamienko;

    public static void main(String[] args) {
        /*try {
            UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
        } catch (Exception ignored) {
            //  tu dokažeme chybu  odchytit a spracovat.
        }*/


        JFrame frame = new JFrame("Hello World JSwing"); // vytvorime okno
        frame.setMinimumSize(new Dimension(400, 300));
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //ked kliknem na X na okne (cize vo frame) tak sa zatvori standardne (tento prikaz by mal byt,lebo bez tohto prikazu Java nevie,ze sme okno zatvorili

        // JFrame by mal obsahovat panel,teda container JPanel
        JPanel panel = new JPanel(); //vytvorime objekt panel
        // layout pre panel bude null, cize prazdny, to znamena, ze pre kazdy vlozeny vizualny prvok /jLabel, jText, jButton/ je potrebne
        // nastavit presnu poziciu umiestnenia cez setBounds
        panel.setLayout(null);
        frame.setContentPane(panel); //my dany panel pridame do frame

        //JText
        JTextField textField = new JTextField(); //vytvorili sme textove pole
        textField.setBounds(100, 20, 200, 30); // x,y,sirka,vyska
        textField.setHorizontalAlignment(JTextField.RIGHT); // RIGHT/LEFT - urci kde bude kurzor
        panel.add(textField); // umiestnili sme ho do panela textField=textovePoleDisplejaKalkulacky

        JButton buttonC = new JButton("C"); // tlacidlo C
        buttonC.setBounds(100, 100, 60, 20); // x, y, sirka, vyska
        buttonC.addActionListener(new ActionListener() { // sluzi na "odchytenie" cize spracovanie zatlacenia tlacidla
            public void actionPerformed(ActionEvent e) {
                //textField=textovePoleDisplejaKalkulacky.setText(""); //""reprezentuju prazdny retazec
                //po stlaceni klavesy C vymaze textField a zobrazi 0
                textField.setText("");
            }
        });
        panel.add(buttonC);

        JButton btnNumber1 = new JButton("1"); // tlacidlo
        btnNumber1.setBounds(100, 150, 60, 20); // x, y, sirka, vyska
        btnNumber1.addActionListener(new ActionListener() { // sluzi na "odchytenie" cize spracovanie zatlacenia tlacidla
            public void actionPerformed(ActionEvent e) {
                //textField.setText(""); // "" reprezentuju prazdny retazec
                if (jeVysledok) {
                    textField.setText("");
                    jeVysledok = false;
                }
                textField.setText(textField.getText() + "1");
            }
        });

        panel.add(btnNumber1);

        JButton btnNumber2 = new JButton("2"); // tlacidlo
        btnNumber2.setBounds(170, 150, 60, 20); // x, y, sirka, vyska
        btnNumber2.addActionListener(new ActionListener() { // sluzi na "odchytenie" cize spracovanie zatlacenia tlacidla
            public void actionPerformed(ActionEvent e) {
                //textField.setText(""); // "" reprezentuju prazdny retazec
                //do pola displeja kalkulacky vypiseme hodnotu 1,ale predtym musime k nej pridat (scitat) aktualnu hodnotu,
                //ktora je zobrazena na displeji,cize textField.getText()
                if (jeVysledok) {
                    textField.setText("");
                    jeVysledok = false;
                }
                textField.setText(textField.getText() + "2");
            }
        });
        panel.add(btnNumber2);

        JButton btnNumber3 = new JButton("3"); // tlacidlo
        btnNumber3.setBounds(240, 150, 60, 20); // x, y, sirka, vyska

        btnNumber3.addActionListener(new ActionListener() { // sluzi na "odchytenie" cize spracovanie zatlacenia tlacidla
            public void actionPerformed(ActionEvent e) {
                //textField.setText(""); // "" reprezentuju prazdny retazec
                if (jeVysledok) { //pytame sa priamo ci premenna jeVysledok obsahuje true
                    textField.setText("");
                    jeVysledok = false;
                }
                textField.setText(textField.getText() + "3");
            }
        });
        panel.add(btnNumber3);

        JButton btnNumber4 = new JButton("4"); // tlacidlo
        btnNumber4.setBounds(100, 180, 60, 20); // x, y, sirka, vyska

        btnNumber4.addActionListener(new ActionListener() { // sluzi na "odchytenie" cize spracovanie zatlacenia tlacidla
            public void actionPerformed(ActionEvent e) {
                //textField.setText(""); // "" reprezentuju prazdny retazec
                if (jeVysledok) {
                    textField.setText("");
                    jeVysledok = false;
                }
                textField.setText(textField.getText() + "4");
            }
        });
        panel.add(btnNumber4);

        JButton btnNumber5 = new JButton("5"); // tlacidlo
        btnNumber5.setBounds(170, 180, 60, 20); // x, y, sirka, vyska

        btnNumber5.addActionListener(new ActionListener() { // sluzi na "odchytenie" cize spracovanie zatlacenia tlacidla
            public void actionPerformed(ActionEvent e) {
                //textField.setText(""); // "" reprezentuju prazdny retazec
                if (jeVysledok) {
                    textField.setText("");
                    jeVysledok = false;
                }
                textField.setText(textField.getText() + "5");
            }
        });
        panel.add(btnNumber5);

        JButton btnNumber6 = new JButton("6"); // tlacidlo
        btnNumber6.setBounds(240, 180, 60, 20); // x, y, sirka, vyska

        btnNumber6.addActionListener(new ActionListener() { // sluzi na "odchytenie" cize spracovanie zatlacenia tlacidla
            public void actionPerformed(ActionEvent e) {
                //textField.setText(""); // "" reprezentuju prazdny retazec
                if (jeVysledok) {
                    textField.setText("");
                    jeVysledok = false;
                }
                textField.setText(textField.getText() + "6");
            }
        });
        panel.add(btnNumber6);

        JButton btnNumber7 = new JButton("7"); // tlacidlo
        btnNumber7.setBounds(100, 210, 60, 20); // x, y, sirka, vyska

        btnNumber7.addActionListener(new ActionListener() { // sluzi na "odchytenie" cize spracovanie zatlacenia tlacidla
            public void actionPerformed(ActionEvent e) {
                //textField.setText(""); // "" reprezentuju prazdny retazec
                if (jeVysledok) {
                    textField.setText("");
                    jeVysledok = false;
                }
                textField.setText(textField.getText() + "7");
            }
        });
        panel.add(btnNumber7);

        JButton btnNumber8 = new JButton("8"); // tlacidlo
        btnNumber8.setBounds(170, 210, 60, 20); // x, y, sirka, vyska

        btnNumber8.addActionListener(new ActionListener() { // sluzi na "odchytenie" cize spracovanie zatlacenia tlacidla
            public void actionPerformed(ActionEvent e) {
                //textField.setText(""); // "" reprezentuju prazdny retazec
                if (jeVysledok) {
                    textField.setText("");
                    jeVysledok = false;
                }
                textField.setText(textField.getText() + "8");
            }
        });
        panel.add(btnNumber8);

        JButton btnNumber9 = new JButton("9"); // tlacidlo
        btnNumber9.setBounds(240, 210, 60, 20); // x, y, sirka, vyska

        btnNumber9.addActionListener(new ActionListener() { // sluzi na "odchytenie" cize spracovanie zatlacenia tlacidla
            public void actionPerformed(ActionEvent e) {
                //textField.setText(""); // "" reprezentuju prazdny retazec
                if (jeVysledok) {
                    textField.setText("");
                    jeVysledok = false;
                }
                textField.setText(textField.getText() + "9");
            }
        });
        panel.add(btnNumber9);

        JButton btnNumber0 = new JButton("0"); // tlacidlo
        btnNumber0.setBounds(170, 240, 60, 20); // x, y, sirka, vyska

        btnNumber0.addActionListener(new ActionListener() { // sluzi na "odchytenie" cize spracovanie zatlacenia tlacidla
            public void actionPerformed(ActionEvent e) {
                //textField.setText(""); // "" reprezentuju prazdny retazec
                if (jeVysledok) {
                    textField.setText("");
                    jeVysledok = false;
                }
                textField.setText(textField.getText() + "0");
            }
        });
        panel.add(btnNumber0);


        /*JButton btnCancel = new JButton("Cancel");
        btnCancel.setBounds(210, 100, 100, 20);

        btnCancel.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                frame.dispatchEvent(new WindowEvent(frame, WindowEvent.WINDOW_CLOSING));
            }
        });
        *pozn. tlacidlo,ktore sluzilo na uzavretie aplikacie kalkulacky (nepotrebujeme,mame na to X na liste :) )
        */

//-START- tlacidlo pre scitanie
        JButton btnPlus = new JButton("+"); // tlacidlo
        btnPlus.setBounds(310, 150, 60, 20); // x, y, sirka, vyska

        btnPlus.addActionListener(new ActionListener() { // sluzi na "odchytenie" cize spracovanie zatlacenia tlacidla
            public void actionPerformed(ActionEvent e) {
                textField.setText(textField.getText() + "+");
                znamienko = "+";
            }
        });
        panel.add(btnPlus);
// KONIEC - tlacidlo pre scitanie

        JButton btnMinus = new JButton("-"); // tlacidlo
        btnMinus.setBounds(310, 180, 60, 20); // x, y, sirka, vyska

        btnMinus.addActionListener(new ActionListener() { // sluzi na "odchytenie" cize spracovanie zatlacenia tlacidla
            public void actionPerformed(ActionEvent e) {
                //textField.setText(""); // "" reprezentuju prazdny retazec
                textField.setText(textField.getText() + "-");
                znamienko = "-";
            }
        });
        panel.add(btnMinus);


        JButton btnMultiply = new JButton("*"); // tlacidlo
        btnMultiply.setBounds(310, 210, 60, 20); // x, y, sirka, vyska

        btnMultiply.addActionListener(new ActionListener() { // sluzi na "odchytenie" cize spracovanie zatlacenia tlacidla
            public void actionPerformed(ActionEvent e) {
                //textField.setText(""); // "" reprezentuju prazdny retazec
                textField.setText(textField.getText() + "*");
            }
        });
        panel.add(btnMultiply);


        JButton btnDivide = new JButton("/"); // tlacidlo
        btnDivide.setBounds(310, 240, 60, 20); // x, y, sirka, vyska

        btnDivide.addActionListener(new ActionListener() { // sluzi na "odchytenie" cize spracovanie zatlacenia tlacidla
            public void actionPerformed(ActionEvent e) {
                //textField.setText(""); // "" reprezentuju prazdny retazec
                textField.setText(textField.getText() + "/");
            }
        });
        panel.add(btnDivide);


        JButton btnSummary = new JButton("="); // tlacidlo
        btnSummary.setBounds(240, 240, 60, 20); // x, y, sirka, vyska

        btnSummary.addActionListener(new ActionListener() { // sluzi na "odchytenie" cize spracovanie zatlacenia tlacidla
            public void actionPerformed(ActionEvent e) {
                String obsahDisplejaKalkulacky = textField.getText();
                //dalsia logika bude taka,ze premennu obsahDisplejaKalkulacky rozdelime


                String[] castiStringu = null;
                if (znamienko.equals("+"))
                    castiStringu = obsahDisplejaKalkulacky.split("\\+");//rozdeli obsahDisplejaKalkulacky
                else if (znamienko.equals("-")) castiStringu = obsahDisplejaKalkulacky.split("\\-");

                double number1 = Double.parseDouble(castiStringu[0]);
                double number2 = Double.parseDouble(castiStringu[1]);

                double vysledok = 0;
                if (znamienko.equals("+")) {
                    vysledok = number1 + number2;
                    // viac prikazov, pretoze sme pouzili blok,cize {}
                } else if (znamienko.equals("-")) {
                    vysledok = number1 - number2;
                    //viac prikazov,pretoze sme pouzili blok,cize {}
                }
                jeVysledok = true; // ak som nieco vypocital,tak som nasledne naplnil premennu jeVysledok = true,aby som ju mohok neskor otestovat
                textField.setText(String.valueOf(vysledok));

                System.out.println(obsahDisplejaKalkulacky);
                System.out.println(number1);
                System.out.println(number2);

            }
        });
        panel.add(btnSummary);


        JButton btnDecPoint = new JButton("."); // tlacidlo
        btnDecPoint.setBounds(100, 240, 60, 20); // x, y, sirka, vyska

        btnDecPoint.addActionListener(new ActionListener() { // sluzi na "odchytenie" cize spracovanie zatlacenia tlacidla
            public void actionPerformed(ActionEvent e) {
                //textField.setText(""); // "" reprezentuju prazdny retazec
                textField.setText(textField.getText() + ".");
            }
        });
        panel.add(btnDecPoint);


        JButton btnPluSMinus = new JButton("+/-"); // tlacidlo
        btnPluSMinus.setBounds(170, 100, 60, 20); // x, y, sirka, vyska

        btnPluSMinus.addActionListener(new ActionListener() { // sluzi na "odchytenie" cize spracovanie zatlacenia tlacidla
            public void actionPerformed(ActionEvent e) {
                //textField.setText(""); // "" reprezentuju prazdny retazec
                textField.setText(textField.getText() + "+/-");
            }
        });
        panel.add(btnPluSMinus);


        JButton btnPercentage = new JButton("%"); // tlacidlo
        btnPercentage.setBounds(240, 100, 60, 20); // x, y, sirka, vyska

        btnPercentage.addActionListener(new ActionListener() { // sluzi na "odchytenie" cize spracovanie zatlacenia tlacidla
            public void actionPerformed(ActionEvent e) {
                //textField.setText(""); // "" reprezentuju prazdny retazec
                textField.setText(textField.getText() + "%");
            }
        });
        panel.add(btnPercentage);

        //display it
        frame.pack();
        frame.setVisible(true);

    }
}
