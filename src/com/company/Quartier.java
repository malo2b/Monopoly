package com.company;

public class Quartier extends Proprietee {

    private boolean isAchetee;
    private Joueur proprietaire;
    private int prix;
    private String nom;

    public Quartier(int prix, String nom) {
        this.prix = prix;
        this.nom = nom;
    }

    public int getPenalite() {
        return prix / 2;
    }

    @Override
    protected void onJoueurSurCase(Joueur j) {
        boolean achete = false;
        if (isAchetee && j != proprietaire) {
            j.payPenalite(proprietaire, getPenalite());
        } else if (j == proprietaire) {
            System.out.println("Bienvenue à la maison !");
        } else {
            System.out.println("La case est libre et coute " + prix + "$ Voulez vous l'acheter ? [O/N]");

            // Interaction

            if (achete) {
                if (j.getBalance() >= prix) {
                    j.enleveArgent(prix);
                    proprietaire = j;
                } else {
                    System.err.println("Pas assez d'argent sur le compte pour pouvoir effectuer la transaction");
                }

            }
        }
    }
}
