package pl.cyber.trainees.service;

import pl.cyber.trainees.dziedziczenie.Kolor;
import pl.cyber.trainees.dziedziczenie.Model;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class OdczytDanych {
    public String wprowadzonaWartoscKlawiatury(){
        //wartosci ktore poda urzytkownik -> Scanner obiekt odczytuje dane z klawiatury.
        // System.in obiekt reprezentujacy InputStream, odpowiada za przetwarzanie danych
        Scanner scan = new Scanner(System.in);
        return scan.nextLine();
    }
    // publin String danezPliku ( File plikZew)
    //thows mówi aplikacji (ewentualnie) pojawiający się bład przenieść do miejsca wykonania metody
    // przerzucanie błedów wyżej
   /* public String danezPliku(File plikZew) throws FileNotFoundException {
        Scanner scan = new Scanner(plikZew);
        return scan.nextLine();
    }

    */

    public String daneZPliku(File plikZew) throws FileNotFoundException
    {

        Scanner scan = new Scanner(plikZew);
        return scan.nextLine();
    }
    public Model daneOmodeluPojazdu(File plikZew) throws FileNotFoundException {
        Model modelPojazdu= new Model();
        Scanner scan = new Scanner(plikZew);
        String liniawPliku=scan.nextLine();
        String[] tablicaPliku = liniawPliku.split(", ");

        modelPojazdu.setMarka(tablicaPliku[0]);
        modelPojazdu.setRocznik(tablicaPliku[1]);
        modelPojazdu.setNaped(tablicaPliku[2]);
        modelPojazdu.setNazwa(tablicaPliku[3]);
        modelPojazdu.setPrzebieg(Integer.valueOf(tablicaPliku[4]));
        modelPojazdu.setPojemnoscSilnika(Double.valueOf(tablicaPliku[5]));
        modelPojazdu.setKolor(Kolor.valueOf(tablicaPliku[6]));

        return modelPojazdu;
    }

}
