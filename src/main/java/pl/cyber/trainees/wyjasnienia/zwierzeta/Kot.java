package pl.cyber.trainees.wyjasnienia.zwierzeta;

/*
  Utwórz klasę Kot . Klasa ta powinna mieć następujące pola:

    imię (ciąg znaków)
    data urodzenia (data)
    waga (liczba zmiennoprzecinkowa)
    imię opiekuna (ciąg znaków)

  Klasa ta powinna też mieć jedną metodę o nazwie przedstawSie. Metoda ta nie przyjmuje żadnych argumentów i zwraca
        ciąg znaków, który jest zdaniem zawierającym imię kotka, jego datę urodzenia, wagę oraz imię opiekuna.
   */

import java.time.LocalDate;

public class Kot extends Zwierze {

    public static String SEPARACJA_SPACJA = "";

    private String imie;
    private LocalDate dataUrodzenia;
    public double waga;
    public String imieWlasciciela;

    public Kot(final String imie, final LocalDate dataUrodzenia,final  double waga,final  String imieWlasciciela) {
        super(0.0, true); // dziedziczenie z klasy ZWIERZE przez slowo super
        this.imie = imie;
        this.dataUrodzenia = dataUrodzenia;
        this.waga = waga;
        this.imieWlasciciela = imieWlasciciela;
    }
    public Kot(final Double wzrost,final  boolean czyMaSierc, final String imie,final LocalDate dataUrodzenia,
               final double waga, final  String imieWlasciciela) {

        super(wzrost, czyMaSierc);
        this.imie = imie;
        this.dataUrodzenia = dataUrodzenia;
        this.waga = waga;
        this.imieWlasciciela = imieWlasciciela;
    }

    public String getImie() {
        return imie;
    }

    public LocalDate getDataUrodzenia() {
        return dataUrodzenia;
    }

    public double getWaga() {
        return waga;
    }

    public String getImieWlasciciela() {
        return imieWlasciciela;
    }

    public String przedstawSie(){
        return "Kot o imieniu: " +getImie()+SEPARACJA_SPACJA
                + "data urodzenia : " +getDataUrodzenia() + SEPARACJA_SPACJA
                + "waga: " + getWaga()+ SEPARACJA_SPACJA
                + " imie własciciela: " + getImieWlasciciela();

    }

    @Override
    public String dajGlos(){
        return "Miau";
    }

    @Override
    public String dajGlod() {
        return null;
    }

}
