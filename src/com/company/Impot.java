package com.company;

public class Impot extends Evenement {
    private int montant;

    public Impot(int m){
        this.montant = m;
    }

    @Override
    protected void onJoueurSurCase(Joueur j) {
        j.enleveArgent(montant);
        System.out.println("Aie le fisc vous rattrape vous payez " + montant + "$");
    }

    public String toString(Joueur j){
        return "Impots";
    }
}
