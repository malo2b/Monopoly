package com.company;

public class Impot extends  Case{
    private int montant;

    public Impot(int m){
        this.montant = m;
    }

    @Override
    protected void onJoueurSurCase(Joueur j) {
        j.enleveArgent(montant);
        System.out.println(toString(j));
    }

    public String toString(Joueur j){
        return "Aie le fisc vous rattrape ! Vous devez payer "+montant;
    }
}
