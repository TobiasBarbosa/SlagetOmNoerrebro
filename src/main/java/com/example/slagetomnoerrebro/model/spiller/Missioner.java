package com.example.slagetomnoerrebro.model.spiller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Missioner {

    //***ATTRIBUTES***--------------------------------------------------------------------------------------------------
    private List<Mission> missioner;

    //***CONSTRUCTOR***-------------------------------------------------------------------------------------------------
    public Missioner(){
        missioner = new ArrayList<>();
    }

    //***GETTER METHODS***----------------------------------------------------------------------------------------------
    public List<Mission> getMissioner() {
        return missioner;
    }

    //***METHODS***----------------------------------------------------------------------------------------------------
    public List<Mission> generateRandomMissioner(SpilleRolle rolle){
        Random random = new Random();

        //^^^ANARKIST^^^´´´´´´´´´´´´´´´´´´´´´´´´´´´´´´´´´´´´´´´´´´´´´´´´´´´´´´´´´´´´´´´´´´´´´´´´´´´´´´´´´´´´´´´´´´´´´´´´
        Mission missionAnarkist1 = new Mission("Stands gentrificeringen", "Brænd en grund med minimum 2 x huse ned via feltet Vild med ild", SpilleRolle.ANARKIST);
        Mission missionAnarkist2 = new Mission("Kæmp for Ungeren", "Byg 2 x huse på Jagtvej 69", SpilleRolle.ANARKIST);
        Mission missionAnarkist3 = new Mission("Dine penge mig i røven", "Land på Money Exchange x 2", SpilleRolle.ANARKIST);
        Mission missionAnarkist4 = new Mission("Tag en dukkert", "Ej søerne", SpilleRolle.ANARKIST);
        Mission missionAnarkist5 = new Mission("Gem dig for panserne", "Ej Assistens Kirkegård", SpilleRolle.ANARKIST);
        List<Mission> anerkistMissioner1 = new ArrayList<>();
        anerkistMissioner1.addAll(Arrays.asList(
                missionAnarkist1,
                missionAnarkist2,
                missionAnarkist3,
                missionAnarkist4,
                missionAnarkist5
        ));

        Mission missionAnarkist6 = new Mission("anarkist6", "anerkist opgave6", SpilleRolle.ANARKIST);
        Mission missionAnarkist7 = new Mission("anarkist7", "anerkist opgave7", SpilleRolle.ANARKIST);
        Mission missionAnarkist8 = new Mission("anarkist8", "anerkist opgave8", SpilleRolle.ANARKIST);
        Mission missionAnarkist9 = new Mission("anarkist9", "anerkist opgave9", SpilleRolle.ANARKIST);
        Mission missionAnarkist10 = new Mission("anarkist10", "anerkist opgave10", SpilleRolle.ANARKIST);
        List<Mission> anerkistMissioner2 = new ArrayList<>();
        anerkistMissioner2.addAll(Arrays.asList(
                missionAnarkist6,
                missionAnarkist7,
                missionAnarkist8,
                missionAnarkist9,
                missionAnarkist10
        ));

        Mission missionAnarkist11 = new Mission("anarkist11", "anerkist opgave11", SpilleRolle.ANARKIST);
        Mission missionAnarkist12 = new Mission("anarkist12", "anerkist opgave12", SpilleRolle.ANARKIST);
        Mission missionAnarkist13 = new Mission("anarkist13", "anerkist opgave13", SpilleRolle.ANARKIST);
        Mission missionAnarkist14 = new Mission("anarkist14", "anerkist opgave14", SpilleRolle.ANARKIST);
        Mission missionAnarkist15 = new Mission("anarkist15", "anerkist opgave15", SpilleRolle.ANARKIST);
        List<Mission> anerkistMissioner3 = new ArrayList<>();
        anerkistMissioner3.addAll(Arrays.asList(
                missionAnarkist11,
                missionAnarkist12,
                missionAnarkist13,
                missionAnarkist14,
                missionAnarkist15
        ));

        //^^^BANDEMEDLEM^^^´´´´´´´´´´´´´´´´´´´´´´´´´´´´´´´´´´´´´´´´´´´´´´´´´´´´´´´´´´´´´´´´´´´´´´´´´´´´´´´´´´´´´´´´´´´´´
        Mission missionBandemedlem1 = new Mission("Brænd dine broer", "Brænd Dronning Louises Bro ned via feltet Vild med ild x 2", SpilleRolle.BANDEMEDLEM);
        Mission missionBandemedlem2 = new Mission("Prison break", "Bliv løsladt fra Salatfadet vha. terningeslag", SpilleRolle.BANDEMEDLEM);
        Mission missionBandemedlem3 = new Mission("Sælg hash til soundboksdrengene", "Ej Nørrebroparken + 30.000 kr. i kontanter", SpilleRolle.BANDEMEDLEM);
        Mission missionBandemedlem4 = new Mission("Obligatorisk fremmøde", "Ej jobcentret", SpilleRolle.BANDEMEDLEM);
        Mission missionBandemedlem5 = new Mission("Ej jægersborggade", "", SpilleRolle.BANDEMEDLEM);
        List<Mission> bandemedlemMissioner1 = new ArrayList<>();
        bandemedlemMissioner1.addAll(Arrays.asList(
                missionBandemedlem1,
                missionBandemedlem2,
                missionBandemedlem3,
                missionBandemedlem4,
                missionBandemedlem5
        ));

        Mission missionBandemedlem6 = new Mission("bandemedlem6", "bandemedlem opgave6", SpilleRolle.BANDEMEDLEM);
        Mission missionBandemedlem7 = new Mission("bandemedlem7", "bandemedlem opgave7", SpilleRolle.BANDEMEDLEM);
        Mission missionBandemedlem8 = new Mission("bandemedlem8", "bandemedlem opgave8", SpilleRolle.BANDEMEDLEM);
        Mission missionBandemedlem9 = new Mission("bandemedlem9", "bandemedlem opgave9", SpilleRolle.BANDEMEDLEM);
        Mission missionBandemedlem10 = new Mission("bandemedlem10", "bandemedlem opgave10", SpilleRolle.BANDEMEDLEM);
        List<Mission> bandemedlemMissioner2 = new ArrayList<>();
        bandemedlemMissioner2.addAll(Arrays.asList(
                missionBandemedlem6,
                missionBandemedlem7,
                missionBandemedlem8,
                missionBandemedlem9,
                missionBandemedlem10
        ));

        Mission missionBandemedlem11 = new Mission("bandemedlem11", "bandemedlem opgave11", SpilleRolle.BANDEMEDLEM);
        Mission missionBandemedlem12 = new Mission("bandemedlem12", "bandemedlem opgave12", SpilleRolle.BANDEMEDLEM);
        Mission missionBandemedlem13 = new Mission("bandemedlem13", "bandemedlem opgave13", SpilleRolle.BANDEMEDLEM);
        Mission missionBandemedlem14 = new Mission("bandemedlem14", "bandemedlem opgave14", SpilleRolle.BANDEMEDLEM);
        Mission missionBandemedlem15 = new Mission("bandemedlem15", "bandemedlem opgave15", SpilleRolle.BANDEMEDLEM);
        List<Mission> bandemedlemMissioner3 = new ArrayList<>();
        bandemedlemMissioner3.addAll(Arrays.asList(
                missionBandemedlem11,
                missionBandemedlem12,
                missionBandemedlem13,
                missionBandemedlem14,
                missionBandemedlem15
        ));

        //^^^HIPSTER^^^´´´´´´´´´´´´´´´´´´´´´´´´´´´´´´´´´´´´´´´´´´´´´´´´´´´´´´´´´´´´´´´´´´´´´´´´´´´´´´´´´´´´´´´´´´´´´´´´´
        Mission missionHipster1 = new Mission("Gentrificer Nørrebro", "Land på Gentrificer en grund x 2", SpilleRolle.HIPSTER);
        Mission missionHipster2 = new Mission("Lav kreativt bureau med kant", "Byg 2 x huse på Jagtvej 69 ", SpilleRolle.HIPSTER);
        Mission missionHipster3 = new Mission("Udvid Mikkeller", "Byg 2 x huse på Mikkeller", SpilleRolle.HIPSTER);
        Mission missionHipster4 = new Mission("Dyr iPhone og arbejdsløs", "Ej jobcentret", SpilleRolle.HIPSTER);
        Mission missionHipster5 = new Mission("Lad som om du kendte Natasja", "Ej Assistens Kirkegård", SpilleRolle.HIPSTER);
        List<Mission> hipsterMissioner1 = new ArrayList<>();
        hipsterMissioner1.addAll(Arrays.asList(
                missionHipster1,
                missionHipster2,
                missionHipster3,
                missionHipster4,
                missionHipster5
        ));

        Mission missionHipster6 = new Mission("hipster6", "hipster opgave6", SpilleRolle.HIPSTER);
        Mission missionHipster7 = new Mission("hipster7", "hipster opgave7", SpilleRolle.HIPSTER);
        Mission missionHipster8 = new Mission("hipster8", "hipster opgave8", SpilleRolle.HIPSTER);
        Mission missionHipster9 = new Mission("hipster9", "hipster opgave9", SpilleRolle.HIPSTER);
        Mission missionHipster10 = new Mission("hipster10", "hipster opgave10", SpilleRolle.HIPSTER);
        List<Mission> hipsterMissioner2 = new ArrayList<>();
        hipsterMissioner2.addAll(Arrays.asList(
                missionHipster6,
                missionHipster7,
                missionHipster8,
                missionHipster9,
                missionHipster10
        ));

        Mission missionHipster11 = new Mission("hipster11", "hipster opgave11", SpilleRolle.HIPSTER);
        Mission missionHipster12 = new Mission("hipster12", "hipster opgave12", SpilleRolle.HIPSTER);
        Mission missionHipster13 = new Mission("hipster13", "hipster opgave13", SpilleRolle.HIPSTER);
        Mission missionHipster14 = new Mission("hipster14", "hipster opgave14", SpilleRolle.HIPSTER);
        Mission missionHipster15 = new Mission("hipster15", "hipster opgave15", SpilleRolle.HIPSTER);
        List<Mission> hipsterMissioner3 = new ArrayList<>();
        hipsterMissioner3.addAll(Arrays.asList(
                missionHipster11,
                missionHipster12,
                missionHipster13,
                missionHipster14,
                missionHipster15
        ));


        int randomIndex = random.nextInt(3);
        missioner = null;
        if(rolle == SpilleRolle.ANARKIST){
            ArrayList<List<Mission>> randomAnarkistList = new ArrayList<>(Arrays.asList(anerkistMissioner1, anerkistMissioner2, anerkistMissioner3));
            missioner = randomAnarkistList.get(randomIndex);

        } else if (rolle == SpilleRolle.BANDEMEDLEM) {
            ArrayList<List<Mission>> randomBandemedlemList = new ArrayList<>(Arrays.asList(bandemedlemMissioner1, bandemedlemMissioner2, bandemedlemMissioner3));
            missioner = randomBandemedlemList.get(randomIndex);

        } else if (rolle == SpilleRolle.HIPSTER) {
            ArrayList<List<Mission>> randomHipsterList = new ArrayList<>(Arrays.asList(hipsterMissioner1, hipsterMissioner2, hipsterMissioner3));
            missioner = randomHipsterList.get(randomIndex);
        }
        return missioner;
    }

    //***END***---------------------------------------------------------------------------------------------------------
}
