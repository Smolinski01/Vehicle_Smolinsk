
package testing.pojazdy;

public class Samochody extends Pojazdy {

    private String rodzaj;
    public Samochody() {
        System.out.println("Default");   //Konstruktor domyślny
    }

    public Samochody(String marka, int cena, int rocznik, String rodzaj ) {
        super(marka,cena,rocznik);
        this.rodzaj = rodzaj;
        System.out.println("Not Default");
        System.out.println("Utworzono Pojazd");
    }

    public String getRodzaj() {
        return rodzaj;
    }

    public void setRodzaj(String rodzaj) {
        this.rodzaj = rodzaj;
    }
}

