package com.company;

public class Chance extends Evenement {

    private int montant;

    public Chance(int m){
        this.montant = m;
    }
    @Override
    protected void onJoueurSurCase(Joueur j) {
        j.ajoutArgent(montant);
        System.out.println(toString(j));
    }

    public String toString(Joueur j){
        return "Jour de chance ! Le joueur "+j.getIdJoueur()+" touche une somme de "+montant;
    }
}
