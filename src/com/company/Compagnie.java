package com.company;

public class Compagnie extends Proprietee {

    public Compagnie(String nom) {
        super(150, nom);
    }

    @Override
    protected void onJoueurSurCase(Joueur j) {

    }

    @Override
    public String toString() {
        return nom;
    }
}
