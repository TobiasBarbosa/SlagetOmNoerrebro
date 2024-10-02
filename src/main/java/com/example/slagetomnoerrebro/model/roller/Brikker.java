package com.example.slagetomnoerrebro.model.roller;

public enum Brikker {

    //***ENUMS***-------------------------------------------------------------------------------------------------------
    LIMOUSINE("Limousine", "Hvid"),
    GOLF     ("VW Golf", "Blå"),
    FEMA     ("5A", "Gul"),
    SCOOTER  ("Scooter", "sort");

    //***ATTRIBUTES***--------------------------------------------------------------------------------------------------
    String displayNavn;
    String farve;

    //***CONSTRUCTOR***-------------------------------------------------------------------------------------------------
    Brikker(String displayNavn, String farve){
        this.displayNavn = displayNavn;
        this.farve = farve;
    }

    //***END***---------------------------------------------------------------------------------------------------------
}
