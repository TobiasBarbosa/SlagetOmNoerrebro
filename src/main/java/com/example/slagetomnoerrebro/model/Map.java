package com.example.slagetomnoerrebro.model;

import com.example.slagetomnoerrebro.model.grunde.Grund;

public class Map {

    //***CONSTRUCTOR***-------------------------------------------------------------------------------------------------
    public Map(){
        populateMap();
    }

    //***POPULATE***----------------------------------------------------------------------------------------------------
    public void populateMap(){
        Grund start           =  new Grund("Start",               1, "Modtag\nhurtige penge\n4000kr");
        Grund afpresning      =  new Grund("Afpresning",          2, "");
        //Grund jobCentret      =  new Grund("Job Centret",         3, 1000, );

        Grund skaebne1        = new Grund("Skæbnen",              7, "");
        Grund rust            = new Grund("Rust",                 9, 1600, 200, 2000, 4000, 8000, 1600, 1600, 800);
        Grund skaebne2        = new Grund("Skæbnen",              13, "");
        Grund skaebne3        = new Grund("Skæbnen",              25, "");
        Grund jaegersborggade = new Grund("Jægersborggade",       26, 5400, 600, 6500, 13000, 26000, 5400, 5400, 2700);
        Grund skaebne4        = new Grund("Skæbnen",              29, "");
        Grund gentrificer     = new Grund("Gentrificer en Grund", 32, "");
        Grund skaebne5        = new Grund("Skæbnen",              35, "");
    }

    //***END***---------------------------------------------------------------------------------------------------------
}
