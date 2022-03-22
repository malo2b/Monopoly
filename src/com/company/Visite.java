package com.company;

public class Visite extends Case{

    @Override
    protected void onJoueurSurCase(Joueur j) {
        System.out.println(toString(j));
    }


    public String toString(Joueur j) {
        return "Le joueur "+j.getIdJoueur()+" est en visite.";
    }


}
