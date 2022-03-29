package com.company;

public class Depart extends Case {
    private int montant;

    public Depart(int m){
        this.montant = m;
    }

    @Override
    protected void onJoueurSurCase(Joueur j) {
        j.ajoutArgent(montant);
        System.out.println(toString(j));
    }

    public String toString(Joueur j) {
        return "Case Départ";
    }
}
