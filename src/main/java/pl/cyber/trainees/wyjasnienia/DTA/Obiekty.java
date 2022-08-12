package pl.cyber.trainees.wyjasnienia.DTA;

import java.util.ArrayList;
import java.util.List;

public class Obiekty {
    private void wyswietlTalkDTO(){
        List<String> list = new ArrayList<>();
        list.add("przyklad1");

        TalkDTO talkDTO= new TalkDTO("Obiektowosc","Operacja na obiektach" , list);
       // System.out.println(talkDTO.toString());
       // System.out.println("Dzis zajmujemy sie tamtetem + " + talkDTO.getTematRozmowy());
        System.out.println(talkDTO.getTematRozmowy());
        System.out.println(talkDTO.getOpis());
        talkDTO.opis= "";

        List<String> wiecej = new ArrayList<>();
        list.add("przyklad2");
        list.add("przyklad3");

        talkDTO.modifyList(wiecej);
    }
    public void uruchom(){
        wyswietlTalkDTO();
    }
}
