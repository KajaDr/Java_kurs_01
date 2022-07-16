package pl.cyber.trainees;


import pl.cyber.trainees.dziedziczenie.Kolor;
import pl.cyber.trainees.dziedziczenie.Model;
import pl.cyber.trainees.service.OdczytDanych;
import pl.cyber.trainees.spotkania.Petla;
import pl.cyber.trainees.spotkania.kalkulator_foreach.Dodawanie;

import java.io.File;
import java.io.FileNotFoundException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
// deklaracje na górze nie powinny być ciężkie, aby nie obciązac komputera,
public class SimpleApp {
    //-------------------------------------------------------------------------

// Ctrl +P podpowiadani w użyciu metod/deklaracji obiektów dostępnch parametrów
    public static void main(String[] args) throws FileNotFoundException {
        OdczytDanych odczytDanych = new OdczytDanych();
        //odczytujemy dane z klawiatury
     System.out.println("Jak masz na imie: ");

     String firstName = odczytDanych.wprowadzonaWartoscKlawiatury();
     System.out.println("Witaj " + firstName + " :)");

//-----------------------------------------------------------------------------
        String firstNameFromFile = odczytDanych.daneZPliku(new File("src/main........"));
        Model modelPojazduZpliku = odczytDanych.daneOmodeluPojazdu(new File("src/main/resources/mo"));
        System.out.println(firstNameFromFile);
        System.out.println((modelPojazduZpliku));


         Model modelPojazdu1 = new Model();
        var modelPojazdu2 = new Model("VW", "2020", "przód","Pasat",10000, 2.0, Kolor.ZIELONY);
        var modelPojazdu3 = new Model("BMW", "2021", "tył","faae",20000, 2.0, Kolor.CZERWONY);

        List<String>strings = new ArrayList<>();
        // public static List<String>strings = new ArrayList<>();// <- pozwala korzystać w innych klasach
        strings.add("kon");
        strings.add("pies");
        strings.add("kot");
        System.out.println(strings.get(1));
/*
        modelPojazdu1.setKolor(Kolor.CZERWONY);
        modelPojazdu1.setMarka("Lambo");
        modelPojazdu1.setNazwa("Ursus");
        modelPojazdu1.setPrzebieg(90000);
        modelPojazdu1.setPojemnoscSilnika(10.0);
        modelPojazdu1.setNaped("tył");
        modelPojazdu1.setRocznik("2022");

        System.out.println(modelPojazdu2.toString());
        System.out.println(modelPojazdu1.toString());
        System.out.println(modelPojazdu1);

        System.out.println(modelPojazdu2.getMarka());
        System.out.println(modelPojazdu2.getNaped());
        System.out.println(modelPojazdu2.getNazwa());
//można kolor wpisać z metody Valueoff
        // Kolekcje w Java : Zbiory Danych.
        //4 rodzaje kolekcji : List ( lista), Set - Zbiór, Map - mapa, Queue - kolejka ;


        jeden, dwa, trzy, cztery

        List-> jeden, dwa, trzy, cztery <- gwarantuje nam kolejnosc zbioru danych
        Set-> nie gwaratuje kolejnosci zbioru ( za każdym razem moze byc inna kolejnosc)
        a) jeden, cztery, trzy, dwa

        Map <- przechowuje wartości jako klucz-wartość
        jeden <--> 1
        dwa <--> 2
        trzy <--> 3 etc

        Queue <- kolejka przyjmuje wartości pokole podobne do List'y, natomiast możemy zastosować algorytmy LIFO i FIFO
        LIFO-> Last in First out 1,2,3,4,5,6, [nowy record]<- kiernek czytania od koñca
        FIFO -> First in first out <- jak kolejka w sklepie przy kasie 1,2,3,4,5, [nowy record]

        Najpopularniejsye implementacjeŁ
        List:
            ArrayList() - tablica listy, która nie przechowuje informacji o popprzednim i następnym rekordzie
            LinkedList() -tablica listy, która przechowuje informacji o popprzednim i następnym rekordzie

            String nowyString = "";
            List<Model> [nazwa zmiennej] = newArrayList<>();    nawiasy ostre przechowują konkretny typy danych

            List<String>lista = newArrayList<String>();
            list.add("pierwszy"); <---- add() to metoda dodająca wartości do listy. Jej parametrem jest Object wskazany w <>
            list.add("drugi");
            System.out.println(list.gen(1)); // wypisze drugi
        Set:

INSTRUKCJE WARUNKOWE


    if (condition) {
    //kod
    } else {
    //inny kod
    }
    // nie preferowane
    if (condition) {
    //kod
    {else if (condition 2){
    //inny kod
    }else {
    //inny kod 2
    }

    pętla
    for / forech

    for(int i = 0; i < 10;  i++){ <- stosunek do prostych wyliczeń
    //int i = wartosc startowa pętli
    //i < 10 warunek do kiedy będzie wykonywany
    //i++ - w jaki sposób będzie zmieniana wartość i.
    //wyjątek
    //i ++ inkrementacja inaczej zapis i = i + i
    // i -- dekrementacja inaczej zapis i = i -i
    // ++i - ?
    // --i
    // kod do wykonania
    }
    foreach(){ <- zastosowanie do np. List
    //kod do wykonania

    }

    foreach(Strings element : strings){ <- zastosowanie do np. List
    // String element - pojedyńczy element z string
    // : oddzielenie
 /*
        for (int i = 0; i<2; i++) {
            var tmp:String = strings.get(i);
           if(tmp == "pierwszy"){// sprawdza czy nasza zmienna tmp jest równa wyrażeniu pierwszy
            System.out.println("pierwszy element " + strings.get(i));
           } else {
            System.out.println("inny element: " + strings.get(i));
        }

*/
    /*    // petla drukowanie
        Petla petla = new Petla();
        petla.wyswietl0do100();
//zadanie petla z dodawaniem
        List<Double> listaDouble = new ArrayList<>(Arrays.asList(
                1.0,
                2.0,
                5.0,
                10.0,
                20.0

        ));
        listaDouble.add(30.0);

        petla.dodawanieElementowDouble(listaDouble);

        Dodawanie dodawanieDouble= new Dodawanie();


        System.out.println(dodawanieDouble.dodawanie(1.0, 2.0));
// drukowanie setu tzn wyswietlanie HASHSETU
        petla.wyswietlSet();
*/

/*
LIST:
ArrayList() tablica listy ktora nie przechowuje informacji o poprzednim i nastepnym rekordzie
LinkedList
SET:
HashSet() - nie gwarantuje kolejnosci
TreeSet() gwarantuje kolejnosc
Set<String> nazwaSet = new HashSet<>();
nazwaSet.add("pierwszy")
Set<Integer>intSet = new HashSet<>(Set.of(1,2,3,...maksymalnie 10 elementów));
Zadanie:
Utworzenie metody która wyswietli zadany set
Set<Integer>intSet = new HashSet<>(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11);
następnie przez pętle foreach wyświetlić elementy

 */


    }


// przypominajka  konstrukcji
    // Integer nazwa zmiennej = 0 -  Typ nazwaZmiennej = (przypisanie zmiennej wartosci)0 (wartosc)
    //List<Double> lista = new ArrayList<>() ->
    //List <- interface mechanizmu. Interface - zbiór dostępnych metod do wykonania
    //<TYP> <- deklaracja przechowywanego typu. Jest możliwe String, BigDecimal, Double, Model, Pojazd etc. nie podajemy metod ani klas
    //lista <- nazwaZmiennej
    // =  deklaracja wartości
    //new - w slowniku pojęc
    // ArrayList<>() wybór konkretnej wartości implementacji interacu List
    //Integer - obiektowa reprezentajca liczby która wiąrze ze sobą rożne metody
    //int - ma mniejsze mozliwosci obliczeniowe
    // for(String
    //String element pojedynczy element  z stringiem

}