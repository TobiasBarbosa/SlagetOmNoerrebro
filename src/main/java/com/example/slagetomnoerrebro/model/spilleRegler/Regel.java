package com.example.slagetomnoerrebro.model.spilleRegler;

public class Regel {

    //***ATTRIBUTES***--------------------------------------------------------------------------------------------------
    String regelTitel;
    String regelBeskrivelse;

    //***CONSTRUCTOR***-------------------------------------------------------------------------------------------------
    public Regel(String regelTitel, String regelBeskrivelse){
        this.regelTitel = regelTitel;
        this.regelBeskrivelse = regelBeskrivelse;
    }

    //***GETTER METHODS***----------------------------------------------------------------------------------------------
    public String getRegelTitel() {
        return regelTitel;
    }

    public String getRegelBeskrivelse() {
        return regelBeskrivelse;
    }

    //***END***---------------------------------------------------------------------------------------------------------
}
