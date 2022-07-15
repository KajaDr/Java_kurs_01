package pl.cyber.trainees.dziedziczenie;

//extends - słowo kluczowe stosowane przy dziedziczeniu klas
//super -słowo kluczowe stosowane przy dziedziczeniu odnosi się do konstruowania klasy nadrzędnej
public class Model extends Pojazd {
    private String nazwa;
    private Integer przebieg;
    private Double pojemnoscSilnika;
    private Kolor kolor;

    public Model() {
        super();
        this.nazwa= "";
        this.przebieg= 0;
        this.pojemnoscSilnika = 0.0;
        this.kolor= null;
    }

    public Model(
            final String marka,
            final String rocznik,
            final String naped,
            final String nazwa,
            final Integer przebieg,
            final Double pojemnoscSilnika,
            final Kolor kolor) {

        super(marka, rocznik, naped);
        this.nazwa = nazwa;
        this.przebieg = przebieg;
        this.pojemnoscSilnika = pojemnoscSilnika;
        this.kolor = kolor;
    }
    // przyslanianie metod określenie nowej funkcjonalnosci dla metody nadrzednej
    // zwraca nam informacje o modelu toString

    //Ctrl + W zaznaczanie wyrazu kursorem
    // Naciśnięcie rolki myszy i przeciągniecie w dół /górę pozwala na zaznaczenie więcje linii niż tylko jedna
    @Override // adnotacja wykorzystywna do przyslaniania metod
    public String toString() {
        return "Marka: " + getMarka()
                +"rocznik: " + getRocznik()
                + "naped: " + getNaped()
                + "nazwa modelu: " + this.nazwa
                + "przebieg: " + this.przebieg
                + "pojSIlnik: " + this.pojemnoscSilnika
                + "kolor: " + this.kolor;

    }
    //metody typu GETTERY
    public String getNazwa() {
        return nazwa;
    }
    public Integer getPrzebieg() {
        return przebieg;
    }
    public Double getPojemnoscSilnika() {
        return pojemnoscSilnika;
    }
    public Kolor getKolor() {
        return kolor;
    }
    //Settery - pozwalają nadac nowe  wartosci
    public void setNazwa(final String nazwa){
        this.nazwa =nazwa;

        //Ctrl + spacja wyswietla okno dialogowe jakie sa dostepne mozliwosci


    }
     public void setPrzebieg(final Integer przebieg){
        this.przebieg = przebieg;
     }

    public void setPojemnoscSilnika(final Double pojemnoscSilnika) {
        this.pojemnoscSilnika = pojemnoscSilnika;
    }

    public void setKolor(final Kolor kolor) {
        this.kolor = kolor;
    }
}
