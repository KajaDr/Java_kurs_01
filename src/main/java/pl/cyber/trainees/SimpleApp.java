package pl.cyber.trainees;


import pl.cyber.trainees.dziedziczenie.Kolor;
import pl.cyber.trainees.dziedziczenie.Model;

public class SimpleApp {

// Ctrl +P podpowiadani w użyciu metod/deklaracji obiektów dostępnch parametrów
    public static void main(String[] args) {
         Model modelPojazdu1 = new Model();
        var modelPojazdu2 = new Model("VW", "2020", "przód","Pasat",10000, 2.0, Kolor.ZIELONY);
        var modelPojazdu3 = new Model("BMW", "2021", "tył","faae",20000, 2.0, Kolor.CZERWONY);

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

    }


}