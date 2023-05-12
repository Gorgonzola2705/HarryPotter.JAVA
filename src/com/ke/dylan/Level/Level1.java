package com.ke.dylan.Level;
import com.ke.dylan.Player.Profile;
import com.ke.dylan.Player.Sortinghat;

import java.util.Random;
import java.util.Scanner;

public class Level1 {
    private Profile profile;

    public Level1(Profile profile) {
        this.profile = profile;
    }

    public void start() {

        int PV;
        PV = profile.getPVmax();

        int ReussiteAttaque;
        ReussiteAttaque = profile.getPrecision();

        Random rand = new Random();
        int random;

        String Reussite;
        Reussite = "Vous réussissez votre attaque";
        String Rate;
        Rate ="Vous ratez votre attaque";

        int NombrePotion;
        NombrePotion = 5;
        int Potion;
        Potion = 30;

        int PVBoss = 250;

        System.out.println("Souhaitez vous afficher vos stats ?");

        System.out.println("1 Oui");
        System.out.println("2 Non");

        Scanner input = new Scanner(System.in);
        String Stats = "2";
        Stats = input.next();

        if (Stats.equals("1")) {
            System.out.println("PV : " + profile.getPVmax());
            System.out.println("Puissance magique : " + profile.getPuissanceMagique());
            System.out.println("Puissance physique : " + profile.getPuissancePhysique());
            System.out.println("Précision : " + profile.getPrecision());
            System.out.println("Esquive : " + profile.getEsquive());
        }


        System.out.println("Souhaitez vous commencer le premier niveau ?");
        System.out.println("1 Oui");
        System.out.println("2 Non");


        String DebutLevel1 = "2";
        DebutLevel1 = input.next();

        while (DebutLevel1.equals("2")) {

            System.out.println("Bon tu es prêt maintenant ?");
            System.out.println("1 Oui ");
            System.out.println("2 Non ");
            DebutLevel1 = input.next();
        }

            System.out.println("Les toilettes du donjon sont remplies d'objets.");
            System.out.println("Le Troll a " + PVBoss + " PV.");

        while (PVBoss > 0) {


            System.out.println("Que souhaitez vous faire ?");
            System.out.println("");

            System.out.println("1 Attaquer");
            System.out.println("2 Ouvrir le sac");
            System.out.println("3 Ne rien faire");


            String ChoixCombat = "";
            ChoixCombat = input.next();

            if (ChoixCombat.equals("1")) {
                System.out.println("1 Wingardium Leviosa ");
                System.out.println("dégât magique : 5 (+10 en présence d'objet)");
                System.out.println("100% de précision");

                System.out.println("");

                System.out.println("2 Coup de poing");
                System.out.println("Se base sur votre puissance Physique (" + profile.getPuissancePhysique() +")");
                System.out.println("95% de précision");

                System.out.println("");

                System.out.println("3 MA LUBULUL");

                String ChoixAttaque = "";
                ChoixAttaque = input.next();

                if (ChoixAttaque.equals("1")) {
                    random = rand.nextInt(100);

                    if (random > ReussiteAttaque + 100) {
                        System.out.println(Rate);
                    }

                    if (random < ReussiteAttaque + 100) {
                        PVBoss -= 15 + profile.getPuissanceMagique();
                        System.out.println(Reussite);
                    }

                    }

                else if (ChoixAttaque.equals("2")) {
                    random = rand.nextInt(100);

                    if (random > ReussiteAttaque + 95) {
                        System.out.println(Rate);
                    }

                    if (random < ReussiteAttaque + 95) {
                        PVBoss -= profile.getPuissancePhysique();
                        System.out.println(Reussite);
                    }
                }

                else if (ChoixAttaque.equals("3")) {
                    System.out.println("Il ne se passe rien");
                }

                if (PVBoss > 0) {
                    System.out.println("");
                    System.out.println("Il reste " + PVBoss + "PV au Boss");
                    System.out.println("");
                }

                }


                else if (ChoixCombat.equals("2")) {
                System.out.println("1 Potion de soin (restaure 30 PV)");
                System.out.println("Il vous en reste " + NombrePotion);

                String ChoixPotion = "";
                ChoixPotion = input.next();

                if (ChoixPotion.equals("1")) {

                    if (NombrePotion > 0) {
                        NombrePotion -= 1;
                        PV += 30 + profile.getBuffPotionHufflepuff();

                        if (PV > profile.getPVmax()) {
                            PV = profile.getPVmax();
                        }
                    }

                    if (NombrePotion == 0) {
                        System.out.println("Vous n'avez plus de potions...");
                    }


                }
            }

                else if (ChoixCombat.equals("3")) {
                System.out.println("");
                System.out.println("Vous choisissez de ne rien faire");

            }

            if (PVBoss > 0) {

                random = rand.nextInt(100);

                if (random > profile.getEsquive()) {
                    System.out.println("");
                    System.out.println("Le troll vous attaque et vous perdez 15 PV");
                    PV -= 15;

                    if (PV > 0) {
                        System.out.println("");
                        System.out.println("Il vous reste " + PV + "PV");
                    }
                }

                if (random < profile.getEsquive()) {

                    System.out.println("");
                    System.out.println("Le troll rate son attaque");

                    if (PV > 0) {
                        System.out.println("");
                        System.out.println("Il vous reste " + PV + "PV");
                    }
                }
            }

            if (PV <= 0) {
                System.out.println("");
                System.out.println("Vous n'avez plus de points de vie");
                System.out.println("Dommage, vous avez perdu...");
                System.exit(0);
            }
        }

        if (PVBoss < 0) {
            System.out.println("");
            System.out.println("Félicitation vous avez vaincu le troll !");

        }
    }
    }



