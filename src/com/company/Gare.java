package com.company;

public class Gare extends Proprietee {

    public Gare(String nom) {
        super(200, nom);
    }

    @Override
    protected void onJoueurSurCase(Joueur j) {

    }

    @Override
    public String toString() {
        return "Gare " + nom;
    }
}
