package pl.cyber.trainees.wyjasnienia.pracadomowa30tzdyien;

import java.util.Scanner;

public class Algoritmika {
    public void uruchom(){
        silniaRekurencja(5);
        System.out.println(silniaRekurencja(5));

    }

    public void algorytm(){
        System.out.println("podaj liczbe");
        Scanner scan = new Scanner(System.in);
Integer n =scan.nextInt();
Integer s=1;
Integer i =0;
        System.out.println("jestem przed While i: "+ i + "n "+ n+ "s " + s);
        while (i<=n){
            System.out.println("jestem w While i: "+ i + "n "+ n+ "s " + s + " Wykonuje mnozenie s oraz podniesienie i o 1");
            s=s*i;
            i= i+1;
            System.out.println("jestem na koncu While i: "+ i + "n "+ n+ "s " + s);

        }
        System.out.println("Wynik "+s);

        s=1;
        for (int j=1;j<=n; j++){
            s=s*j;
        }
        System.out.println("Wynik "+s);

    }
    // rekurencja - metoda ktora wywołu sie przez samą siebie
    // nie może byc void
    private Integer silniaRekurencja(Integer n){
        if(n>1) {
            return n * silniaRekurencja(n - 1);  // metoda wykonuje sie przez sama siebie
        }else{
            return 1;
        }
    }
    // ciag Fibbonaciego jako praca domowa


}
