package pl.cyber.trainees.PracaDomowa_03;

import java.io.File;
import java.io.FileNotFoundException;

public class RozwiazanieZadaniaNr3 {
    // treść zadania

    public void rozwiazanie() throws FileNotFoundException {

        Cars readData = new Cars();
        String carModelFromFile = readData.DateFromFile(new File("src/main/resources/samochody/pojazd_1"));
        System.out.println(carModelFromFile);

        String carModelFromFile2 = readData.DateFromFile(new File("src/main/resources/samochody/pojazd_2"));
        System.out.println(carModelFromFile2);

        String carModelFromFile3 = readData.DateFromFile(new File("src/main/resources/samochody/pojazd_3"));
        System.out.println(carModelFromFile3);

        KlasaUruchomieniowa readData3 = new KlasaUruchomieniowa();
        var LoopCar = readData;
        System.out.println(LoopCar);
    }

}
