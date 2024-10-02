package com.example.slagetomnoerrebro.model.roller;

import java.util.List;
import java.util.Random;

public class Spiller {

    //***ATTRIBUTES***--------------------------------------------------------------------------------------------------
    private String spillerNavn;
    private SpilleRolle rolle;
    private List<Mission> specifikkeMissioner;
    private int penge;
    private Brikker brik;

    private Missioner missioner;

    //***CONSTRUCTOR***-------------------------------------------------------------------------------------------------
    public Spiller(String spillerNavn, Brikker brik){
        this.spillerNavn         = spillerNavn;
             rolle               = generateRandomSpilleRolle();
             specifikkeMissioner = missioner.generateRandomMissioner();
             penge               = 13000; //hvor mange penge er det?
        this.brik                = brik;
    }

    //***GETTER METHODS***----------------------------------------------------------------------------------------------
    public SpilleRolle getRolle() {
        return rolle;
    }

    public int getPenge() {
        return penge;
    }

    public String getSpillerNavn() {
        return spillerNavn;
    }

    public List<Mission> getSpecifikkeMissioner() {
        return specifikkeMissioner;
    }

    public Brikker getBrik() {
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
