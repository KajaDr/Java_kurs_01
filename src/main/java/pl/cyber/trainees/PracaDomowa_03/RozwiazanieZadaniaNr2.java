package pl.cyber.trainees.PracaDomowa_03;

import pl.cyber.trainees.dziedziczenie.Model;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.LinkedList;
import java.util.List;

public class RozwiazanieZadaniaNr2 {
    // treść zadania

    public void rozwiazanie() throws FileNotFoundException {

// podczytanie plików
        Cars readData2 = new Cars();
        var car01 =  readData2.carDetailParameter(new File("src/main/resources/samochody/pojazd_1"));
        var car02=  readData2.carDetailParameter(new File("src/main/resources/samochody/pojazd_2"));
        var car03 =  readData2.carDetailParameter(new File("src/main/resources/samochody/pojazd_3"));

//stworzenie listy z samochodów
        List<Model> cars = new LinkedList<>();
        cars.add(car01);
        cars.add(car02);
        cars.add(car03);

//pętla
Integer sumaPrzebiegu = 0;
        for (int i = 0; i<cars.size(); i++) {
            System.out.println("Samochod nr" + (i+1) + " : " + cars.get(i));
            sumaPrzebiegu = sumaPrzebiegu + cars.get(i).getPrzebieg();
        }

        System.out.println("Suma " + sumaPrzebiegu);
        System.out.print("Pojemości ");
        for (Model element : cars) {
            //if na ewentualne przecinek/kropkę na końcu
            System.out.print(element.getPojemnoscSilnika());
        }



//        int licznik = 1;
//        for (Model element : cars) {
//            System.out.println("Samochod nr" + licznik + " : " + element);
//            licznik++;
//        }
    }

}
