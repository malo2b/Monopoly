package com.company;

import java.io.IOException;
import java.util.ArrayList;

public abstract class Jeu {

    protected ArrayList<Joueur> joueurs;
    protected int nbJoueurs;
    protected int nbTours;
    protected Plateau plateau;
    protected static final int NBCASES = 40;

    public void partieClassique(int nbJoueurs) {
        // Init
        this.nbJoueurs = nbJoueurs;
        this.nbTours = 1;
        this.plateau = new Plateau(NBCASES);
        joueurs = new ArrayList<Joueur>();
        remplirJoueur(nbJoueurs);
    }

    public void remplirJoueur(int nbJoueurs){
        for (int i = 0; i < nbJoueurs; i++) {
            joueurs.add(new Joueur(String.format("Joueur %d", i + 1)));
        }
    }

    public void setMoneyJoueur(){
        for (int i = 0; i < joueurs.size(); i++) {
            joueurs.get(i).setBalance(500);
        }
    }
    public abstract void lancerJeu() throws IOException;

    protected boolean isJoueurEnFaillite() {
        for (int i = 0; i < nbJoueurs; i++) {
            if (joueurs.get(i).isEnFaillite()) {
                return true;
            }
        }
        return false;
    }

}
