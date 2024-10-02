package com.example.slagetomnoerrebro.model.skaebneKort;

import java.util.ArrayList;
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
        SkaebneKort kort1 = new SkaebneKort("Bagved Ladvogn", "Du kører bag en mor på en lad cykel. \nVent en omgang.");

        skaebneKorts.add(kort1);
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