package com.company;

public class Plateau {

    private Case [] cases;

    public Plateau() {
        this.cases = new Case[40];
        for (int i = 0; i < 40; i++) {
            this.cases[i] = new Depart();
        }
    }

    public void interact(Joueur j, int numCase) {
        cases[numCase].onJoueurSurCase(j);
    }
}
