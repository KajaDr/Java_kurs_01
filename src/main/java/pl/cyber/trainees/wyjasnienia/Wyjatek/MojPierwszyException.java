package pl.cyber.trainees.wyjasnienia.Wyjatek;

public class MojPierwszyException extends Exception{
    public MojPierwszyException(String message) { //<- alt + insert <- overide methode
        super(message); // <-- super z dziedziczenia klas
    }
}
