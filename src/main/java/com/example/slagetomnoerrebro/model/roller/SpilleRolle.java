package com.example.slagetomnoerrebro.model.roller;

import java.util.ArrayList;
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
        spilleRollerListe.add(SpilleRolle.ANARKIST);
        spilleRollerListe.add(SpilleRolle.BANDEMEDLEM);
        spilleRollerListe.add(SpilleRolle.HIPSTER);
        return spilleRollerListe;
    }

    //***END***---------------------------------------------------------------------------------------------------------
}
