package pl.cyber.trainees.pracaDomowa29Tydzien;

public class ParzystaNIeParzysta {
    public void tekstPnP(Integer numer){
        System.out.println("Zadanie nr" + numer);
    }
//3. Napisz metodę, która jako argument przyjmuje liczbę i zwraca true jeśli liczba jest parzysta,
//parzystość sprawdzamy przez znak % 2 inaczej sprawdzamy jej podzielność przez 2
//np. 2 % 2
    public Integer parzystaNIeParzysta(Integer number2){
        if (number2 % 2 == 0){
            System.out.println(number2+": Czy liczba jest podzielna przez 2: true");
        } else{
            System.out.println(number2+": Czy liczba jest podzielna przez 2 false");
        }
        return number2;
    }
    //Napisz metodę, która jako argument przyjmuje liczbę i zwraca true jeśli liczba jest podzielna przez 3 i przez 5

    public boolean parzystaNieParzysta2(Integer number3) {
        if (number3 % 3 == 0 && number3 % 5 == 0) {
            return true;
        }
        return false;
    }
//5. Napisz metodę, która jako argument przyjmuje liczbę i zwraca go podniesionego do 3 potęgi,
//podniesienie do potęgi realizujemy przez bibliotekę Math i jej metodę pow(liczba, doJakiejPotęgi)
//np. Math.pow(2,3)

    public void potega(Integer number4){
        double wartosc = Math.pow(number4,3);
        System.out.println("potega liczby"+number4+ "jest rowna"+wartosc);

    }


//6. Napisz metodę, która jako argument przyjmuje liczbę i zwraca jej pierwiastek kwadratowy
//pierwiastek kwadratowy realizujemy przez bibliotekę Math i jej metodę sqrt(number)
//Math.sqrt(number)

    public void pierwiastek(Integer number5){
        double wartosc = Math.sqrt(number5);
        System.out.println("potega liczby  "+number5+ " jest rowna  "+wartosc);

    }

}

