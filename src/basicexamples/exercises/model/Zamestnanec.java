package basicexamples.exercises.model;

public class Zamestnanec {
    private String meno;
    private String priezvisko;
    private char pohlavie;
    private int rokNarodenia;

    // prazdny konstruktor
    public Zamestnanec() {
    }

    // konštruktor (mozme ich vytvorit aj viac a pouzitim roznych premennych
    public Zamestnanec(String meno, String priezvisko, char pohlavie, int rokNarodenia) {
        this.meno = meno;
        this.priezvisko = priezvisko;
        this.pohlavie = pohlavie;
        this.rokNarodenia = rokNarodenia;
    }

    public String getMeno() {
        return meno;
    }

    public void setMeno(String meno) {
        this.meno = meno;
    }

    public String getPriezvisko() {
        return priezvisko;
    }

    public void setPriezvisko(String priezvisko) {
        this.priezvisko = priezvisko;
    }

    public char getPohlavie() {
        return pohlavie;
    }

    public void setPohlavie(char pohlavie) {
        this.pohlavie = pohlavie;
    }

    public int getRokNarodenia() {
        return rokNarodenia;
    }

    public void setRokNarodenia(int rokNarodenia) {
        this.rokNarodenia = rokNarodenia;
    }

    // TODO: Upravit toString aby vypisal udaje o zamestnancovi pod sebou v tvare Meno: Priezvisko: Pohlavie: RokNarodenia:
    @Override
    public String toString() {
        return /*"Zamestnanec{" +
                "meno='" + meno + '\'' +
                ", priezvisko='" + priezvisko + '\'' +
                ", pohlavie=" + pohlavie +
                ", rokNarodenia=" + rokNarodenia +
                '}';*/

                "Zamestnanec" +
                        "\nMeno:" + meno +
                        "\nPriezvisko:" + priezvisko +
                        "\nPohlavie:" + pohlavie +
                        "\nRokNarodenia:" + rokNarodenia;
    }
}
