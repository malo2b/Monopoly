package com.company;

import java.util.ArrayList;

public class Controleur {

    private Plateau plateau;
    private ArrayList<Joueur> joueurs;
    private int nbJoueurs;

    public Controleur() {
        this.plateau = new Plateau();
        joueurs = new ArrayList<Joueur>();
    }

    public void setNbJoueurs(int nbJoueurs) {
        this.nbJoueurs = nbJoueurs;
    }
}
