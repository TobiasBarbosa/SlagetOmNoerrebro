package com.example.slagetomnoerrebro.model.skaebneKort;

public class SkaebneKort {

    //***ATTRIBUTES***--------------------------------------------------------------------------------------------------
    private int kortId;
    private String titel;
    private String beskrivelse;

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

    //***END***---------------------------------------------------------------------------------------------------------
}
