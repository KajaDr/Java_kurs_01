package pl.cyber.trainees.wyjasnienia.pracadomowa30tzdyien;

import java.util.ArrayList;
import java.util.Scanner;

public class MojeZadanie {

    // petla z zwracalna iloscia obiektow na liscie. Petla pobiera liczby i dodaje je do swojej listy.
    //Drukuje liste
    public void petla(Integer number) {
        ArrayList<Integer> lista = new ArrayList<>();
        int i = 0;
        for (i = 0; i < number; i++) {
            System.out.println("podaj liczbę nr" + i);
            Scanner scanner = new Scanner(System.in);
            Integer pierwsze = Integer.valueOf(scanner.nextLine());
            lista.add(Integer.valueOf(pierwsze));
        }
        System.out.println(lista);
    }
// petla w ktorej z pozycji konsoli decydujesz ile ma mieć obiektow na liscie.
    // obiekty na liscie porównywane są do liczby 5
    public void petlaWhile() {
        ArrayList<Integer> lista = new ArrayList<>();

        System.out.println("podaj ilosc objektow w liscie");
        Scanner scanner1 = new Scanner(System.in);
        Integer number = Integer.valueOf(scanner1.nextLine());

        int i = 0;
        while (i < number) {
            System.out.println("podaj liczbę nr" + (i + 1));
            Scanner scanner = new Scanner(System.in);
            Integer pierwsze = Integer.valueOf(scanner.nextLine());
            lista.add(Integer.valueOf(pierwsze));
            i++;
        }
        System.out.println(lista);

        for (Integer pierwsza : lista) {
            if (pierwsza < 5) {
                System.out.println("mniejsze od 5 > " + pierwsza);
            } else {
                System.out.println("wieksze od 5 < " + pierwsza);
            }
        }
    }
}