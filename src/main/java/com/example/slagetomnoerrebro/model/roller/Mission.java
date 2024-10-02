package com.example.slagetomnoerrebro.model.roller;

import java.util.ArrayList;
import java.util.List;

public class Mission {

    //***ATTRIBUTES***--------------------------------------------------------------------------------------------------
    private String missionNavn;
    private String beskrivelse;
    private SpilleRolle spilleRolle;
    private boolean missionOpklaret;

    //***CONSTRUCTOR***-------------------------------------------------------------------------------------------------
    public Mission(String missionNavn, String beskrivelse, SpilleRolle spilleRolle){
        this.missionNavn = missionNavn;
        this.beskrivelse = beskrivelse;
        this.spilleRolle = spilleRolle;
        missionOpklaret = false;
    }

    //***GETTER METHODS***----------------------------------------------------------------------------------------------
    public String getMissionNavn() {
        return missionNavn;
    }

    public String getBeskrivelse() {
        return beskrivelse;
    }

    public SpilleRolle getSpilleRolle() {
        return spilleRolle;
    }

    public boolean isMissionOpklaret() {
        return missionOpklaret;
    }

    //***END***---------------------------------------------------------------------------------------------------------
}
