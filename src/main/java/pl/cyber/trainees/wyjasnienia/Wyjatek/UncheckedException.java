package pl.cyber.trainees.wyjasnienia.Wyjatek;

public class UncheckedException extends Exception {
    public UncheckedException(String message) { //<- alt + insert <- overide methode
        super(message); // <-- super z dziedziczenia klas
    }
}