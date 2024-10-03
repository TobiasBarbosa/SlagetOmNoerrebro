package com.example.slagetomnoerrebro.model.ejendomme;

import com.example.slagetomnoerrebro.model.spiller.Spiller;
import com.example.slagetomnoerrebro.model.spiller.Spillere;

public class Grund {

    //***ATTRIBUTES***--------------------------------------------------------------------------------------------------
    private String grundNavn;
    private int felt;
    private int prisForGrund;
    private int leje;
    private boolean lejeAktiv;
    private int leje1Hus;
    private boolean leje1HusAktiv;
    private int leje2Huse;
    private boolean leje2HuseAktiv;
    private int leje1Hotel;
    private boolean leje1HotelAktiv;
    private int prisForKøbAfHus;
    private int prisForKøbAfHotel;
    private int prisForPantsaetning;
    private boolean pantsat;
    private String farve;

    private String beskrivelse;

    private Spillere spillere;

    //***CONSTRUCTOR***-------------------------------------------------------------------------------------------------
    public Grund(String grundNavn, int felt, int prisForGrund, int leje, int leje1Hus, int leje2Huse, int leje1Hotel,
                 int prisForKøbAfHus, int prisForKøbAfHotel, int prisForPantsaetning, String farve) {

        this.grundNavn           = grundNavn;
        this.felt                = felt;
        this.prisForGrund        = prisForGrund;
        this.leje                = leje;
             lejeAktiv           = true;
        this.leje1Hus            = leje1Hus;
             leje1HusAktiv       = false;
        this.leje2Huse           = leje2Huse;
             leje2HuseAktiv      = false;
        this.leje1Hotel          = leje1Hotel;
             leje1HotelAktiv     = false;
        this.prisForKøbAfHus     = prisForKøbAfHus;
        this.prisForKøbAfHotel   = prisForKøbAfHotel;
        this.prisForPantsaetning = prisForPantsaetning;
        pantsat                  = false;
        this.farve               = farve;
    }

    public Grund(String grundNavn, int felt, String beskrivelse){
        this.grundNavn = grundNavn;
        this.felt = felt;
        this.beskrivelse = beskrivelse;
    }


    //***GETTER METHODS***----------------------------------------------------------------------------------------------
    public String getGrundNavn() {
        return grundNavn;
    }

    public int getFelt() {
        return felt;
    }

    public int getPrisForGrund() {
        return prisForGrund;
    }

    public int getLeje() {
        return leje;
    }

    public int getLeje1Hus() {
        return leje1Hus;
    }

    public int getLeje2Huse() {
        return leje2Huse;
    }

    public int getLeje1Hotel() {
        return leje1Hotel;
    }

    public int getPrisForKøbAfHus() {
        return prisForKøbAfHus;
    }

    public int getPrisForKøbAfHotel() {
        return prisForKøbAfHotel;
    }

    public int getPrisForPantsaetning() {
        return prisForPantsaetning;
    }

    public boolean isPantsat() {
        return pantsat;
    }

    public String getBeskrivelse() {
        return beskrivelse;
    }

    public boolean isLejeAktiv() {
        return lejeAktiv;
    }

    public boolean isLeje1HusAktiv() {
        return leje1HusAktiv;
    }

    public boolean isLeje2HuseAktiv() {
        return leje2HuseAktiv;
    }

    public boolean isLeje1HotelAktiv() {
        return leje1HotelAktiv;
    }

    public String getFarve() {
        return farve;
    }

    //***METHODS***-----------------------------------------------------------------------------------------------------
    public void koebGrund(Spiller spiller, Grund grund, boolean koebGrund){
        if(koebGrund && spiller.getSpillerPenge() < grund.getPrisForGrund()){
            throw new IllegalArgumentException("Du har ikke nok penge til at betale for: " + grund.grundNavn);
        }

        else if (koebGrund && spiller.getSpillerPenge() > grund.getPrisForGrund()) {
            spiller.setSpillerPenge(spiller.getSpillerPenge() - grund.getPrisForGrund());
            spiller.addEjetGrund(grund);
        } else {
            throw new IllegalArgumentException("Noget gik galt :(");
        }
    }

    public void betalLeje(Spiller spiller1, Spiller spiller2, Grund grund, boolean betalLeje){
        if(betalLeje && spiller1.getFelt() == grund.getFelt()){
            for (Spiller spiller : spillere.getSpillerListe()){
                for (Grund grund1 : spiller.getEjetGrunde()){
                    if(grund1 == grund){
                        if(grund.isLejeAktiv())
                        spiller1.setSpillerPenge(spiller1.getSpillerPenge() - grund.getLeje());
                        spiller2.setSpillerPenge(spiller2.getSpillerPenge() + grund.getLeje());
                    } else if(grund.isLeje1HusAktiv()){
                        spiller1.setSpillerPenge(spiller1.getSpillerPenge() - grund.getLeje1Hus());
                        spiller2.setSpillerPenge(spiller2.getSpillerPenge() + grund.getLeje1Hus());
                    } else if (grund.isLeje2HuseAktiv()){
                        spiller1.setSpillerPenge(spiller1.getSpillerPenge() - grund.getLeje2Huse());
                        spiller2.setSpillerPenge(spiller2.getSpillerPenge() + grund.getLeje2Huse());
                    } else if(grund.isLeje1HotelAktiv()){
                        spiller1.setSpillerPenge(spiller1.getSpillerPenge() - grund.getLeje1Hotel());
                        spiller2.setSpillerPenge(spiller2.getSpillerPenge() + grund.getLeje1Hotel());
                    }
                }
            }

        }

    }

    //***END***---------------------------------------------------------------------------------------------------------
}
