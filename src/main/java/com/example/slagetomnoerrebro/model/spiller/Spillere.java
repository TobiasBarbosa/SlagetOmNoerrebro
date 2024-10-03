package com.example.slagetomnoerrebro.model.spiller;

import java.util.ArrayList;
import java.util.List;

public class Spillere {

    //***ATTRIBUTES***--------------------------------------------------------------------------------------------------
    List<Spiller> spillerListe;

    //***CONSTRUCTOR***-------------------------------------------------------------------------------------------------
    public Spillere(){
        spillerListe = new ArrayList<>();
    }

    //***GETTER METHODS***----------------------------------------------------------------------------------------------
    public List<Spiller> getSpillerListe() {
        return spillerListe;
    }

    //***ADD & REMOVE METHODS***----------------------------------------------------------------------------------------
    public void addSpiller(Spiller spiller){
        spillerListe.add(spiller);
    }

    public void removeSpiller(Spiller spiller){
        spillerListe.remove(spiller);
    }

    //***END***---------------------------------------------------------------------------------------------------------
}
