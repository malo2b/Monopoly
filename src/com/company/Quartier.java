package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Quartier extends Proprietee {


    public Quartier(int prix, String nom) {
        super(prix, nom);
    }

    public int getPenalite() {
        return prix / 2;
    }

    @Override
    protected void onJoueurSurCase(Joueur j) throws IOException {
        if (estAchetee && j != proprietaire) {
            j.payPenalite(proprietaire, getPenalite());
        } else if (j == proprietaire) {
            System.out.println("Bienvenue à la maison !");
        } else {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            System.out.print("La case est libre et coute " + prix + "$ Voulez vous l'acheter ? [O/N]");

            String response = br.readLine();

            if (response.equals("O")) {
                if (j.getBalance() >= prix) {
                    j.enleveArgent(prix);
                    proprietaire = j;
                } else {
                    System.err.println("Pas assez d'argent sur le compte pour pouvoir effectuer la transaction");
                }

            }
        }
    }

    @Override
    public String toString() {
        return "Quartier : " + this.nom ;
    }
}
