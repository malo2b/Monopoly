package com.company;

public class Plateau {

    private static final int nbCases = 40;
    private Case [] cases;

    public Plateau() {
    }

    public void interact(Joueur j, int numCase) {
        cases[numCase].onJoueurSurCase(j);
    }
}
