package pl.cyber.trainees.spotkania;

import pl.cyber.trainees.spotkania.kalkulator_foreach.Dodawanie;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Petla {
    // Zadanie utworzyć metodę która wyświetli liczby całkowite od 1 do 100
    public void wyswietl0do100() {
        for (int i = 0; i < 100; i++) {
            if (i < 100) {
                System.out.print(i + 1);
                System.out.print(", ");
            } else {

            }

        }

        System.out.println();
    }

    public void dodawanieElementowDouble(List<Double> lista) {
        Double result = 0.0;
        for (Double elemnt : lista) {
            System.out.println("Teraz wykonuję operacje + element" + "+" + result);
            result = Dodawanie.dodawanie(result, elemnt);

            System.out.println("Wynik dodawanie listy " + result);


        }
    }

    public void wyswietlSet() {
        Set<Integer> intSet = new HashSet<>(Set.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
        for (Integer element : intSet) {
            System.out.println("Element setu : " + element);
        }
    }


}
