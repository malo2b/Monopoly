package com.company;

public class Plateau {

    private Case [] cases;

    public Plateau(Case[] c) {
        this.cases = c;
    }

    public void interact(Joueur j, int numCase) {
        cases[numCase].onJoueurSurCase(j);
    }
}
