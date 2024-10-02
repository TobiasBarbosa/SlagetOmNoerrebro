package com.example.slagetomnoerrebro.model;

import com.example.slagetomnoerrebro.model.grunde.Grund;

public class Map {

    //***CONSTRUCTOR***-------------------------------------------------------------------------------------------------
    public Map(){
        populateMap();
    }

    //***POPULATE***----------------------------------------------------------------------------------------------------
    public void populateMap(){
        Grund start1            =  new Grund("Start",               1, "Modtag\nhurtige penge\n4000kr");
        Grund afpresning2       =  new Grund("Afpresning",          2, "");
        Grund jobCentret3       =  new Grund("Job Centret",         3, 1000,0,0,0,0,0,0,0);
        Grund folketsPark4      =  new Grund("Folkets Park",        3, 1000,0,0,0,0,0,0,0);
        Grund Salatfadet5       =  new Grund("Folkets Park",        3, "");

        Grund skaebne7          = new Grund("Skæbnen",              7, "");
        Grund rust9             = new Grund("Rust",                 9, 1600, 200, 2000, 4000, 8000, 1600, 1600, 800);
        Grund skaebne13         = new Grund("Skæbnen",              13, "");
        Grund skaebne25         = new Grund("Skæbnen",              25, "");
        Grund jaegersborggade26 = new Grund("Jægersborggade",       26, 5400, 600, 6500, 13000, 26000, 5400, 5400, 2700);
        Grund foraeldrekoeb28   =  new Grund("Forældrekøb",         28, "");
        Grund skaebne29         = new Grund("Skæbnen",              29, "");
        Grund jagtvej6930       = new Grund("Jagtvej 69",           30, 0, 0, 0, 0,0 , 0, 0, 0);
        Grund sanktHansTorv31   = new Grund("Sankt Hans Torv",      31, 0, 0, 0, 0,0 , 0, 0, 0);
        Grund gentrificer32     = new Grund("Gentrificer en Grund", 32, "");
        Grund drLouisesBro33    = new Grund("Dr. Louises Bro",      33, 0, 0, 0, 0,0 , 0, 0, 0);
        Grund nørrebrogade34    = new Grund("Nørrebrogade",         34, 0, 0, 0, 0,0 , 0, 0, 0);
        Grund skaebne35         = new Grund("Skæbnen",              35, "");
        Grund klamydiaslottet36 = new Grund("Klamydiaslottet",      36, 0, 0, 0, 0,0 , 0, 0, 0);
    }

    //***END***---------------------------------------------------------------------------------------------------------
}
