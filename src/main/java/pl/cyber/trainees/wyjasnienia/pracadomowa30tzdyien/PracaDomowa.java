package pl.cyber.trainees.wyjasnienia.pracadomowa30tzdyien;

import java.util.Scanner;

public class PracaDomowa {

    //Zad1. praca domowa -> zamienic for na while oprocz
    // do domu metodę public void tylkoPodzielne() { przerobić na while.

    //Utworzyć metodę, która przejdzie po liczbach od 1 do 100 natomiast wyświetli tylko
    // te które są podzielne przez 5

    public void tylkoPodzielne() {    //<-nie działa
              int i = 0;
            while (i <= 10 && i % 5 == 0) {
              System.out.println( " liczba podzielna przez 5 to :"+i);
            i++;
       }
        /*
        int liczba = 0; //<-działa
        while (liczba <= 100 && liczba % 5 == 0) {
            System.out.println(" liczba podzielna przez 5 to :" +liczba) ;
            liczba++;
        }

         */
    }
    // Podnos licznik x2 do momentu aż liczba nie przekroczy 100
    // oraz wyswietl ile razy pętla sięwykonała

    public void do100(){
        System.out.println("hej podaj liczbe");
        Scanner scanner= new Scanner(System.in);
        Integer liczba= scanner.nextInt();

        int sumaLiczby = 0;
        for (int i = 1; liczba*2<=100;i++){
            i+=sumaLiczby;
            liczba=liczba*2;
            System.out.println("nr "+(i) +" petla");
            System.out.println(liczba);

        }
        System.out.println("WHILE ZNOW NIE DZIALA");

        while (liczba*2<=100){
            liczba= 2* liczba;
            sumaLiczby=liczba;
            liczba++;

            System.out.println(liczba);
            System.out.println(sumaLiczby);
        }



        }
    }

    // wymyslec zadanie na for i while
//nowa klasa

