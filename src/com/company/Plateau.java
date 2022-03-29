package com.company;

import java.io.IOException;

public class Plateau {

    private final int nbCases;
    private Case [] cases;

    public Plateau(int nbCases) {
        this.nbCases = nbCases;
        this.cases = new Case[nbCases];
        remplirPlateau();
    }

    public Case[] getCases() {
        return cases;
    }

    public void remplirPlateau(){
        cases[0] = new Depart(500);
        cases[1] = new Quartier(60, "Boulevard de Belleville");
        cases[2] = new CaisseDeCommunaute();
        cases[3] = new Quartier(60, "Rue lecourbe");
        cases[4] = new Impot(200);
        cases[5] = new Gare("Montparnasse");
        cases[6] = new Quartier(100, "Rue de Vaugirard");
        cases[7] = new Chance(200);
        cases[8] = new Quartier(100, "Rue des courcelles");
        cases[9] = new Quartier(120, "Avenue de la république");
        cases[10] = new Visite();
        cases[11] = new Quartier(140, "Boulevard de la vilette");
        cases[12] = new Compagnie("Compagnie de distribution d'éléctricité");
        cases[13] = new Quartier(140, "Avenue de neuilly");
        cases[14] = new Quartier(160, "Rue de paradis");
        cases[15] = new Gare("de Lyon");
        cases[16] = new Quartier(180, "Avenue Mozart");
        cases[17] = new CaisseDeCommunaute();
        cases[18] = new Quartier(180, "Boulevard St Michel");
        cases[19] = new Quartier(200, "Place Pigalle");
        cases[20] = new Parc();
        cases[21] = new Quartier(220, "Avenue Matignon");
        cases[22] = new Chance(200);
        cases[23] = new Quartier(220, "Boulevard Malesherbes");
        cases[24] = new Quartier(240, "Avenue Henri Martin");
        cases[25] = new Gare("du Nord");
        cases[26] = new Quartier(260, "Faubourg St Honoré");
        cases[27] = new Quartier(260, "Place de la Bourse");
        cases[28] = new Compagnie("Compagnie de distribution dex eaux");
        cases[29] = new Quartier(280, "Rue la Fayette");
        cases[30] = new Prison();
        cases[31] = new Quartier(300, "Avenue de Breteuil");
        cases[32] = new Quartier(300, "Avenue Foch");
        cases[33] = new CaisseDeCommunaute();
        cases[34] = new Quartier(320, "Boulevard des capucines");
        cases[35] = new Gare("Saint-lazare");
        cases[36] = new Chance(200);
        cases[37] = new Quartier(350, "Avenue des Champs-Elysées");
        cases[38] = new Impot(150);
        cases[39] = new Quartier(400, "Rue de la Paix");
    }


    public void interagir(Joueur j) throws IOException {
        int currentCase = j.getCurrentCase();
        System.out.println(cases[currentCase].toString());
        cases[currentCase].onJoueurSurCase(j);
        System.out.println("");
    }
}
