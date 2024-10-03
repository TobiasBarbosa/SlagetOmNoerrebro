package com.example.slagetomnoerrebro.model.roller;

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

    private Missioner missioner;

    //***CONSTRUCTOR***-------------------------------------------------------------------------------------------------
    public Spiller(String spillerNavn, Brik brik){
        this.spillerNavn         = spillerNavn;
             rolle               = generateRandomSpilleRolle();
             specifikkeMissioner = missioner.generateRandomMissioner();
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
    public SpilleRolle generateRandomSpilleRolle(){
        Random random = new Random();
        int randomIndex = random.nextInt(rolle.getSpilleRollerListe().size());
        return rolle.spilleRollerListe.get(randomIndex);
    }

    //***END***---------------------------------------------------------------------------------------------------------
}
