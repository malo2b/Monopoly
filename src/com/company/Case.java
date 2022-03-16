package com.company;

import java.util.ArrayList;

public abstract class Case {

    protected ArrayList<Joueur> joueurs;
    protected abstract void onJoueurSurCase();

    public Case() {
        this.joueurs = new ArrayList<Joueur>();
    }
}
