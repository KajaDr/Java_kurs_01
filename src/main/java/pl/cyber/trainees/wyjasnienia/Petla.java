package pl.cyber.trainees.wyjasnienia;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Petla {
    /*
    Petla for i foreach

    BUDOWA for

   // nie stosujemy ; między )   {
   // kod wykonania
   //println
   //dodawanie licz do siebie
   //dodawanie do listy elementow

   int= 0- inicjalizacja parametru poczatkowego <do przechodzenia pętli>
   i<5  warunek spełnienia kolejnego przejścia
   i++ -inkrementacja wartości poczatkowej o 1

    for(int i = 0 ; i<5; i ++) {

    }
    JAK NIE STOSOWAC FOR
    for(int i = 0 ; i<5; i ++); {

   }
   PUŁAPKA
    for(int i = 0 ; i=-5; i ++); {   <----- pętla nieskonczona
    println(i);
   ----------------------------
   BUDOWA foreach
   for(TypDanych elementListy: lista){
   - bezposrenio pracuje sie na liscie
   UWAGA!!
   usuwanie elementów z listy
   do rozwiązania usuwania elementow stosuje się wyłącznie
    for -->(for(int i = 0 ; i<5; i ++) {)

   }

     */

    // Zadanie nr 1
// Wykonać metodę która przyjmie jako parametr List<BigDecimal>, następnie wykona następujące zagadnienia:
// a) wyświetli każdy element listy jeden po drugim
// b) każdy element listy doda do siebie.

    public void uruchom() {
        List<BigDecimal> list = new ArrayList<>();
        list.add(BigDecimal.valueOf(10.0));
        list.add(BigDecimal.valueOf(2.0));
        list.add(BigDecimal.valueOf(5.6));
        list.add(BigDecimal.valueOf(21.8));
        list.add(BigDecimal.valueOf(2.1));
        list.add(BigDecimal.valueOf(41.0));
        list.add(BigDecimal.valueOf(14.0));
        list.add(BigDecimal.valueOf(1.0));
        list.add(BigDecimal.valueOf(4.0));
        //System.out.println("choinka 1");
        // rozwiazanieZadanie1(list); // odwołoanie sie do metody
        // ktora jest w tej samej klasie

        zadanie3();

        //choinkaRozbudowana(5);
        //System.out.println("choinka 2");


    }


    private void rozwiazanieZadanie1(List<BigDecimal> list) {
        BigDecimal sumaLiczb = BigDecimal.ZERO;
        //foreach petla, lepszym rozwiazanie dla listy-> liczba wartosc z listy
        for (BigDecimal liczba : list
        ) {
            System.out.println(liczba);
            sumaLiczb = sumaLiczb.add(liczba);
        }

        System.out.println("suma liczb" + sumaLiczb);


        //   for (int i=0; i<list.size(); i++){
        //     System.out.println(i);
    }

    //Zadanie Choinka
    //klasyczne fory (a dokładnie 2 fory)
    //
    //metoda będzie przyjmować parametr jako wysokość

    private void choinkaRozbudowana(Integer wysokoscChoinki) {
    /*
    int <-> Integer
    double <-> Double
    BigInteger, BigDecimal
    long <-> Long
    etc.
     */

        for (int wysokosc = 0; wysokosc < wysokoscChoinki; wysokosc++) {
            for (int szerokosc = 0; szerokosc < wysokoscChoinki * 2; szerokosc++) {
                if (szerokosc < (wysokoscChoinki - wysokosc) || szerokosc > (wysokoscChoinki + wysokosc)) {
                    System.out.print(" ");
                } else {
                    System.out.print("*");
                }
            }
            System.out.println();
        }


    }

    private void choinkaRozbudowana2(Integer wysokoscChoinki) {
        Integer iloscGwiazdekWPodstawie = wysokoscChoinki + 1;
        for (int wysokosc = 1; wysokosc < wysokoscChoinki; wysokosc++) {
            for (int szerokosc = 0; szerokosc < iloscGwiazdekWPodstawie; szerokosc++) {
                if (szerokosc < iloscGwiazdekWPodstawie) {
                    System.out.println("*");
                } else {
                    System.out.println("");
                }
            }
            System.out.println();
        }
    }

    //Zadanie ??
    //Utworzyć metodę, która przejdzie po liczbach od 1 do 100 natomiast wyświetli tylko
    // te które są podzielne przez 5

    private void zadanie3(){
//        liczba = 1;
        Integer sumaLiczb=0;
        Integer iloscLiczb=0;



        for(int liczba = 1; liczba<=100; liczba++){
            if (liczba % 5 == 0){
                sumaLiczb =sumaLiczb +liczba;
                iloscLiczb+=0;
                System.out.println("Liczba podzielna przez 5:  " + liczba);

                System.out.println("Suma po kazdym przebiegu  :  " +sumaLiczb);

            }

            System.out.println("Liczba podzielna przez 5:  " + liczba);

            System.out.println("Suma po kazdym przebiegu  :  " +sumaLiczb);



        }



    }


}


     /*   private void choinkaRozbudowana(Integer wysokoscChoinki) {

    int <-> Integer
    double <-> Double
    BigInteger, BigDecimal
    long <-> Long
    etc.
private void choinkaRozbudowana2(Integer wysokoscChoinki) {

    Integer maksymalnaLiczbaGwiazdek = (wysokoscChoinki * 2) - 1;
    System.out.println("Liczba gwiazdek w podstawie: " + maksymalnaLiczbaGwiazdek);
    System.out.println();

    for (int x = 1; x <= maksymalnaLiczbaGwiazdek; x += 2) {  //x = x + 2 ///  x++
      Integer spacje = (maksymalnaLiczbaGwiazdek - x) / 2;
      for (int y = 0; y < spacje + x; y++) {
        if (y < spacje) {
          System.out.print(" ");
        } else {
          System.out.print("*");
        }
      }
      System.out.println();
    }
  }
*/

