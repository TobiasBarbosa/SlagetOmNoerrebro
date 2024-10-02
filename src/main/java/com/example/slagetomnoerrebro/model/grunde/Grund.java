package com.example.slagetomnoerrebro.model.grunde;

public class Grund {

    //***ATTRIBUTES***--------------------------------------------------------------------------------------------------
    private String grundNavn;
    private int felt;
    private int prisForGrund;
    private int leje;
    private int lejeMed1Hus;
    private int lejeMed2Huse;
    private int lejeMed1Hotel;

    private int prisForKøbAfHus;
    private int prisForKøbAfHotel;
    private int prisForPantsaetning;
    private boolean pantsat;

    private String beskrivelse;

    //***CONSTRUCTOR***-------------------------------------------------------------------------------------------------
    public Grund(String grundNavn, int felt, int prisForGrund, int leje, int lejeMed1Hus, int lejeMed2Huse, int lejeMed1Hotel,
                 int prisForKøbAfHus, int prisForKøbAfHotel, int prisForPantsaetning) {

        this.grundNavn = grundNavn;
        this.felt = felt;
        this.prisForGrund = prisForGrund;
        this.leje = leje;
        this.lejeMed1Hus = lejeMed1Hus;
        this.lejeMed2Huse = lejeMed2Huse;
        this.lejeMed1Hotel = lejeMed1Hotel;
        this.prisForKøbAfHus = prisForKøbAfHus;
        this.prisForKøbAfHotel = prisForKøbAfHotel;
        this.prisForPantsaetning= prisForPantsaetning;
        pantsat = false;
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

    public int getLejeMed1Hus() {
        return lejeMed1Hus;
    }

    public int getLejeMed2Huse() {
        return lejeMed2Huse;
    }

    public int getLejeMed1Hotel() {
        return lejeMed1Hotel;
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


    //***END***---------------------------------------------------------------------------------------------------------
}
