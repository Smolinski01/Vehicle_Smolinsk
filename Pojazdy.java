
package testing.pojazdy;
public class Pojazdy {

    private String marka;
    private int cena;
    private int rocznik;

    public Pojazdy() {
        System.out.println("Default");   //Konstruktor domyślny
    }


    public Pojazdy(String marka, int cena, int rocznik) {
        this.marka = marka;
        this.cena = cena;
        this.rocznik = rocznik;
        System.out.println("Not Default");
        System.out.println("Utworzono pojazd");
    }

    public String getMarka() {
        return marka;
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }


    public int getCena() {
        return cena;
    }

    public void setCena(int cena) {
        this.cena = cena;
    }


    public int getRocznik() {
        return rocznik;
    }

    public void setRocznik(int rocznik) {
        this.rocznik = rocznik;
    }



    @Override
    public String toString() {
        return "Pojazdy{" +
                "marka='" + marka + '\'' +
                ", cena=" + cena +
                ", rocznik=" + rocznik +
                '}';
    }
}

