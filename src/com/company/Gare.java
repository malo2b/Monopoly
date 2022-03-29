package com.company;

public class Gare extends Proprietee {

    private String nom;

    public Gare(String nom) {
        this.nom = nom;
    }

    @Override
    protected void onJoueurSurCase(Joueur j) {

    }

    @Override
    public String toString() {
        return "Gare " + nom;
    }
}
