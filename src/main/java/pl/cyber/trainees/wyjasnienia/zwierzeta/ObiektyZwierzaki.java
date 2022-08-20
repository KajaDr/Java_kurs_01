package pl.cyber.trainees.wyjasnienia.zwierzeta;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class ObiektyZwierzaki {
    public void uruchom(){
        Kot kot = new Kot("Ruda", LocalDate.of(2009, 3,13),3.5,"Kaja");
        System.out.println(kot.przedstawSie());

        zadanie2();

    }
      /*
  zadanie nr 2

  utworzyć listę 3 kotów a następnie niech każdy z nich się przedstawi.
   */

    private void zadanie2(){
        List<Kot> koty= new ArrayList<>();
        koty.add(new Kot("Siwa", LocalDate.of(2009, 3,13),3.5,"Pioter"));
        koty.add(new Kot("Julia", LocalDate.of(2009, 3,13),3.5,"Darek"));
        koty.add(new Kot("Minia", LocalDate.of(2009, 3,13),3.5,"Kaja"));

        for (Kot kot :koty){
            System.out.println(kot.przedstawSie());
        }
    }
    // Zadanie 3
    /*
    utworz liste 3 kotow, dodac je do List<Zwierze> a nastepnie niech kazdy z nich sie przedstawi
     */
    private void zad3(){
            List<Kot> zwierze= new ArrayList<>();
            zwierze.add(new Kot("Siwa", LocalDate.of(2009, 3,13),3.5,"Pioter"));
            zwierze.add(new Kot("Julia", LocalDate.of(2009, 3,13),3.5,"Darek"));
            zwierze.add(new Kot("Minia", LocalDate.of(2009, 3,13),3.5,"Kaja"));

            for (Kot kot :zwierze){
                System.out.println(kot.przedstawSie());
            }
    }

    /*
    private void zadanie2() {

//    var kot1 = new Kot("Felix", LocalDate.of(2020, 7, 2), 3.0, "Mariusz");
//    var kot2 = new Kot("Felix2", LocalDate.of(2020, 8, 2), 3.5, "Mariusz");
//    var kot3 = new Kot("Felix3", LocalDate.of(2020, 9, 2), 4.0, "Mariusz");
//
//    List<Kot> koty = new ArrayList<>();
//    koty.add(kot1);
//    koty.add(kot2);
//    koty.add(kot3);

        List<Kot> koty = new ArrayList<>();
        koty.add(new Kot("Felix", LocalDate.of(2020, 7, 2), 3.0, "Mariusz"));
        koty.add(new Kot("Felix2", LocalDate.of(2020, 8, 2), 3.5, "Mariusz"));
        koty.add(new Kot("Felix3", LocalDate.of(2020, 9, 2), 4.0, "Mariusz"));

        for (Kot kot : koty) {
            System.out.println(kot.przedstawSie());
        }
    }
    /* Werja alternatywna
    private void zadanie2() {

//    var kot1 = new Kot("Felix", LocalDate.of(2020, 7, 2), 3.0, "Mariusz");
//    var kot2 = new Kot("Felix2", LocalDate.of(2020, 8, 2), 3.5, "Mariusz");
//    var kot3 = new Kot("Felix3", LocalDate.of(2020, 9, 2), 4.0, "Mariusz");
//
//    List<Kot> koty = new ArrayList<>();
//    koty.add(kot1);
//    koty.add(kot2);
//    koty.add(kot3);

        List<Kot> koty = new ArrayList<>();
        koty.add(new Kot("Felix", LocalDate.of(2020, 7, 2), 3.0, "Mariusz"));
        koty.add(new Kot("Felix2", LocalDate.of(2020, 8, 2), 3.5, "Mariusz"));
        koty.add(new Kot("Felix3", LocalDate.of(2020, 9, 2), 4.0, "Mariusz"));

        for (Kot kot : koty) {
            System.out.println(kot.przedstawSie());
        }
    }

     */

     /*
    zadanie nr 4
    utworzymy klase Pies, ktora dziedziczy po klasie Zwierze
    utworzyć listę 3 kotów, 1 psa następnie  dodać je do List<Zwierze>
    a następnie niech każdy z nich się przedstawi.
    Dodatkowo wywołać metodę (skorzystamy z przysłaniania metod) dajGlos()
   */



    /*
    zadanie nr 5
    Utworzyć Enum o nazwie ZwierzeEnum w którym będą dostępne opcje:
    - KOT
    - PIES
    utworzyć listę 3 kotów, 1 psa poprzez utworzenie pliku zwierzeta.txt
    następnie odczytaniu pliku przez aplikację.
    następnie  dodać zwierząt do List<Zwierze> przy użyciu enuma.
    a następnie niech każdy z nich się przedstawi.
    Dodatkowo wywołać metodę (skorzystamy z przysłaniania metod) dajGlos()
   */

}
