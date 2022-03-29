package com.company;

public abstract class Proprietee extends Case {

    protected boolean estAchetee;
    protected Joueur proprietaire;
    protected final int prix;
    protected String nom;

    public Proprietee(int prix, String nom) {
        this.prix = prix;
        this.nom = nom;
        estAchetee = false;
    }
}
