package com.example.slagetomnoerrebro.model.skaebneKort;

public class SkaebneKort {

    //***ATTRIBUTES***--------------------------------------------------------------------------------------------------
    private int kortId;
    private String beskrivelse;

    //***CONSTRUCTOR***-------------------------------------------------------------------------------------------------
    public SkaebneKort(int kortId, String beskrivelse){
        this.kortId = kortId;
        this.beskrivelse = beskrivelse;
    }

    //***GETTER METHODS***----------------------------------------------------------------------------------------------
    public int getKortId() {
        return kortId;
    }

    public String getBeskrivelse() {
        return beskrivelse;
    }

    //***END***---------------------------------------------------------------------------------------------------------
}
