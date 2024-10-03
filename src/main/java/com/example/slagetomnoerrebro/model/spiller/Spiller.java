package com.example.slagetomnoerrebro.model.spiller;

import com.example.slagetomnoerrebro.model.ejendomme.Grund;

import java.util.ArrayList;
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
    private List<Grund> ejetGrunde;
    private int felt;
    private final Missioner missioner = new Missioner();

    //***CONSTRUCTOR***-------------------------------------------------------------------------------------------------
    public Spiller(String spillerNavn, Brik brik, SpilleRolle rolle){
        this.spillerNavn         = spillerNavn;
        this.rolle               = rolle;
             specifikkeMissioner = missioner.generateRandomMissioner(rolle);
             spillerPenge        = 32000;
        this.brik                = brik;
             ejetGrunde          = new ArrayList<>();
             felt                = 1;
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

    public List<Grund> getEjetGrunde() {
        return ejetGrunde;
    }

    public int getFelt() {
        return felt;
    }

    //***SETTER METHODS***----------------------------------------------------------------------------------------------
    public void setSpillerPenge(int spillerPenge) {
        this.spillerPenge = spillerPenge;
    }

    public void setFelt(int felt) {
        if(felt > 0 && felt < 37) {
            this.felt = felt;
        } else throw new IllegalArgumentException("feltet skal skal være i mellem 1 og 36.");
    }

    //***ADD & REMOVE METHODS***----------------------------------------------------------------------------------------
    public void addEjetGrund(Grund grund){
        ejetGrunde.add(grund);
    }

    public void removeEjetGrund(Grund grund){
        ejetGrunde.remove(grund);
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
