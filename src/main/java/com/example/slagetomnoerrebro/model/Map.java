package com.example.slagetomnoerrebro.model;

import com.example.slagetomnoerrebro.model.grunde.Grund;

public class Map {

    //***CONSTRUCTOR***-------------------------------------------------------------------------------------------------
    public Map(){
        populateMap();
    }

    //***POPULATE***----------------------------------------------------------------------------------------------------
    public void populateMap(){
        Grund start1            = new Grund("Start",                1,  "Modtag\nhurtige penge\n4000kr");
        Grund afpresning2       = new Grund("Afpresning",           2,  "");
        Grund jobCentret3       = new Grund("Job Centret",          3,  1000,0,0,0,0,0,0,0,"lyserød");
        Grund folketsPark4      = new Grund("Folkets Park",         4,  1000,0,0,0,0,0,0,0,"lyserød");
        Grund salatfadet5       = new Grund("Salatfadet",           5,  "");
        Grund understellet6     = new Grund("Understellet",         6,  1600,0,0,0,0,0,0,0,"grøn");
        Grund skaebne7          = new Grund("Skæbnen",              7,  "");
        Grund cafeLouise8       = new Grund("Cafe Louise",          8,  1600,0,0,0,0,0,0,0,"grøn");
        Grund rust9             = new Grund("Rust",                 9,  1600, 200, 2000, 4000, 8000, 1600, 1600, 800,"grøn");
        Grund bzEnGrund10       = new Grund("BZ en grund",          10, "");
        Grund mjoelnerparken11  = new Grund("Mjølner Parken",       11, 2000,0,0,0,0,0,0,0,"mørkeorange");
        Grund blaagaardsPlads12 = new Grund("Blågårds Plads",       12, 2000,0,0,0,0,0,0,0,"mørkeorange");
        Grund skaebne13         = new Grund("Skæbnen",              13, "");
        Grund lundtoftegade14   = new Grund("Lundtoftegade",        14, 2000,0,0,0,0,0,0,0,"mørkeorange");
        Grund soerne15          = new Grund("Søerne",               15, 3000,0,0,0,0,0,0,0,"orange");
        Grund herbergstengade16 = new Grund("Herberget På Stengade",16, 3000,0,0,0,0,0,0,0,"orange");
        Grund vaeltenbil17      = new Grund("Vælt en bil",          17, "");
        Grund noerrebroparken18 = new Grund("Nørrebroparken",       18, 3000,0,0,0,0,0,0,0,"orange");
        Grund vildmedild19      = new Grund("Vild med ild",         19, "");
        Grund assistens20       = new Grund("Assistens Kirkegaard", 20, 4000,0,0,0,0,0,0,0,"turkis");
        Grund surfAndPlay21     = new Grund("Surf & Play Netcafe",  21, 4000,0,0,0,0,0,0,0,"turkis");
        Grund denRoedePlads22   = new Grund("Den Røde Plads",       22, 4000,0,0,0,0,0,0,0,"turkis");
        Grund moneyExchange23   = new Grund("Money Exchange",       23, "");
        Grund rantzausgade24    = new Grund("Rantzausgade",         24, 5400,0,0,0,0,0,0,0,"rød");
        Grund skaebne25         = new Grund("Skæbnen",              25, "");
        Grund jaegersborggade26 = new Grund("Jægersborggade",       26, 5400, 600, 6500, 13000, 26000, 5400, 5400, 2700,"rød");
        Grund mikkeller27       = new Grund("Mikkeller",            27, 5400, 0, 0, 0,0 , 0, 0, 0,"rød");
        Grund foraeldrekoeb28   = new Grund("Forældrekøb",          28, "");
        Grund skaebne29         = new Grund("Skæbnen",              29, "");
        Grund jagtvej6930       = new Grund("Jagtvej 69",           30, 7000, 0, 0, 0,0 , 0, 0, 0,"hvid");
        Grund sanktHansTorv31   = new Grund("Sankt Hans Torv",      31, 7000, 0, 0, 0,0 , 0, 0, 0,"hvid");
        Grund gentrificer32     = new Grund("Gentrificer en grund", 32, "");
        Grund drLouisesBro33    = new Grund("Dr. Louises Bro",      33, 7000, 0, 0, 0,0 , 0, 0, 0,"hvid");
        Grund nørrebrogade34    = new Grund("Nørrebrogade",         34, 8000, 0, 0, 0,0 , 0, 0, 0,"lilla");
        Grund skaebne35         = new Grund("Skæbnen",              35, "");
        Grund klamydiaslottet36 = new Grund("Klamydiaslottet",      36, 8600, 0, 0, 0,0 , 0, 0, 0, "lilla");
    }

    //***END***---------------------------------------------------------------------------------------------------------
}
