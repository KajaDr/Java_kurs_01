package pl.cyber.trainees.PracaDomowa_03;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;

public class CarApp2 {
    public static void main(String[] args) throws FileNotFoundException {
// podczytanie plików
        Cars readData2 = new Cars();
        String car01 = readData2.DateFromFile(new File("src/main/resources/samochody/pojazd_1"));
        String car02= readData2.DateFromFile(new File("src/main/resources/samochody/pojazd_2"));
        String car03 = readData2.DateFromFile(new File("src/main/resources/samochody/pojazd_3"));

        System.out.println(car01);
//stworzenie listy z samochodów
        List<String> cars = new ArrayList<>();
        cars.add(car01);
        cars.add(car02);
        cars.add(car03);

        class LoopCar {
            LoopCar loopCar= new LoopCar();
            for( String newCar: cars){

                    if (newCar == car01){
                        System.out.println("car: " + car01);
                    } else {

                    }
                }
            }

        }
    }