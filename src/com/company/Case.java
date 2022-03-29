package com.company;

import java.io.IOException;
import java.util.ArrayList;

public abstract class Case {

    protected abstract void onJoueurSurCase(Joueur j) throws IOException;

    public Case() {

    }

}
