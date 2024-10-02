package com.example.slagetomnoerrebro.model.skaebneKort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class SkaebneDeck {

    //***ATTRIBUTES***--------------------------------------------------------------------------------------------------
    List<SkaebneKort> skaebneKorts;

    //***CONSTRUCTOR***-------------------------------------------------------------------------------------------------
    public SkaebneDeck() {
        skaebneKorts = new ArrayList<>();
    }

    //***GETTER METHODS***----------------------------------------------------------------------------------------------
    public List<SkaebneKort> getSkaebneKorts() {
        return skaebneKorts;
    }

    //***POPULATE***----------------------------------------------------------------------------------------------------
    public void populateDeck() {
        SkaebneKort kort1 = new SkaebneKort(1, "Du kører bag en mor på en lad cykel.\nVent en omgang.");
        SkaebneKort kort2 = new SkaebneKort(2, "Du er blevet syg af gammel bland-selv slik til 4,99kr.\nVent en omgang");
        SkaebneKort kort3 = new SkaebneKort(3, "Du skal på tinderdate.\n Ryk til Søerne.");
        SkaebneKort kort4 = new SkaebneKort(4, "Du bestiller en hindbærsnitte i Lagkagehuset.\nBetal 1.000 kr.");
        SkaebneKort kort5 = new SkaebneKort(5, "Du har affaldssorteret forkert og hele din andelsbolig er sure på dig.\nBetal 5.000 kr. i bøde.");
        SkaebneKort kort6 = new SkaebneKort(6, "Der er cykelrazzia på Dronning Louises Bro, men du forstår simpelthen ikke hvad den uniformerede jyde siger til dig.\nVent en omgang indtil Google Translate har oversat.");
        SkaebneKort kort7 = new SkaebneKort(7, "*Råb gerne imens du læser dette kort*\nEOW!!\nRyk til Blågårds Plads og råb dine homies op. Du må kun råbe de næste 2 runder.");
        SkaebneKort kort8 = new SkaebneKort(8, "Der er skuddrama foran din dør.\nVent en omgang.");
        SkaebneKort kort9 = new SkaebneKort(9, "Kommunen har solgt din ejendom til Faderhuset.\nMist den dyreste grund du ejer.");

        skaebneKorts.addAll(Arrays.asList(kort1,kort2,kort3,kort4,kort5,kort6,kort7,kort8,kort9));
    }

    //***METHODS***-----------------------------------------------------------------------------------------------------
    public SkaebneKort getRandomSkaebneKort() {
        //hmm maaske den bare skal trække i rækkefølge og altså ikke random? måske noget med en statisk metode...
        Random random = new Random();
        int randomIndex = random.nextInt(getSkaebneKorts().size());
        return getSkaebneKorts().get(randomIndex);
    }

    //***END***---------------------------------------------------------------------------------------------------------
}