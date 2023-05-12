package com.ke.dylan.Player;
import java.util.Random;
import java.util.Scanner;

public class Sortinghat {

    private String Sortinghat;

    public String getSortinghat() {
        return Sortinghat;
    }

    public void setSortinghat(String Sortinghat) {
        this.Sortinghat = Sortinghat;
    }


    public Sortinghat() {

        System.out.println("Le choixpeau magique se pose sur vous, êtes vous prêt ? ");
        System.out.println("1 Oui ");
        System.out.println("2 Non ");


        Scanner input = new Scanner(System.in);
        String ChoixChoixpeau = "2";
        ChoixChoixpeau = input.next();



        while (ChoixChoixpeau.equals("2")) {

            System.out.println("Bon tu es prêt maintenant ?");
            System.out.println("1 Oui ");
            System.out.println("2 Non ");
            ChoixChoixpeau = input.next();
        }

        Random rand = new Random();
        int randomNum = rand.nextInt(4);
        String Sortinghat = "";

        if (randomNum == 0) {
            System.out.println("Vous êtes à Gryffondor, vous gagnez 50 PV supplémentaire ");
            Sortinghat = "Gryffindor";
        }

        else if (randomNum == 1) {
            System.out.println("Vous êtes à Serpentard, vous gagnez 10 de puissance magique supplémentaire ");
            Sortinghat = "Slytherin";
        }

        else if (randomNum == 2) {
            System.out.println("Vous êtes à Serdaigle, vous gagnez 10 de précision");
            Sortinghat = "Ravenclaw";
        }

        else if (randomNum == 3) {
            System.out.println("Vous etes à Poufsouffle, vos potions vous rendront 10PV supplémentaire ");
            Sortinghat = "Hufflepuf";
        }

        this.Sortinghat = Sortinghat;

    }
}
