package com.company;

public class Compagnie extends Proprietee {

    private String nom;

    public Compagnie(String nom) {
        this.nom = nom;
    }

    @Override
    protected void onJoueurSurCase(Joueur j) {

    }

    @Override
    public String toString() {
        return nom;
    }
}
