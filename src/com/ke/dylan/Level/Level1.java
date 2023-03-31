package com.ke.dylan.Level;
import com.ke.dylan.Player.Profile;

import java.util.Scanner;

public class Level1 {

    public void start(Profile PV) {

        System.out.println("Souhaitez vous commencer le premier niveau ?");
        System.out.println("1 Oui");
        System.out.println("2 Non");

        Scanner input = new Scanner(System.in);
        String DebutLevel1 = "2";
        DebutLevel1 = input.next();

        while (DebutLevel1.equals("2")) {

            System.out.println("Bon tu es prêt maintenant ?");
            System.out.println("1 Oui ");
            System.out.println("2 Non ");
            DebutLevel1 = input.next();
        }


        //System.out.println(PV.getPvMax());

        //Profile.PV = 150;

        int Boss = 250;

        //while (Boss > 0 || PV.getPvMax() > 0) {  //or player pv > 0

            System.out.println("La salle est remplie d'objets.");
            System.out.println("Le boss a " + Boss + " PV.");

            System.out.println("Que souhaitez vous faire ?");
            System.out.println("1 Attaquer");
            System.out.println("2 Ouvrir le sac");
            System.out.println("3 Que souhaitez vous faire ?");


            String ChoixCombat = "";
            ChoixCombat = input.next();

            if (ChoixCombat.equals("1")) {
                System.out.println("1 Wingardium Leviosa "); //
                System.out.println("2 Coup de poing");
                System.out.println("3 MA LUBULUL"); //troll

                String ChoixAttaque = "";
                ChoixAttaque = input.next();

                Boss -= 10;
            } else if (ChoixCombat.equals("2")) {
                Boss -= 10; //depend dgt physique
            } else if (ChoixCombat.equals("3")) {
                System.out.println("Il ne se passe rien");
            }


            // atk du boss + if player = 0 c fini
        }

        //System.out.println("GGWP");


    }
