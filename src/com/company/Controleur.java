package com.company;

public class Controleur {


    public Controleur() {
        lancerJeu();
    }

    public void lancerJeu() {
        /*Jeu jeu = new Simulation();*/
        Jeu jeu = new Interaction();
        jeu.partieClassique(3);
        jeu.lancerJeu();
    }
}
