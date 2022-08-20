package pl.cyber.trainees.wyjasnienia.pracaDomowaTydzien32;

public class Karta {

    private final Integer nrKarty;
    private final Integer pinKarty;
    private Integer saldo;

    public Karta(final Integer nrKarty, final Integer pinKarty, final Integer saldo) {
        this.nrKarty = nrKarty;
        this.pinKarty = pinKarty;
        this.saldo = saldo;
    }

    public Integer getNrKarty() {
        return nrKarty;
    }
//1.4
    public void spradzNrPin(final Integer pinKarty) {
        if (this.pinKarty.equals(pinKarty)){
            throw  new KartaException("Niepoprawny pin karty");
        }
    }

    public void wplacGotowke(final Integer kwota) {
        this.saldo +=kwota;
    }

    public void sprawdzWyplate(final Integer kwota) {
        if(this.saldo-kwota<0){
            throw new KartaException("Niewystarcxajaca losc srodkow na koncie");
        }
    }

    public void wyplacGotowk(final Integer kwota) {
        this.saldo-=kwota;
    }

    public Integer stanKonta() {
        return this.saldo;
    }
}
