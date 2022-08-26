package pl.cyber.trainees.wyjasnienia.pracaDomowaTydzien32;

public class Bankomat {

    private Integer saldo;
    public Bankomat(){
        this.saldo=0;
    }

    public Integer stanKonta() {
        return this.saldo;
    }
//7
    public void wplacGotowke(final Integer kwota) {
        this.saldo +=kwota;
    }
//8
    public void sprawdzWyplate(final Integer kwota) {
        if(this.saldo -kwota<0){
            throw new StanBankomatuException("Niewystarczajaca ilosc srodkow na koncie");
        }
    }

    public void wyplacGotowke(final Integer kwota) {
        this.saldo-=kwota;
    }
}
