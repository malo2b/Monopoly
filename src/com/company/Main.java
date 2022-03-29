package com.company;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        Controleur controleur = new Controleur();
        try {
            controleur.lancerJeu();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
