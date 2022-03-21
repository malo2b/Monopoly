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

    public void lancerSimulation1 () {
        // Simulation a 3 joueurs
        this.setNbJoueurs(3);
        for (int i = 0; i < nbJoueurs; i++) {
            joueurs.add(new Joueur(String.format("%d", i)));
        }

        // Lancement de la simulation en 20 tours
        for (int i = 0; i < 20; i++) {
            for (int j = 0; j < nbJoueurs; j++) {
                joueurs.get(j).lancerDe();
                plateau.interact(joueurs.get(j), joueurs.get(j).getCurrentCase());
            }
        }

        // Affichage resultats
        for (int j = 0; j < nbJoueurs; j++) {
            System.out.println(joueurs.get(j).toString());
        }
    }
}
