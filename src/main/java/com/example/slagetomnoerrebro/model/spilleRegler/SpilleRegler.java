package com.example.slagetomnoerrebro.model.spilleRegler;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SpilleRegler {

    //***ATTRIBUTES***--------------------------------------------------------------------------------------------------
    List<Regel> regelListe;

    //***CONSTRUCTOR***-------------------------------------------------------------------------------------------------
    public SpilleRegler(){
        regelListe = new ArrayList<>();
    }

    //***POPULATE***----------------------------------------------------------------------------------------------------
    public void lavRegler(){
    Regel regel1  = new Regel("Formål med Spillet", "Formålet med spillet er at opnå total dominans over Nørrebro.");
    Regel regel2  = new Regel("Sådan vindes spillet", "Spillet kan vindes på 2 måder:\n1: Få de andre spillere til at gå konkurs.\n2: Ved at gennemføre 3 ud af 5 missioner på det missionskort du trækker fra bunken med missionskort.Her vælger du om du vil være: Anerkist, Bandemedlem eller Hipster.");
    Regel regel3  = new Regel("Før I starter", "En af deltagerne vælges til at være bank.\n Banken giver hver deltager 32.000 kr. fordelt på følgende måde:\n2 stk. 5000kr - 6 stk. 2.000 kr. - 7 stk. 1.000kr.\n5 stk. 500 kr. - 5 stk. 100 kr.\nDer kastes med 2 x terninger.\nSkæbnen-kortene placeres midt på brættet og trækkes når der landes på Skæbnen.");
    Regel regel4  = new Regel("Missionskort", "Før I starter spillet, vælger alle en karakter. Derefter trækker I et tilfældigt kort fra jeres karakters bunke med missionskort. Der kan udføres missioner som Anerkist, Bandemedlem eller Hipster. Spillet vindes når 3 ud af 5 missioner er fuldført.\n Består dine missioner i at eje grunde, ejendomme eller kontanter, skal de ejes på tidspunktet du erklærer dig for vinder. Det bestemmes inden spilstart om man holder sin mission hemmelig.\nHusk at holde styr på og gøre opmærksom på hvor ofte I lander på et givent felt. Det anbefales at vælge forskellige karakterer og fordele karakterene jævnt for bedst mulig gameplay.");
    Regel regel5  = new Regel("Det er ulovligt", "... at spille hvis du ikke er i besiddelse af selvironi eller humor.");
    Regel regel6  = new Regel("Køb, bytte og salg af grunde", "Det er tilladt under hele spillet at bytte, købe og sælge grunde spillerne imellem. Det er ikke et krav at det er din tur, for at du må købe, sælge eller bytte med en medspiller. Du skal dog have færdiggjort eventuelle handler inden du slår med terningerne. Mangler du penge til at betale, må du ikke sælge/bytte men gerne pantsætte grunde.");
    Regel regel7  = new Regel("Ekstra kast", "Kaster man 2 af samme slags, får man ekstra kast.");
    Regel regel8  = new Regel("Skyd genvej", "I spillet findes 11 felter som giver adgang til spillets inde genvejsring. Felterne er market med -> og findes på felt 2,7,10,13,17,19,25,28,29,32,35\nSådan skyder du genvej: Så to ens med terningerne og land på et af ovenstående felter. Derefter rykkes du automatisk ind i genvejsringen og skal slå igen. Ved dette kast må kun benyttes en terning.\nEksempel: Lander du på felt 7 (Skæbnen) ved at slå 2 x 3 med terningerne, skal du trække et Skæbnen-kort og udføre dette som normalt. Dernæst rykker du ind i genvejsringen og slår igen med en terning. Hvis du her slår 4, rykker du 4 pile frem i den inderste cirkel og lander på felt 19 (Vild med ild). Feltet udføres som normalt, hvoreftr runden slutter.\nOBS: Hvis du i dit oprindelige slag, trækker et kort fra Skæbnen, som gør at du skal rykke eller vente en omgang, frafalder retten til at skyde genvej.");
    Regel regel9  = new Regel("Snyd", "Snyder du, skal du have med bæltet og leve et evigt liv på gaden. Gå hjem!");
    Regel regel10 = new Regel("Huse og hoteller", "");
    Regel regel11 = new Regel("Glemmer", "");
    Regel regel12 = new Regel("Salatfadet", "");
    Regel regel13 = new Regel("BZ en grund", "");
    Regel regel14 = new Regel("Vild med ild", "");
    Regel regel15 = new Regel("Money Exchange","");
    Regel regel16 = new Regel("Afpresning", "");
    Regel regel17 = new Regel("Forældrekøb", "");
    Regel regel18 = new Regel("Vælt en bil", "");
    Regel regel19 = new Regel("Gentrificér en grund", "");
    Regel regel20 = new Regel("Hvis man vælger ikke at købe en grund", "");
    Regel regel21 = new Regel("Pantsætning", "");
    Regel regel22 = new Regel("Uafgjort", "");
    Regel regel23 = new Regel("Konkurs", "");

    regelListe.addAll(Arrays.asList(regel1,regel2,regel3,regel4,regel5,regel6,regel7,regel8,regel9,regel10,regel11,regel12,
                                    regel13,regel14,regel15,regel16,regel17,regel18,regel19,regel20,regel21,regel22,regel23));
    }

    //***GETTER METHOD***-----------------------------------------------------------------------------------------------
    public List<Regel> getRegelListe() {
        return regelListe;
    }

    //***END***---------------------------------------------------------------------------------------------------------
}
