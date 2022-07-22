package pl.cyber.trainees.dziedziczenie;

// Nowa klasa okreslajaca markę pojazdu
public class Pojazd {

    private String marka;
    private String rocznik;
    private String naped;

    public Pojazd() {
        marka = "";
        rocznik = "";
        naped = "";

    }

    //Alt + Insert - menu kontekstowe generowania kodu, wybieramy opcje Constructor - zaznaczmay wszystkie trzy

    public Pojazd(String marka, String rocznik, String naped) {
        this.marka = marka;
        this.rocznik = rocznik;
        this.naped = naped;
    }

    // będzie wyswietlala zawartosc pól zwracala Stringa. THIS odwołanie sie w ramach klasy do danego parametru
    public String toString() {
        return "Marka : " + this.marka
                + " rocznik : " + this.rocznik
                + " napęd: " + this.naped;

    }
    // Gettery - metody których zadaniem jest pobieranie informacji z pól klas do dalszego przetwarzania

    public String getMarka() {
        return marka;
    }

    public String getRocznik() {
        return rocznik;
    }

    public String getNaped() {
        return naped;
    }

    // Setter metody których jest wstawianie informacji
    public void setMarka(final String marka) {
        this.marka = marka;
    }

    public void setRocznik(final String rocznik) {
        this.rocznik = rocznik;
    }

    public void setNaped(final String naped) {
        this.naped = naped;
    }
}
