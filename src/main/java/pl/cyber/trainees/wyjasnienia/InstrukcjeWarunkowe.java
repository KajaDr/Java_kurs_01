package pl.cyber.trainees.wyjasnienia;

public class InstrukcjeWarunkowe {
    //Metoda która zwróci true/false jeśli podana liczba w parametrze nie jest równa 10

    public Integer number1;

    public boolean InstrukcjeWarunkowe(Integer number) {
            if (this.number1 != 10) {
                return true;
            } else {
                System.out.println("liczba równa 10");
            }
            return false;
        }
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
}
