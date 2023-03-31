package com.ke.dylan.Player;

import java.util.Scanner;

public class WizardCreation {


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

        Profile profile = new Profile();


        profile.wand = new Wand();
        System.out.println(profile.wand.getWand());

        profile.pet = new Pet();
        System.out.println(profile.pet.getPet());

        SortingHat SortingHat = new SortingHat();
        SortingHat.start();

        profile.start();


    }
}