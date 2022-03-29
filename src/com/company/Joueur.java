package com.company;

import java.util.Random;

public class Joueur {

    private String nom;
    private int balance;
    private int cumulDes;
    private static int nbJoueurs = 0;
    private int idJoueur;
    private boolean enFaillite;

    public boolean isEnFaillite() {
        return enFaillite;
    }

    Random random = new Random();

    public Joueur(String nom) {
        nbJoueurs++;
        this.nom = nom;
        this.idJoueur = nbJoueurs;
        this.enFaillite = false;
    }

    public void lancerDe() {
        int de1 = random.nextInt(6) + 1;
        int de2 = random.nextInt(6) + 1;
        cumulDes = cumulDes + de1 + de2;
    }

    public int getIdJoueur() {
        return idJoueur;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public int getCumulDes() {
        return cumulDes;
    }

    public int getCurrentCase() {
        return cumulDes % 40;
    }


    @Override
    public String toString() {
        return "Joueur "+idJoueur+" case actuelle :"+getCurrentCase()+" , balance :"+balance;
    }

    public void payPenalite(Joueur proprietaire, int penalite) {
        enleveArgent(penalite);
        proprietaire.ajoutArgent(penalite);
    }

    public void ajoutArgent(int montant) {
        balance += montant;
    }

    public void enleveArgent(int montant) {
        balance -= montant;
        if (balance < 0) {
            enFaillite = true;
        }
    }
}
