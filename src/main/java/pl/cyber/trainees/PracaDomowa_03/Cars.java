package pl.cyber.trainees.PracaDomowa_03;

import pl.cyber.trainees.dziedziczenie.Kolor;
import pl.cyber.trainees.dziedziczenie.Model;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

// czytanie danych samochodów
public class Cars {
    public String DateFromFile (File externalFile) throws FileNotFoundException{
        Scanner scan1= new Scanner(externalFile);
        return scan1.nextLine();

    }
    public Model carDetailParameter (File externalFile) throws FileNotFoundException{
        Model carModel = new Model();
        Scanner scan1 = new Scanner(externalFile);
        String lineInFile = scan1.nextLine();
        String[] boardFile =lineInFile.split(", ");

        carModel.setMarka(boardFile[0]);
        carModel.setRocznik(boardFile[1]);
        carModel.setNaped(boardFile[2]);
        carModel.setNazwa(boardFile[3]);
        carModel.setPrzebieg(Integer.valueOf(boardFile[4]));
        carModel.setPojemnoscSilnika(Double.valueOf(boardFile[4]));
        carModel.setKolor(Kolor.valueOf(boardFile[6]));

        return carModel;



    }
}
