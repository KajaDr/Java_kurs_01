package pl.cyber.trainees.wyjasnienia;

import java.util.ArrayList;
import java.util.Random;

public class Tablice {
    /*
    Tworzenie tablicy
    Typdanych[] nazwa_ tablicy = new TypDanych[(int)zakrestablicy]

    np. Integer[] tablica Int= new Integer[10]
    m#1 Integer[]nowaTablica = {1,2,3,4,5};

    zalecana forma:
    Integer[] nowaTablica = new Integer[5];
    nowaTablica[0]=1;
    nowaTablica[1]=2;
    nowaTablica[2]=3;
    nowaTablica[3]=4;
    nowaTablica[4]=5;
    _________________________
    Tablice wielowymiarowe
    TypyDanych [][] nazwa_tablicy = new TypDanych[(int)zakrestablicy_1][(int)zakrestablicy_2]
    TypyDanych [][] nazwa_tablicy=new Integer [10][10]
    nowaTablica[0][0]=1;
    nowaTablica[0][1]=1;
    nowaTablica[1][0]=1;
    nowaTablica[1][1]=1;

_____________
Odwołanie sie do tablic
sout(nowaTablica[0]);
sout(nowaTablica[0][0]);
----------------
Częsty błąd przy tablicach:
  ArrayIndexOutOfBoundsException - Przekroczenie wielkości tablicy
  Integer[] tablicaInt = new Integer[10];
  tablicaInt[11] = 2;
   */
//zadanie
    // Utworz  tablice o wymiarze 5 elementow i przypisac do niej "randomowe wartości
    //wyswietlenie wszystkich elementow tablicy( while/for)
    public void uruchom() {
        // zad1Tablice();
        wyswietlTabliceZRandom();
        wyswietlTabliceZRandom1();
    }

    private void zad1Tablice() {

        Integer[] tablica1 = new Integer[5];
        tablica1[0] = 2;
        tablica1[1] = 3;
        tablica1[2] = 3;
        tablica1[3] = 5;
        tablica1[4] = 5;


        System.out.println("While");
        int n = 0;
        while (n < tablica1.length) {
            System.out.println(tablica1[n]);
            n++; // pamietac o inkrementatorze !
        }
        System.out.println("DLA For");

        for (int i = 0; i < tablica1.length; i++) {
            System.out.println(tablica1[i]);
        }
        System.out.println("DLA Foreach");
        for (Integer element : tablica1
        ) {
            System.out.println(tablica1[element]);

        }


    }

    private void wyswietlTabliceZRandom() {
        Integer[] tablica1 = new Integer[5];

        Random rand = new Random();

        //użyć wystarczy rand.nextInt();
        // rand.nextInt(liczba);
        // rand.nextInt(200); -> losowanie liczb z zakresu 0 - 200
        // rand.nextInt(150)+50; -> losowanie liczb z zakresu 50 - 200
        // rand.nextInt(KoniecZakresu-PoczątekZakresu)+Początek zakresu;

        for (int i = 0; i < tablica1.length; i++) {
            tablica1[i] = rand.nextInt(150) + 50;
        }

        for (Integer element :
                tablica1) {
            System.out.println(element);
        }
        //Zadanie 3
        //Zadanie 2 przerobić w taki spobób aby tablicę zastąpić listą

        ArrayList<Integer> lista = new ArrayList<>(tablica1.length); //<- nie musi byc podana dlugosc listy,
        // lista moze byc nieskocznoa

        for (Integer element : tablica1) {
            lista.add(element);

        }
        System.out.println(lista);
    }
    //Zadanie 4
    //na przykładzie powyższych zadań utworzyć tablicę wielowymiarową 10x10 i
    // wypełnić losowymi danych.
    private void wyswietlTabliceZRandom1() {
        Integer[][] tablica1 = new Integer[5][5];

        Random rand2 = new Random();

        for (int i = 0; i < tablica1.length; i++) {
            for (int j = 0; j < tablica1.length; j++) {
                tablica1[i][j] = rand2.nextInt(150) + 50;

            }
        }

        for (int i = 0; i < tablica1.length; i++) {
            for (int j = 0; j < tablica1.length; j++) {

                System.out.println(tablica1[i][j]);

            }
        }


    }
}