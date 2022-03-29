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

        for (int i=1; i <40; i++){
            cases[i] = new Visite();
        }

        // Chance
        cases[12] = new Chance(200);
        cases[18] = new Chance(200);
        cases[31] = new Chance(200);
        cases[5] = new Chance(200);
        // Impot
        cases[15] = new Impot(100);
        cases[23] = new Impot(100);
        cases[35] = new Impot(100);
        // Quartier
        cases[1] = new Quartier(60, "Boulevard de Belleville");
        cases[3] = new Quartier(60, "Rue lecourbe");
        cases[6] = new Quartier(100, "Rue de Vaugirard");
        cases[8] = new Quartier(100, "Rue des courcelles");
        cases[9] = new Quartier(120, "Avenue de la république");
        cases[11] = new Quartier(140, "Boulevard de la vilette");
        cases[13] = new Quartier(140, "Avenue de neuilly");
        cases[14] = new Quartier(160, "Rue de paradis");
        cases[16] = new Quartier(180, "Avenue Mozart");
        cases[18] = new Quartier(180, "Boulevard St Michel");
        cases[19] = new Quartier(200, "Place Pigalle");
        cases[21] = new Quartier(220, "Avenue Matignon");
        cases[23] = new Quartier(220, "Boulevard Malesherbes");
        cases[24] = new Quartier(240, "Avenue Henri Martin");
        cases[26] = new Quartier(260, "Faubourg St Honoré");
        cases[27] = new Quartier(260, "Place de la Bourse");
        cases[29] = new Quartier(280, "Rue la Fayette");
        cases[31] = new Quartier(300, "Avenue de Breteuil");
        cases[32] = new Quartier(300, "Avenue Foch");
        cases[34] = new Quartier(320, "Boulevard des capucines");
        cases[37] = new Quartier(350, "Avenue des Champs-Elysées");
        cases[39] = new Quartier(400, "Rue de la Paix");
    }


    public void interact(Joueur j) throws IOException {
        cases[j.getCurrentCase()].onJoueurSurCase(j);
    }
}
