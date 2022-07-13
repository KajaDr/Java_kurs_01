package pl.cyber.trainees;


import pl.cyber.trainees.dziedziczenie.Kolor;
import pl.cyber.trainees.dziedziczenie.Model;

public class SimpleApp {

// Ctrl +P podpowiadani w użyciu metod/deklaracji obiektów dostępnch parametrów
    public static void main(String[] args) {
         Model modelPojazdu1 = new Model();
        var modelPojazdu2 = new Model("VW", "2020", "przód","Pasat",10000, 2.0, Kolor.ZIELONY);
        var modelPojazdu3 = new Model("BMW", "2021", "tył","faae",20000, 2.0, Kolor.CZERWONY);

        System.out.println(modelPojazdu2.toString());

        System.out.println(modelPojazdu2.getMarka());
        System.out.println(modelPojazdu2.getNaped());
        System.out.println(modelPojazdu2.getNazwa());
//można kolor wpisać z metody Valueoff

    }


}