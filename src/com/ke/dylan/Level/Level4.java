package com.ke.dylan.Level;
import com.ke.dylan.Player.Profile;

import java.util.Random;
import java.util.Scanner;

public class Level4 {
    private Profile profile;

    public Level4(Profile profile) {
        this.profile = profile;
    }

    public void start() {

        int PV;
        PV = profile.getPVmax();

        int ReussiteAttaque;
        ReussiteAttaque = profile.getPrecision();

        Random rand = new Random();
        int random;
        int random2;

        String Focus;
        String Focus2;
        String Focus3;
        Focus = "Qui souhaitez-vous attaquer ?";
        Focus2 = "1 Voldemort";
        Focus3 = "2 Peter Pettigrow";


        String Reussite;
        Reussite = "Vous réussissez votre attaque";
        String Rate;
        Rate = "Vous ratez votre attaque";

        int NombrePotion;
        NombrePotion = 5;
        int Potion;
        Potion = 30;

        int PVBoss = 10000000;
        int PVBoss2 = 10000;


        System.out.println("Souhaitez vous commencer le quatrième niveau ?");
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
        System.out.println("Vous êtes face à face avec Voldemort et  Peter Pettigrow dans le Cimetière de Little Hangleton ");
        System.out.println("Voldemort a " + PVBoss + " PV.");
        System.out.println("Peter Pettigrow a " + PVBoss2 + " PV.");

        while ((PVBoss > 0) || (PVBoss2 > 0)) {


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
                System.out.println("Se base sur votre puissance Physique (" + profile.getPuissancePhysique() + ")");
                System.out.println("95% de précision");

                System.out.println("");

                System.out.println("3 MA LUBULUL");

                System.out.println("");

                System.out.println("4 Accio");
                System.out.println("Dégât magique : 0, attire un objet aux alentours");
                System.out.println("30% de précision");

                System.out.println("");

                System.out.println("5 Expecto Patronum");
                System.out.println("invoque votre Patronus");
                System.out.println("100% de précision");

                String ChoixAttaque = "";
                ChoixAttaque = input.next();


                if (ChoixAttaque.equals("1")) {

                    System.out.println(Focus);
                    System.out.println(Focus2);
                    System.out.println(Focus3);

                    String ChoixFocus = "";
                    ChoixFocus = input.next();

                    if (ChoixFocus.equals("1")) {
                        random = rand.nextInt(100);

                        if (random > ReussiteAttaque + 100) {
                            System.out.println(Rate);
                        } else if (random < ReussiteAttaque + 100) {
                            PVBoss -= 5 + profile.getPuissanceMagique();
                            System.out.println(Reussite);
                        }
                    }

                        else if (ChoixFocus.equals("2"))
                        {
                            random = rand.nextInt(100);

                            if (random > ReussiteAttaque + 100) {
                                System.out.println(Rate);
                            } else if (random < ReussiteAttaque + 100) {
                                PVBoss2 -= 5 + profile.getPuissanceMagique();
                                System.out.println(Reussite);
                            }
                        }
                }

                else if (ChoixAttaque.equals("2")) {

                    System.out.println(Focus);
                    System.out.println(Focus2);
                    System.out.println(Focus3);

                    String ChoixFocus = "";
                    ChoixFocus = input.next();

                    if (ChoixFocus.equals("1")) {
                        random = rand.nextInt(100);

                        if (random > ReussiteAttaque + 95) {
                            System.out.println(Rate);

                        } else if (random < ReussiteAttaque + 95) {
                            PVBoss -= 5 + profile.getPuissancePhysique();
                            System.out.println(Reussite);
                        }
                    }

                    else if (ChoixFocus.equals("2")) {

                        random = rand.nextInt(100);

                        if (random > ReussiteAttaque + 95) {
                            System.out.println(Rate);

                        } else if (random < ReussiteAttaque + 95) {
                            PVBoss2 -= 5 + profile.getPuissancePhysique();
                            System.out.println(Reussite);
                        }
                    }
                }

                else if (ChoixAttaque.equals("3")) {
                    System.out.println("Il ne se passe rien");
                }

                else if (ChoixAttaque.equals("4")) {
                    random = rand.nextInt(100);

                    if (random < ReussiteAttaque + 30) {

                        System.out.println(Rate);

                    } else {
                        System.out.println("");
                        System.out.println("vous récupérez le Portoloin et vous vous enfuir");
                        PVBoss -= 1000000000;
                        PVBoss2 -= 500000000;
                    }
                }

                else if (ChoixAttaque.equals("5")) {

                    random = rand.nextInt(100);

                    if (random > ReussiteAttaque + 100) {
                        System.out.println(Rate);
                    }

                    if (random < ReussiteAttaque + 100) {
                        System.out.println("Votre Patronus est invoqué, mais il s'enfuit en voyant Voldemort");
                    }
                }
            } else if (ChoixCombat.equals("2")) {
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
                    } else if (NombrePotion == 0) {
                        System.out.println("Vous n'avez plus de potions...");
                    }


                }
            } else if (ChoixCombat.equals("3")) {
                System.out.println("");
                System.out.println("Vous choisissez de ne rien faire");

            }

            if (PVBoss > 0) {

                random = rand.nextInt(100);
                random2 = rand.nextInt(100);

                System.out.println("");
                System.out.println("Il reste " + PVBoss + "PV à Voldemort");
                System.out.println("Il reste " + PVBoss2 + "PV à Peter Pettigrow");
                System.out.println("");


                if (random > profile.getEsquive()) {
                    System.out.println("");
                    System.out.println("Voldemort vous attaque et vous perdez 15 PV");
                    PV -= 15;

                    if (PV > 0) {
                        System.out.println("");
                        System.out.println("Il vous reste " + PV + "PV");
                    }
                }

                else if (random < profile.getEsquive()) {

                    System.out.println("");
                    System.out.println("Voldemort rate son attaque");

                    if (PV > 0) {
                        System.out.println("");
                        System.out.println("Il vous reste " + PV + "PV");
                    }
                }

                if (random2 > profile.getEsquive())
                {
                    System.out.println("");
                    System.out.println("Peter Pettigrow vous attaque et vous perdez 10 PV");
                    PV -= 10;

                    if (PV > 0) {
                        System.out.println("");
                        System.out.println("Il vous reste " + PV + "PV");
                    }

                }

                else if (random2 < profile.getEsquive()) {

                    System.out.println("");
                    System.out.println("Peter Pettigrow rate son attaque");

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
            System.out.println("Vous arrivez à vous enfuir !");
            System.out.println("Félicitation vous avez survécu");

        }


    }

}
