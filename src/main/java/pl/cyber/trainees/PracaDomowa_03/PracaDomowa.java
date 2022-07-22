package pl.cyber.trainees.PracaDomowa_03;

import java.io.File;
import java.io.FileNotFoundException;

public class PracaDomowa {
    public static void main(String[] args) throws FileNotFoundException {

        Cars readData = new Cars();
        String carModelFromFile = readData.DateFromFile(new File("src/main/resources/samochody/pojazd_1"));
        System.out.println(carModelFromFile);

        String carModelFromFile2 = readData.DateFromFile(new File("src/main/resources/samochody/pojazd_2"));
        System.out.println(carModelFromFile2);

        String carModelFromFile3 = readData.DateFromFile(new File("src/main/resources/samochody/pojazd_3"));
        System.out.println(carModelFromFile3);

        CarApp2 readData3 = new CarApp2();
        var LoopCar = readData;
        System.out.println(LoopCar);






    }
}
