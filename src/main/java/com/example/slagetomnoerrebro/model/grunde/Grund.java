package com.example.slagetomnoerrebro.model.grunde;

public class Grund {

    //***ATTRIBUTES***--------------------------------------------------------------------------------------------------
    private String grundNavn;
    private int felt;
    private int prisForGrund;
    private int leje;
    private int leje1Hus;
    private int leje2Huse;
    private int leje1Hotel;

    private int prisForKøbAfHus;
    private int prisForKøbAfHotel;
    private int prisForPantsaetning;
    private boolean pantsat;
    private String farve;

    private String beskrivelse;

    //***CONSTRUCTOR***-------------------------------------------------------------------------------------------------
    public Grund(String grundNavn, int felt, int prisForGrund, int leje, int leje1Hus, int leje2Huse, int leje1Hotel,
                 int prisForKøbAfHus, int prisForKøbAfHotel, int prisForPantsaetning, String farve) {

        this.grundNavn = grundNavn;
        this.felt = felt;
        this.prisForGrund = prisForGrund;
        this.leje = leje;
        this.leje1Hus = leje1Hus;
        this.leje2Huse = leje2Huse;
        this.leje1Hotel = leje1Hotel;
        this.prisForKøbAfHus = prisForKøbAfHus;
        this.prisForKøbAfHotel = prisForKøbAfHotel;
        this.prisForPantsaetning= prisForPantsaetning;
        pantsat = false;
        this.farve = farve;
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


    //***END***---------------------------------------------------------------------------------------------------------
}
