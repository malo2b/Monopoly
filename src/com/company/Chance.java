package com.company;

public class Chance extends Evenement {

    private int montant;

    public Chance(int m){
        this.montant = m;
    }

    @Override
    protected void onJoueurSurCase(Joueur j) {
        j.ajoutArgent(montant);
        System.out.println("Jour de chance vous gagnez 200$");
    }

    public String toString(){
        return "Case Chance";
    }
}
