package com.company;

import java.io.IOException;

public class Interaction extends Jeu {
    @Override
    public void lancerJeu() throws IOException {
        int tamponCumulDe;
        Joueur j;
        initBalanceJoueurs();
        do {
            System.out.println("\nTour "+ nbTours + "\n");
            for (int i = 0; i < nbJoueurs; i++) {
                j = joueurs.get(i);
                tamponCumulDe = j.getCumulDes();
                j.lancerDe();
                System.out.println(j.toString());
                if (tamponCumulDe%40 > j.getCumulDes()%40) { // Passage par la case départ
                    System.out.println("Passage par la case départ : +200$");
                    j.ajoutArgent(200);
                }
                plateau.interact(j);
            }
            nbTours++;
        } while (!isJoueurEnFaillite());

    }
}
