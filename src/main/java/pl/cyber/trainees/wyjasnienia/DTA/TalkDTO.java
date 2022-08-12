package pl.cyber.trainees.wyjasnienia.DTA;
//POJO Plain Old Java Object -> reprezentuje obiekty bez adnotacji
// DTO -> Data Transfer Object
//ENCJA - obiekt DTO, który ma za zadanie reprezentować strukturę tabeli baz danych
//ValueObject- obiekt z jednym parametrem ( posiadaja metodę getter bez metody settera)
// który waliduje poprawną strukturę. Tzn czy parametr nie jest Null i czy posiada wartosć

/*
Inaczej mówiąc objekt Javowy, którego zadaniem jest przenoszenie specyficznych danych.

Najczęstsze wykorzystanie:
1) komunikacja klient - server. Innymi słowy Frontend(WEB) - Backend, Aplikacja Moblie - Backend.
2) komunikacja baza danych - Backend

Cechy szczególne obiektów:
1) pola ( parametr) opisujace konkretny obiekt np. Samochód. Pola samochodu np. Marka, kolor, przebieg, etc
2) posiadają konstruktor do prawidłowego utworzenia obiektu danej klasy
3) posiada konkretne metody odwołujące się do utworzonego obiektu
(metody typu Getter, Setter, toString, etc)
4) może posiadać wewnętrznie swój konwerter
np do konwersji obiektu DTO bazy danych (Encji) na obiekt do reprezentacji aplkacji Frontendowej


 */

import pl.cyber.trainees.wyjasnienia.Wyjatek.UncheckedException;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class TalkDTO {
    private final String tematRozmowy;
    public String opis; // bez modyfikatora private i ustawienia zmiennej jako final mozemy dopuscic sytuacje,
    // w ktorej nieswiadomie damy mozliwosc zmiany wartosci parametru klasy
    private List<String> przyklady;

    public TalkDTO(String tematRozmowy, String opis, List<String> przyklady) {
        this.tematRozmowy = tematRozmowy;
        this.opis = opis;
        this.przyklady = przyklady;
    }

    public String getTematRozmowy() {
        return tematRozmowy;
    }

    public String getOpis() {
        return opis;
    }

    public List<String> getPrzyklady() {
        return przyklady;
    }

    public void setOpis(String opis) {
        this.opis = opis;
    }

    public void setPrzyklady(List<String> przyklady) {
        this.przyklady = przyklady;
    }

    public void modifyList(List<String>wiecejPrzykladow){
        this.przyklady.addAll(wiecejPrzykladow);
    }
}
/*
    public TalkDTO(
            final String tematRozmowy,
            final List<String>przyklady) throws UncheckedException {

        if (przyklady.isEmpty()) {
            throw new UncheckedException("Parametr przyklad jest pusty");
        }
        this.tematRozmowy = tematRozmowy;
        //  this.przyklady= przyklady.isEmpty()? new ArrayList<>(): przyklady; // metoda 1 sprawdzajaca czy lista pelna czy pusta
        // postac rownoważna do : this. przykaldy= przyklady.isEmpty()
        /*

        IV konstrukcja warunkowa if
        przyklady.isEmpty() ? new ArrayList<>() : przyklady

        wszystko przed znakiem ? to jest warunek sprawdzający czyli if(przyklady.isEmpty())
        między znakiem ? a znakiem : znajduje się instrukcja, jeżeli true inaczej mówiąc zawartość pierwszego bloku w instrukcji if
        wszystko po znaku : znajduje się instrukcja, jeżeli false, inaczej mówiąc zawartość bloku w instrukcji else

         */
    /*
        if (przyklady.isEmpty()) {
            this.przyklady = new ArrayList<>();
        } else {
            this.przyklady = przyklady;
        }
    }
    public String getTematRozmowy () {
        return tematRozmowy;
    }
    public List<String> getPrzyklady () {
        return przyklady;
    }
    public String toString() {
        return "Informacja o klasie TalkDTO: { tematRozmowy: " + this.tematRozmowy
                + "\nPierwszy przykład: " + this.przyklady.get(0) + "}";
    }
    }
    */

