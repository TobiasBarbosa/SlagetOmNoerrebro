package com.example.slagetomnoerrebro.model.spiller;

import java.util.List;
import java.util.Random;

public class Spiller {

    //TODO lav metode til at håndtere pengesedler fordeling

    //***ATTRIBUTES***--------------------------------------------------------------------------------------------------
    private String spillerNavn;
    private SpilleRolle rolle;
    private List<Mission> specifikkeMissioner;
    private int spillerPenge;
    private Brik brik;

    private final Missioner missioner = new Missioner();

    //***CONSTRUCTOR***-------------------------------------------------------------------------------------------------
    public Spiller(String spillerNavn, Brik brik, SpilleRolle rolle){
        this.spillerNavn         = spillerNavn;
        this.rolle               = rolle;
             specifikkeMissioner = missioner.generateRandomMissioner(rolle);
             spillerPenge        = 32000;
        this.brik                = brik;
    }

    //***GETTER METHODS***----------------------------------------------------------------------------------------------
    public SpilleRolle getRolle() {
        return rolle;
    }

    public int getSpillerPenge() {
        return spillerPenge;
    }

    public String getSpillerNavn() {
        return spillerNavn;
    }

    public List<Mission> getSpecifikkeMissioner() {
        return specifikkeMissioner;
    }

    public Brik getBrik() {
        return brik;
    }

    public Missioner getMissioner() {
        return missioner;
    }

    //***METHODS***-----------------------------------------------------------------------------------------------------
    //man vælger selv sin rolle?
//    public SpilleRolle generateRandomSpilleRolle(){
//        Random random = new Random();
//        int randomIndex = random.nextInt(rolle.getSpilleRollerListe().size());
//        return rolle.spilleRollerListe.get(randomIndex);
//    }

    //***END***---------------------------------------------------------------------------------------------------------
}
