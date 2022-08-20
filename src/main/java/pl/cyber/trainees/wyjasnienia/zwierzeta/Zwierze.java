package pl.cyber.trainees.wyjasnienia.zwierzeta;
// dziedziczenie -  potrzebne jest extends które pozwala dodac
public abstract class Zwierze {
    private final Double wzrost;
    private final boolean czyMaSierc;

    public Zwierze(Double wzrost, boolean czyMaSierc) {
        this.wzrost = wzrost;
        this.czyMaSierc = czyMaSierc;
    }

    public Double getWzrost() {
        return wzrost;
    }

    public boolean isCzyMaSierc() {
        return czyMaSierc;
    }

    public String dajGlos(){
        return "";
    }
    public String dajGlos2(){
        return "";
    }

    public abstract String dajGlod();
}
