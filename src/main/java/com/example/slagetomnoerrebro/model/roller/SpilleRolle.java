package com.example.slagetomnoerrebro.model.roller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public enum SpilleRolle {

    //***ENUMS**--------------------------------------------------------------------------------------------------------
    BANDEMEDLEM("Bandemedlem"),
    ANARKIST("Anarkist"),
    HIPSTER("Hipster");

    //***ATTRIBUTES***--------------------------------------------------------------------------------------------------
    String displayNavn;
    List<SpilleRolle> spilleRollerListe = new ArrayList<>();

    //***CONSTRUCTOR***-------------------------------------------------------------------------------------------------
    SpilleRolle(String displayNavn){
        this.displayNavn = displayNavn;
    }

    //***METHODS***-----------------------------------------------------------------------------------------------------
    public List<SpilleRolle> getSpilleRollerListe() {
        spilleRollerListe.addAll(Arrays.asList(SpilleRolle.BANDEMEDLEM,SpilleRolle.ANARKIST,SpilleRolle.HIPSTER));
        return spilleRollerListe;
    }

    //***END***---------------------------------------------------------------------------------------------------------
}
