package com.company;

import java.io.IOException;

public class Controleur {


    public Controleur() throws IOException {
        lancerJeu();
    }

    public void lancerJeu() throws IOException {
        /*Jeu jeu = new Simulation();*/
        Jeu jeu = new Interaction();
        jeu.partieClassique(3);
        jeu.lancerJeu();
    }
}
