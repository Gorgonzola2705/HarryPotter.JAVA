package com.ke.dylan.Player;
import java.util.Random;
import java.util.Scanner;

public class SortingHat {
    public void start() {

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

            if (randomNum == 0) {
                System.out.println("vs etes à gryffondor ");
            }

            else if (randomNum == 1) {
                System.out.println("vs etes à Serpentard ");
            }

            else if (randomNum == 2) {
                System.out.println("vs etes à Serdaigle ");
            }

            else if (randomNum == 3) {
                System.out.println("vs etes à Poufsouffle ");
            }



    }
    }

