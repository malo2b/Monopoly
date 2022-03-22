package com.company;

public class Depart extends Case {
    private int montant;

    public Depart(int m){
        this.montant = m;
    }

    @Override
    protected void onJoueurSurCase(Joueur j) {
        j.setBalance(j.getBalance()+montant);
        System.out.println(toString(j));
    }

    public String toString(Joueur j) {
        return "Le joueur "+j.getIdJoueur()+" touche une somme de "+montant;
    }
}
