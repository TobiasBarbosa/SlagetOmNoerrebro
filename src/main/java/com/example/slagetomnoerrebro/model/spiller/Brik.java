package com.example.slagetomnoerrebro.model.spiller;

public enum Brik {

    //***ENUMS***-------------------------------------------------------------------------------------------------------
    LIMOUSINE("Limousine", "Hvid"),
    GOLF     ("VW Golf", "Blå"),
    FEMA     ("5A", "Gul"),
    SCOOTER  ("Scooter", "sort");

    //***ATTRIBUTES***--------------------------------------------------------------------------------------------------
    String displayNavn;
    String farve;

    //***CONSTRUCTOR***-------------------------------------------------------------------------------------------------
    Brik(String displayNavn, String farve){
        this.displayNavn = displayNavn;
        this.farve = farve;
    }

    //***END***---------------------------------------------------------------------------------------------------------
}
