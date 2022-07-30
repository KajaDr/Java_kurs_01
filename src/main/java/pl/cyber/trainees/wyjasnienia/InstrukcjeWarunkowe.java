package pl.cyber.trainees.wyjasnienia;

public class InstrukcjeWarunkowe {
    //Metoda która zwróci true/false jeśli podana liczba w parametrze nie jest równa 10


    public Integer number1;

    public void uruchom(){
      //  wyswietlSwitch(7);
       // zadanie5();
        jakaPlec(Plec.KOBIETA);

    }
    public InstrukcjeWarunkowe(Integer number) {
        this.number1 = number;

    }
    public boolean sprawdzanieRownosci(Integer number1) {
        if (this.number1 != 10) {
            return true;
        } else {
            System.out.println("liczba równa 10");
        }
        return false;
    }
// 2 możliwosc
    // public boolean sprawdzenieRownosci(Integer liczba){
    //   if(....)


    /*
    Instrukcja warunkowa if
    Budowa if'a

    CONDITION (BOLEAN) inaczej warunek sprawdzający np i<0, a+b = 2, 2%2 = 0 itp.
    if (CONDITION) {
    //kod jeśli warunek jest spełniony <true>
    }
    -----------------------------------
    -> Else w przeciwnym wypadku
    (condition np 2+2=4)
    if (Condition np 1+5){ (false)
    }else{
    // wtedy kiedy warunek nie zostal spełniony
    }
    -----------------------------------
    --> z dodatkowym warunkiem
    (condition np 2+2=4)
    if(condition np 1+5){

    }else  if (np 1+3) { true
    inny warunek

    } else {

    }
     */

    /*
   *
równoznaczne zapisy

      case "1":  //  condition == "1"
        println("To jest poniedziałek");
        break;
      case "Poniedziałek":
        println("To jest poniedziałek");
        break;


     case "1":  //  condition == "1"
      case "Poniedziałek":
        println("To jest poniedziałek");
        break;


    if(conditon = 1 || conditon = "Poniedziałek") {
Od Szkolenie Testuj do wszystkich 10:51 AM
Wszystkie wartości case muszą byc unikalne

    Każda instrukcja case może (ale nie musi) mieć instrukcję break.
    Jest ona opcjonalna. Gdy Java natrafi na instrukcję break, zakończy wykonanie instrukcji switch.
    Jeśli instrukcja break nie zostanie znaleziona, sprawadzany jest następny przypadek (następny case).


Przykład:
    np. weryfikacje wprowadzonego alfabetu jako konkretna litera alfabetu tj. a -> z
    np. weryfikacja wprowadzonych liczb od 1 do n

    switch (condition) {
        case 1:
          break;
        case 2:
          break;
        case 3:
          break;
        case 4:
          break;
        case n:
          break;
        default:
    }
alternatywa powyższego w postaci if:
if(condition == 1) {
} else if(condition == 2) {

} else if(condition == 3) {

} else if(condition == 4) {

} else if(condition == n) {

} else {

}

switch(condition) {
  case x:
    // Blok kodu, jeśli wartość x zgadza się ze zmianną warunkową
    break;
  case y:
    // Blok kodu, j
switch(condition) {
  case x:
    // Blok kodu, jeśli wartość x zgadza się ze zmianną warunkową
    break;
  case y:
    // Blok kodu, jeśli wartość y zgadza się ze zmianną warunkową
    break;
  default:
    // Blok kodu, gdy nie jest spełniony żaden z powyższych przypadków
}
     */
// Zadanie utwórz metode któa na podany parametr wejsciowy wyswietli odpowiadający tydzien

   public void wyswietlSwitch(Integer jakiDzienTygodnia){

        switch (jakiDzienTygodnia){
            case 1: {System.out.println("monday"); break;}
            case 2: {System.out.println("tuesday"); break;}
            case 3: {System.out.println("wednesday"); break;}
            case 4:
            default: System.out.println("nieprawidłowy dzien");
        }

    }

    /*

  Zadanie Wykonać metodę która będzie iterować od 1 do 50 i
  wyświetli w konsoli odpowiednie napisy:

dla 0 → Wyświetlam zero
dla 5 → Wyświetlam 5
dla 10 → To jest 10
dla 30 → To jest liczba 30
dla 49 → To jest liczba 49
dla pozostałych → Wskazana liczba jest inna niż oczekiwana


   */
    public  void zadanie5(){
        for(int i=0; i<=50; i++){ //<-- z petla
            switch (i){
                case 0: System.out.println("Wyświetlam zero"); break;
                case 5: System.out.println(" Wyświetlam 5");  break;
                case 10: System.out.println("To jest 10");  break;
                case 30: System.out.println("To jest liczba 30");  break;
                case 49: System.out.println("To jest liczba 49"); break;
                default: System.out.println("Wskazana liczba jest inna niż oczekiwana");
            }
        }
    }

    //Dla KOBIETA wyświetlić Jestem Kobietą dla MEZCZYZNA wyświetlić Jestem mężczyzną
    //wykonać przy użyciu konstrukcji if a potem przez switch


    enum Plec{KOBIETA,MEZCZYCZNA} //<--- jako klasa odpowiednik obiektowy, globalna zmienna

    private void jakaPlec(Plec plec){
        switch (plec){
            case KOBIETA: System.out.println("Jestem Kobietą"); break;
            case MEZCZYCZNA:System.out.println("Jestem Mezczyzna");break;
            default:
                System.out.println("plec nie znana");
        }

        if (plec == Plec.KOBIETA){
            System.out.println(("Jestem Kobietą"));
        } else if (plec== Plec.MEZCZYCZNA) {
            System.out.println("Jestem Mezczyzna");
        }else{
            System.out.println("plec nie znana");
            }
        }
    public void jakaPlec2(String plec){
        switch (plec){
            case "kobieta": System.out.println("Jestem Kobietą"); break;
            case "MEZCZYCZNA":System.out.println("Jestem Mezczyzna");break;
            default:
                System.out.println("plec nie znana");
        }

        if (plec == "KOBIETA"){
            System.out.println(("Jestem Kobietą"));
        } else if (plec== "mezczyzna") {
            System.out.println("Jestem Mezczyzna");
        }else{
            System.out.println("plec nie znana");
        }
    }


}

