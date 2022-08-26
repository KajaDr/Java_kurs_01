package pl.cyber.trainees.wyjasnienia.pracaDomowaTydzien32;

import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class BankomatService {
    //2
    Scanner scanU = new Scanner(System.in);
    //5
    Bankomat bankomat = new Bankomat();

    //3
    private boolean menu(final int pozycja) {
        //7
        Integer kwota = 0;
        //8

        try {
            //4
            switch (pozycja) {
                case 1:
                    System.out.println("1. Wpłacam Gotówkę");
                    System.out.println("Prosze podac kwote wplaty");
                    kwota = scanU.nextInt();
                    sprawdzWprowadzaneKwoty(kwota);
                    // nowa metoda - aby
                    bankomat.wplacGotowke(kwota);

                    break;
                case 2:
                    System.out.println("2. Wypłacam Gotówkę");
                    System.out.println("Prosze podac kwote wplaty");
                    kwota = scanU.nextInt();
                    sprawdzWprowadzaneKwoty(kwota);
                    bankomat.sprawdzWyplate(kwota);
                    bankomat.wyplacGotowke(kwota);
                    break;
                case 3:
                    System.out.println("stan konta");
                    System.out.println("Bankomat posiada: " + bankomat.stanKonta());
                    break;
            }
            //8
        } catch (InputMismatchException e) {
            throw new BusinessException("Nie podano prawidłowej liczby odnoszącej się do wpłaty/wypłaty");
        }

        //3
        return pozycja != 4; // zwroci nam informacje true albo false
    }
//metody ukryte doczytać

    //6
    // Początkowy stan konta bankomatu powinien wynosić 0, jednocześnie możemy wpłacać na stan konta wyłącznie następujące liczby (10, 20, 50, 100, 200, 500)
    private void sprawdzWprowadzaneKwoty(final Integer kwota) {
        List<Integer> lista = List.of(10, 20, 50, 100, 200, 500);
        if (!lista.contains(kwota)) {
            // ! negacja - co jesli kwota nie jest zawarta w liscie
            throw new BusinessException("Wprowadź poprawną kwotę" + lista);
        }
    }

    //1
    public void uruchomRozwiazanie1() {
        boolean czyKontynowac;
        do {
            System.out.println("Wybierz dostępną opcję:");
            System.out.println("1. Wpłać Gotówkę");
            System.out.println("2. Wypłać Gotówkę");
            System.out.println("3. Sprawdź stan konta");
            System.out.println("4. Przerwij Operację");

            //var userInfo =scanU.nextInt(); // = java.lang.String userInfo= scanU.etc -> ver. easy
            //Z intigerem i mozliwym bledem
            //2
            Integer userInfo = 4;

            try {
                userInfo = scanU.nextInt();
            } catch (InputMismatchException e) {
                throw new BusinessException("Nie podano prawidłowej liczby z menu");
            }
            //3
            czyKontynowac = menu(userInfo);

        } while (czyKontynowac);
    }

    //zad dodatkowe
    public void uruchomRozwiazanie2() {
        //zd 1.2 nadanie parametrow kart
        List<Karta> karty = List.of(
                new Karta(12345678, 1234, 1000),
                new Karta(33345678, 9876, 2000)
        );
        boolean czyKontynowac;
        //1.3 weryfikacja pinu
        boolean czyPrawidlowaKarta = false;
        //powolanie tymczasowgo obiektu kary, bo nie wiemy co to za karta
        Karta karta = null;
        System.out.println("wloz karte");
        Integer nrKarty = scanU.nextInt();
        System.out.println("podaj pin karty");
        Integer pinKarty = scanU.nextInt();
        //1.4 Pin
        for (Karta el : karty) {
            if (el.getNrKarty().equals(nrKarty)) {
                el.spradzNrPin(pinKarty); // tworzymy nowa metode pozwalajaca sprawdzac pin Karty
                czyPrawidlowaKarta = true;
                karta = el; //przypisanie karcie wartosci
            }
        }
        //1.5 sprawdzanie czy karta jest prawidlowa, jesli nie to wypluwa komunikat

        if (!czyPrawidlowaKarta || karta == null) {
            throw new BusinessException("wprowadzono bledna karte");
        }
/*
        // metoda #2m STREAM
        karta = karty.stream()
                .filter(Objects::nonNull) . filter(element -> Objects.nonNull(element)) // filtr odfiltrowuje wartosci null
        //Wewnątrz streamów np. w metodzie filter używamy tzw. wyrażenia lambda
                .filter(element->element.getNrKarty().equals(nrKarty)) // odfilttowanie pasujaych elementów z listy
                .findFirst()
                .orElseThrow(()->{
                    throw new BusinessException("Wproadzenie blednej karty")
                });


    l122
    List<Karta> karty = List.of(null, new Karta(12345678, 1234, 1000), new Karta(33345678, 9876, 2000));

    l123
    List<Karta> karty = List.of(new Karta(12345678, 1234, 1000), new Karta(33345678, 9876, 2000));

    l124
    przykład1  użytkownik podał 12345678 [
    List<Karta> karty = List.of(new Karta(12345678, 1234, 1000));

    l125
    new Karta(12345678, 1234, 1000)
    ]

    przykład2  użytkownik podał 45678 [
    List<Karta> karty = List.of();

    l126
    zwróci exception

    l128
    przejmuje kontrolę oraz rzuci wyjątek typu BusinessException z opisem Wp

    https://kobietydokodu.pl/niezbednik-juniora-wyrazenia-lambda-i-strumienie/
*/


        do {
            System.out.println("Wybierz dostępną opcję:");
            System.out.println("1. Wpłać Gotówkę");
            System.out.println("2. Wypłać Gotówkę");
            System.out.println("3. Sprawdź stan konta");
            System.out.println("4. Sprawdź stan konta karty");
            System.out.println("0. Przerwij Operację");


            //var userInfo =scanU.nextInt(); // = java.lang.String userInfo= scanU.etc -> ver. easy
            //Z intigerem i mozliwym bledem
            //2
            Integer userInfo = 0;

            try {
                userInfo = scanU.nextInt();
            } catch (InputMismatchException e) {
                throw new BusinessException("Nie podano prawidłowej liczby z menu");
            }
            //3
            czyKontynowac = menu2(userInfo, karta);

        } while (czyKontynowac);
    }

    private boolean menu2(final int pozycja, Karta karta) {
        //7
        Integer kwota = 0;
        //8

        try {
            //4
            switch (pozycja) {
                case 1:
                    System.out.println("1. Wpłacam Gotówkę");
                    System.out.println("Prosze podac kwote wplaty");
                    kwota = scanU.nextInt();
                    // sprawdzWprowadzaneKwoty(kwota);
                    // nowa metoda - aby
                    //bankomat.wplacGotowke(kwota);
                    //karta.wplacGotowke(kwota);
                    dokonajWplaty(kwota, karta);
                    break;
                case 2:
                    System.out.println("2. Wypłacam Gotówkę");
                    System.out.println("Prosze podac kwote wplaty");
                    kwota = scanU.nextInt();
//                    sprawdzWprowadzaneKwoty(kwota);
//                    bankomat.sprawdzWyplate(kwota);
//                    karta.sprawdzWyplate(kwota);
//
//                    bankomat.sprawdzGotowke(kwota);
//                    karta.wyplacGotowk(kwota);
                    dokonajWyplaty(kwota, karta);

                    break;
                case 3:
                    System.out.println("stan konta");
                    System.out.println("Bankomat posiada: " + bankomat.stanKonta());
                    break;
                case 4:
                    System.out.println("saldo konta karty");
                    System.out.println("Bankomat posiada: " + karta.stanKonta());
                    break;
            }
            //8
        } catch (InputMismatchException e) {
            throw new BusinessException("Nie podano prawidłowej liczby odnoszącej się do wpłaty/wypłaty");
        }

        //3
        return pozycja != 0; // zwroci nam informacje true albo false
    }

    private void dokonajWplaty(final Integer kwota, Karta karta) {
        sprawdzWprowadzaneKwoty(kwota);

        bankomat.wplacGotowke(kwota);
        karta.wplacGotowke(kwota);
    }

    private void dokonajWyplaty(final Integer kwota, Karta karta) {
        sprawdzWprowadzaneKwoty(kwota);

        bankomat.sprawdzWyplate(kwota);
        karta.sprawdzWyplate(kwota);

        bankomat.wyplacGotowke(kwota);
        karta.wyplacGotowk(kwota);
    }
}
