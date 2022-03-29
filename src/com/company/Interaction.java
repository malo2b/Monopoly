package com.company;

public class Interaction extends Jeu {
    @Override
    public void lancerJeu() {
        do {
            System.out.println("\nTour "+ nbTours + "\n");
            for (int j = 0; j < nbJoueurs; j++) {
                joueurs.get(j).lancerDe();
                System.out.println(joueurs.get(j).toString());
                plateau.interact(joueurs.get(j));
            }
            nbTours++;
        } while (!isJoueurEnFaillite());

    }
}
