//1. Konstrukcja klas i metod


package pl.cyber.trainees; // okreslenie pakietu gdzie znajduje sie klasa
//packege robi sie automatycznie, jesli plik zawiera sie w odpowiedniej strukturze
//katalog tj src/main/java/...


//region miejsce na importy
//import java.io.File;

//endregion

//endregion

import pl.cyber.trainees.wyjasnienia.Basics;
import pl.cyber.trainees.wyjasnienia.BasicsInteger;
import pl.cyber.trainees.wyjasnienia.InstrukcjeWarunkowe;
import pl.cyber.trainees.wyjasnienia.Petla;


//Linia public class SimpleApp. Opisuje definicję klasy o nazwie SimpleApp.
//modyfikator dostępu klasy public / private
//class - słowo kluczowe określające definicję klas
//SimpleApp nazwa klasy tutaj nazwa może byc dowolna ale musi spełanic warunki
//1) nazwa pliku i nazwy klasy musi sie rownac
//2)Nazwy klas zawsze piszemy CamelCasem z zastrzeżeniem że pierwsza litera jest wielka


public class SimpleApp {

    // Ctrl +P podpowiadani w użyciu metod/deklaracji obiektów dostępnch parametrów
    //Ctrl +ALt +L reformator kodu czyści kod

    public static String SEPARACJA_SPACJA = ""; //ZMIENNA GLOBALNA W CAŁEJ KLASIE,
    // W RAMACH KLASY DEKLARUJEMY ZMIENNE GLOBALNE
    // modyfikator dostepu
    //slowo kluczowe static- okreslana ze nasza zmienna jest statyczna

    //TYPY DANYCH
    //nazwa zmiennej. Dobrą praktyką jest aby nazwa zmiennej globalnej była pisana wyłącznie z wielkich liter a kolejne słowa
    //oddzielone zostały znakiem '_'
    //następnie przypisanie wartości

    //DEKLARACJA METOD
    //W przypadku metody uruchomieniowej powinna ona występować tylko raz w całym projekcie
    //Konstrukcja metory uruchomieniowej:
    //modyfikator dostępu zawsze jako public
    //słowo kluczowe static
    //typ  metody zawsze void
    //nazwa metody zawsze main
    //parametry wejściowe metody, może ich nie być
    // ale z reguły powinna być to tablica args (tj. String[] args)


    public static void main(String[] args) {


//nie tworzymny metody w metodzie, powinny byc za nawiasem sklamrowym np
        //public String nowametoda(){}
// w ramach klasy uruchomieniowej  możemy deklarować zmienne oraz pisać kod/
// dobrze aby metoda uruchomieniowa wywoływawała konkretne klasy z kodem który chcemy uruchomić

// Należy pamietac, że metody funkcjonalne deklarujemy w taki sposób:
        // - nie mają słówka static
        //- modyfikator dostepu może byc public/private / protected / default
        //Typ zwracajych informacji, aczkolwiem może metoda nic nie zwracać.
        //void - jeśli metoda nic nie zwraca
        //String/Integer/BigDecimal/Model/........ jeśli chcemy aby nasza metoda zwracała
        //konkretny typ danych i była możliwa bo użycia w innym miejscu np. klasy lub projektu
        //nazwy metod pisane camelCase'm z małej początek

        System.out.println("_________________Ćwiczenie nr 1______________");


        //pierwsze rozwiązanie
        Basics basics = new Basics("1");
        basics.wyswietlTekst1("tekst do wyświetlenia");

        //drugie rozwiązanie
        Basics basics2 = new Basics(" Nowy tekst do wyświetlenia ");
        basics2.wyswietlTekst2(" tekst do wyświetlenia 2");


        //trzecie rozwiązanie
        Basics basics3 = new Basics("tekst1", "tekst2", " tekst3");
        basics3.wyswietlTekst3("Nowy tekst do wyświetlenia3");

        //Cwiczenie DRUGIE _INTEGER


        BasicsInteger basicsInteger2 = new BasicsInteger();
        basicsInteger2.wyswietlLiczbe(12343);
        basicsInteger2.wyswietlLiczbe2(1234);

        Basics testKonstr = new Basics(123);

        System.out.println("_________________Ćwiczenie nr 2______________");

// dodawanie liczb z konstruktora
        BasicsInteger basicsInteger3 = new BasicsInteger("Dodajemy liczby ", 1, 2);

        // M#2
        BasicsInteger basicsInteger = new BasicsInteger();
        String txt1 = "wynik:";
        Integer a = 12;
        Integer b = 12;

        System.out.println("_________________Ćwiczenie nr 3______________");

        basicsInteger.wyswietlanieSumyLiczb("Suma", 2, 3);
        System.out.println(txt1);
        System.out.println(a + b);

        System.out.println("_________________Ćwiczenie nr 1 ______________\n" +
                "petla");

       // Petla petla=new Petla();
        //petla.uruchom();
        System.out.println("_________________Ćwiczenie nr 2 ______________\n" +
                "                              CHOINKA");

        System.out.println("_________________Ćwiczenie nr 3 ______________\n" +
                "                             petla");
       // Petla petla1= new Petla();
      //  petla1.uruchom();

        System.out.println("_________________Ćwiczenie nr 4______________\n" +
                "                           SWITCH");

        InstrukcjeWarunkowe instrukcjeWarunkowe= new InstrukcjeWarunkowe(0);

        instrukcjeWarunkowe.uruchom();

        instrukcjeWarunkowe.jakaPlec2("mezczyzna");




    }



    //BESIC TEST DO OGARNIECIA ABY DZIAŁAŁO
    /*
       BasicTest basicTest = new BasicTest();
    Integer suma = basicTest.sumaIntow(a,b);
    basics.wyswietlTekst1(txt + suma);
    basics.wyswietlSumeDodawania(txt, suma.toString());

    /*


    }

// dwuklik przy poczatku metody - zaznacza całą metodę


//TEORIA CD

    private  Integer kolejnaMetoda(){

        // w tym miejscu możliwe jest deklarowanie zmiennych
        //używanie instrukcji warunkowych
        //używanie pętli
        //uzywanie innych meto lub odwołanie do metod  innych klas poprzez wczesniejsza deklaracje
        return 0;
    }
    public String nazwaMetody() {
        return ""; // return zawsze musi pojawic sie jesli nasza metoda jest inna niż void
        //String  typy zwracabych dabych
        // dobrze aby metody były jak najbardziej zwiezle
    }


    public void kolejnaMetoda(String tekst){
        System.out.println(tekst);
    }

}

    //Metoda trzecia



// tutaj może być nowa metoda
// Zalecana wielkosc klasy nie powinnia przekroczyć 200 linii pliku. <dla jakiej kolwiek klasy>


*/
}