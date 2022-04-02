package com.company;

import com.company.*;
import org.junit.jupiter.api.*;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;

public class CaseTest {
    private Plateau p;
    private Joueur j;
    private Case[] c;


    @BeforeEach
    void initTest() throws IOException {
        p = new Plateau(40);
        j = new Joueur("Lewis");
        j.setBalance(500);
        c = p.getCases();
    }

    @Test
    void testCaseImpot() throws IOException {
        c[5].onJoueurSurCase(j);

        assertEquals(300,j.getBalance());
    }

    @Test
    void testCaseChance() throws IOException {
        c[7].onJoueurSurCase(j);
        assertEquals(700,j.getBalance());
    }

}
