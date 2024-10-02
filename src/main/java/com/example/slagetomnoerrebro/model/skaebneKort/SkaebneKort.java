package com.example.slagetomnoerrebro.model.skaebneKort;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class SkaebneKort {

    //***ATTRIBUTES***--------------------------------------------------------------------------------------------------
    private int kortId;
    private String titel;
    private String beskrivelse;
    private List<SkaebneKort> alleSkaebneKort = new ArrayList<>();

    //***CONSTRUCTOR***-------------------------------------------------------------------------------------------------
    public SkaebneKort(String titel, String beskrivelse){
        this.titel = titel;
        this.beskrivelse = beskrivelse;
    }

    //***GETTER METHODS***----------------------------------------------------------------------------------------------
    public int getKortId() {
        return kortId;
    }

    public String getTitel() {
        return titel;
    }

    public String getBeskrivelse() {
        return beskrivelse;
    }

    public List<SkaebneKort> getAlleSkaebneKort() {
        return alleSkaebneKort;
    }

    //***METHODS***-----------------------------------------------------------------------------------------------------
    public SkaebneKort getRandomSkaebneKort(){
        //hmm maaske den bare skal trække i rækkefølge og altså ikke random?
        Random random = new Random();
        int randomIndex = random.nextInt(alleSkaebneKort.size());
        return getAlleSkaebneKort().get(randomIndex);
    }

    //***END***---------------------------------------------------------------------------------------------------------
}
