package pl.cyber.trainees.wyjasnienia.pracaDomowaTydzien32

import spock.lang.Shared
import spock.lang.Specification
import spock.lang.Unroll

// testy jednostkowe
    // nie maja modyfikatora dostepu, sufix SPEC
    // aby działała prawidłowo trzeba zainicjalizowac
    // w jezyku Spook robi sie przez slowko static def, nazwy zmiennych musza byc godne z obiektami klasy testowanej,
    // musza miec sufix Stub
    // def działa jak var w javie, wie co chcemy mu przekazac



class KartaSpec extends Specification {
    private Karta underTest
    //ver.1 łatwiejsza
    static def nrKartyStub=12345678
    @Shared //ver.2 propagujemy nasza zmienną dla całej klasy testowej, ni jest to konieczne. Przy każdej zmiennej trzeba pisac
    def pinKartyStub=1234
    static def saldoSub=0

    void setup(){ // metoda testowa- startowa aplikacji
        //robi się wylacznie jak chce się robić test jednego obiektu
        //powołuje sie calkowicie nową karte
//        underTest = new Karta(1214,123, 12)
    }
    //nowy przypadek testowy, definiujemy metode testowa
    // w ""() opis co bedzie test sprawdzać
    def "SUBJECT- opis co robi test"(){
        given: //sekcja w której np. mokowanie objektów, inicjalizujemy zmienne lokalne dla przypadku testowego
        //sekcja given jest sekcją nieobowiązkową

        when: //sekcja w której wykonujemy nasz przypadek testowy i zazwyczaj powinniśmy deklarować
        //w tym miejscu parametr, który będzie naszym wynikiem
        def  result = "test"


        then: //sekcja w której weryfikujemy nasze założenia w ramach przypadku testowego
        noExceptionThrown() // metoda którą stosuję zawsze, jeśli mój przypadek testowy nie powinien rzucać Exception'a
        result=="test"
        /*
        where: //sekcja w której będziemy deklarowali wiele parametrów wejściowych oraz przewidywane ich wyniki

-----------------------------------------
        struktura:
        where:
       parametr1 | parametr2 || wynik
       1241      | 151361    || 988651

         */

    }
    def "Przyklad niezwiazany z karta"(){
        given:
            def zmienna1 = 2
            def zmienna2 =5

        when:
            def result=zmienna1+zmienna2
        printf(result as String) //print() metoda ktora ma za zadanie wyswietlanie wartosci na konsole
                //result as String-> przez okreslenie as String mówimy ze nasz wynik ma byc castowyn na Stringa// )

        then:
        noExceptionThrown()
            result!=null
            result==7
    }
    @Unroll // adnotacja, której używamy zwykle przy tworzeniu testów z wykorzystaniem where
    //pozwala  ona na rozbicie ( w oknie RUN)
    def "Przykład nie związany z obiektem Karta z wykorzystaniem where"() {
        when:

        def result = zmienna1+zmienna2

        then:
        noExceptionThrown()
        result == expectedResult
        where:
        zmienna1 | zmienna2 || expectedResult
        1        | 1        || 2
        10       | 100      || 110
        -10      | 10       || 0
        -100     | -100     || -200

    }


    def "Powinien prawidlowo utworzyc obiekt Karta przez konstruktor oraz weryfikować jego parametry oraz zweryfikowac jego parametry"(){
         when:
        def result = new Karta ( nrKartyStub, pinKartyStub, saldoSub)
         then:
         noExceptionThrown()
        result!=null
        result.nrKarty==nrKartyStub
        result.pinKarty== pinKartyStub
        result.saldo==saldoSub
     }
    // testujemy na dobrych wartosciach
    def "Powinien prawidłowo utworzyć object Karta przez konstruktor oraz zweryfikować czy użytkownik podał prawidłowo nr Pin Happy Path"() {
        given:
        def pinFromUser=1234
        def underTest= new Karta (nrKartyStub,pinKartyStub,saldoSub)

        when:
        underTest.spradzNrPin(pinFromUser)

        then:
        noExceptionThrown()

    }
    def "Powinien prawidłowo utworzyć object Karta przez konstruktor oraz zweryfikować czy użytkownik podał prawidłowo nr Pin not Happy Path"() {
        given:
        underTest = new Karta (nrKartyStub,pinKartyStub,saldoSub)

        when:
        underTest.spradzNrPin(pinFromUser)

        then:
        def err = thrown(expected)
        err.message == expectedMessage

        where:
        pinFromUser  || expected       | expectedMessage
        8888         || KartaException | "Niepoprawny pin karty"
        9999         || KartaException | "Niepoprawny pin karty"
        1010         || KartaException | "Niepoprawny pin karty"
        7567         || KartaException | "Niepoprawny pin karty"

    }
    def "Powinno wyswietlic saldo karty" (){
        given :
        underTest= new Karta(nrKartyStub, pinKartyStub, saldoSub)

        when:
        def result = underTest.stanKonta()
        then:
        noExceptionThrown()
        result==saldoSub
    }
    def "Powinno wplacic i wzplacic i nastepnie wyswietlic saldo karty" (){
        given :
        underTest= new Karta(nrKartyStub, pinKartyStub, saldoSub)

        when:
        underTest.wplacGotowke(100)
        underTest.wyplacGotowk(100)
        def result = underTest.stanKonta()
        then:
        noExceptionThrown()
        result==saldoSub
    }
    def "Powinno wplacic gotowke i wyswietlic saldo karty" (){
        given :
        underTest= new Karta(nrKartyStub, pinKartyStub, saldoSub)

        when:
        underTest.wplacGotowke(100)
        def result = underTest.stanKonta()
        then:
        noExceptionThrown()
        result==100
    }


}
