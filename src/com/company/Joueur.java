package com.company;

import java.util.Random;

public class Joueur {

    private String nom;
    private int balance;
    private int cumulDes;
    Random random = new Random();

    public Joueur(String nom) {
        this.nom = nom;
    }

    public void lancerDe() {
        int de1 = random.nextInt(6) + 1;
        int de2 = random.nextInt(6) + 1;

        cumulDes = cumulDes + de1 + de2;
    }

    public int getCurrentCase() {
        return cumulDes % 40;
    }
}
