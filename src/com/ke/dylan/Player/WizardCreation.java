package com.ke.dylan.Player;

import java.util.Scanner;

public class WizardCreation {
    Profile profile;

    public WizardCreation(Profile profile) {
        this.profile = profile;
    }

    public void start() {

        System.out.println(" Bienvenue dans le monde de Harry Potter ! \n " +
                "Tu vas vivre une aventure folle aux côtés de tes amis. \n"  +
                "\n" +
                "Avant toute chose, quel est ton prénom ?");


        Scanner input = new Scanner(System.in);
        String Prénom = "";
        Prénom = input.next();
        System.out.println(" Enchanté, moi c'est Dumbledore, tu vas devoir avant de rejoindre l'académie, trouver la baguette qui te convient \n " +
                "Bonne chance ! " + Prénom + "." + "\n" +
                " ");

        System.out.println(" A titre informatif, voici vos stats de base \n " +
                "Puissance magique : 20 \n " +
                "Puissance physique : 10 \n " +
                "PV : 100 \n " +
                "Esquive : 15  \n " +
                " ");

        System.out.println("Vous possédez également 5 potions de soin qui se rechargeront à la fin de chaque niveau.");



        profile.wand = new Wand();

        profile.pet = new Pet();

        profile.Sortinghat = new Sortinghat();

        profile.start();

    }
}