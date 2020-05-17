package testing.pojazdy;

public class Motory extends Pojazdy {

    private double pojemnosc;
    public Motory() {
        System.out.println("Default");   //Konstruktor domyślny
    }

    public Motory(String marka, int cena, int rocznik, double pojemnosc ) {
        super(marka,cena,rocznik);
        this.pojemnosc= pojemnosc;
        System.out.println("Not Default");
        System.out.println("Utworzono Motor");
    }

    public double getPojemnosc() {
        return pojemnosc;
    }

    public void setPojemnosc(double pojemnosc) {
        this.pojemnosc = pojemnosc;
    }
}

