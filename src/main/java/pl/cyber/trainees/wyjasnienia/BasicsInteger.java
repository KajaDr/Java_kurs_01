package pl.cyber.trainees.wyjasnienia;

public class BasicsInteger {
    //Metoda, która wyświetli liczbę z podanego parametru

    public Integer liczba1;
    public Integer num1;
    public Integer num2;
    public String txt;


    public BasicsInteger() {
        Integer liczba = null;
        this.liczba1 = liczba;
        System.out.println(liczba);
    }


    // Metoda, która wyświetli liczbę z podanego parametru
    //"Wprowadzona liczba to: ..."

    public void wyswietlLiczbe(Integer liczba) {
        System.out.println("Wyswietlana liczba  to : " + liczba);
    }

    public void wyswietlLiczbe2(Integer liczba) {
        System.out.println(liczba);
    }


// MARIUSZ//
// Metoda która wyswietla liczbe z danego parametru
    // public void wyswtetlLiczbe(Integer liczbadoWyswietlenia){
    //sout(liczbaDoWyswietlenia);
// Metoda ktoa wyswietl liczba z podanego parametru
//Wprowadzona liczba  to : 1234
    // public void wyswietlLiczbe2(Integer liczbaDoWyswietlenia){
    // sout("Wprowadzona liczba to: " liczbaDoWyswietlenia)




/* DOBRE PRAKTYKI
Warte zapamietania
kostrukcja klasy

public class NazwaKlasy{
public void NazwaMetody(){
}
}

Błędne konstrukcje: tak nie pisać !
public class NazwaKLasy{

    public String(); -> brak rozpoczęcia i zakonczenia metody prez {}
    i metody nie posiadaja ;

    String public metodaB() {
    }
    - najpier modyfikator nastepnie zwracamy typ danych

    public metoda C (){
    brak typu danych
    nawiasy zamykające

    public String metodaD() {
          public String metodaE(){
          }
      }

 }


    public String metodaD ()


 */

    // Utwórz metodę, która przyjme 3 parametry : string, Integer, Integer
    //String -> "wynik dodawania: "
    // Integer -> liczba która będziemy dodawać

    /*
    konstrukcja konkatenacji stringów/stringów z
    liczbami/stringów z wyrażeniami arytmetycznymi
     */

// metoda konstruktora m#1
    public BasicsInteger(String txt, Integer num1, Integer num2) {
        this.num1 = num1;
        this.num2 = num2;

        Integer suma = num1 + num2;
        System.out.println(txt +num1+ "+" +num2+"="+ suma);
        System.out.println("ładniej");
        System.out.println(txt);

    }
    //metoda m#2

    public void wyswietlanieSumyLiczb(String txt1,Integer a, Integer b) {
        System.out.println(txt1);
        System.out.println(a+b);

    }



}
