package pl.cyber.trainees.PracaDomowa_03;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class CarApp2 {
    public static void main(String[] args) throws FileNotFoundException {
// podczytanie plików
        Cars readData2 = new Cars();
        String car01 = "\ncar 01: " + readData2.DateFromFile(new File("src/main/resources/samochody/pojazd_1"));
        String car02= "\ncar 02: " + readData2.DateFromFile(new File("src/main/resources/samochody/pojazd_2"));
        String car03 = "\ncar 03: " + readData2.DateFromFile(new File("src/main/resources/samochody/pojazd_3"));

//stworzenie listy z samochodów
        List<String> cars = new LinkedList<>();
        cars.add(car01);
        cars.add(car02);
        cars.add(car03);

//pętla
            LoopCar loopCar= new LoopCar();
            for( String newCar: cars){

                    if (newCar == car01){
                        System.out.println("All Cars: " + cars);
                    } else {
                        System.out.println("");

                    }
                }
      //      while (scan.hasNext()) {
        //        modelePojazdu.add(getModelPojazduZPliku(scan.nextLine()))
            }
            }

    private static class LoopCar {
    }
}
