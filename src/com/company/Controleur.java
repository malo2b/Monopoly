package com.company;

import java.util.ArrayList;

public class Controleur {

    private Plateau plateau;
    private ArrayList<Joueur> joueurs;
    private Case[] plateauCase;
    private int nbCase;
    private int nbJoueurs;

    public Controleur() {
        this.nbCase = 40;
        this.plateauCase = new Case[nbCase];
        joueurs = new ArrayList<Joueur>();
        this.setNbJoueurs(3);
        this.plateau = new Plateau();
    }

    public void setNbJoueurs(int nbJoueurs) {
        this.nbJoueurs = nbJoueurs;
    }

    public void remplirJoueur(ArrayList<Joueur> j){
        // Simulation a 3 joueurs
        for (int i = 0; i < nbJoueurs; i++) {
            joueurs.add(new Joueur(String.format("%d", i)));
        }
    }
//    public void remplirPlateau(Case[] p){
//        p[0] = new Depart(500);
//        joueurs.forEach(joueur -> p[0].onJoueurSurCase(joueur));
//
//        for (int i=1; i <nbCase; i++){
//            p[i] = new Visite();
//        }
//
//        p[12] = new Chance(200);
//        p[18] = new Chance(200);
//        p[31] = new Chance(200);
//        p[5] = new Chance(200);
//
//        p[15] = new Impot(100);
//        p[23] = new Impot(100);
//        p[35] = new Impot(100);
//    }

    public void lancerSimulation1 () {

        // Lancement de la simulation en 20 tours
        for (int i = 0; i < 20; i++) {
            System.out.println("Tour "+i);
            for (int j = 0; j < nbJoueurs; j++) {
                joueurs.get(j).lancerDe();
                System.out.println(joueurs.get(j).toString());
                plateau.interact(joueurs.get(j), joueurs.get(j).getCurrentCase());
            }
            System.out.println("\n");
        }

        // Affichage resultats
        for (int j = 0; j < nbJoueurs; j++) {
            System.out.println(joueurs.get(j).toString());
        }
    }
}
