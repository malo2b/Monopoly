package com.company;

public class Simulation extends Jeu {
    @Override
    public void lancerJeu() {
        // Lancement de la simulation en 20 tours
        for (int i = 0; i < 20; i++) {
            System.out.println("Tour "+i);
            for (int j = 0; j < NBCASES; j++) {
                joueurs.get(j).lancerDe();
                System.out.println(joueurs.get(j).toString());
                plateau.interact(joueurs.get(j));
            }
            System.out.println("\n");
        }

        // Affichage resultats
        for (int j = 0; j < NBCASES; j++) {
            System.out.println(joueurs.get(j).toString());
        }

    }
}
