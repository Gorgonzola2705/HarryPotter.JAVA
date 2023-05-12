package com.ke.dylan.Level;
import com.ke.dylan.Player.Profile;
import com.ke.dylan.Player.Sortinghat;
import java.util.Random;
import java.util.Scanner;

public class Level2 {
    private Profile profile;

    public Level2(Profile profile) {
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

        int PVBoss = 1000;

        String EpeeGryffondor;
        EpeeGryffondor = "0";

        System.out.println("");
        System.out.println("Lors de vos cours, vous avez appris le sort Accio.");
        System.out.println("");


        System.out.println("Souhaitez vous commencer le second niveau ?");
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

        System.out.println("Bienvenue dans la chambre des secret, le Basilic se tient devant vous");
        System.out.println("Le Basilic a " + PVBoss + " PV.");

        while (PVBoss > 0) {


            System.out.println("Que souhaitez vous faire ?");
            System.out.println("");

            System.out.println("1 Attaquer");
            System.out.println("2 Ouvrir le sac");
            System.out.println("3 Ne rien faire");

            if (profile.Sortinghat.getSortinghat().equals("Gryffindor") || EpeeGryffondor.equals("1") )
            {
                System.out.println("4 Utiliser l'épée de Griffondor");
            }



            String ChoixCombat = "";
            ChoixCombat = input.next();

            if (ChoixCombat.equals("1")) {
                System.out.println("1 Wingardium Leviosa ");
                System.out.println("Dégât magique : 5 (+10 en présence d'objet)");
                System.out.println("100% de précision");

                System.out.println("");

                System.out.println("2 Coup de poing");
                System.out.println("Se base sur votre puissance Physique (" + profile.getPuissancePhysique() +")");
                System.out.println("95% de précision");

                System.out.println("");

                System.out.println("3 MA LUBULUL");

                System.out.println("");


                if ( (profile.Sortinghat.getSortinghat() == "Slytherin")
                        || (profile.Sortinghat.getSortinghat() == "Ravenclaw")
                        || (profile.Sortinghat.getSortinghat() == "Hufflepuf") )
                {

                    System.out.println("4 Accio");
                    System.out.println("Dégât magique : 0, attire un objet aux alentours");
                    System.out.println("30% de précision");
                }

                String ChoixAttaque = "";
                ChoixAttaque = input.next();

                if (ChoixAttaque.equals("1")) {
                    random = rand.nextInt(100);

                    if (random > ReussiteAttaque + 100) {
                        System.out.println("");
                        System.out.println(Rate);
                    }

                    if (random < ReussiteAttaque + 100) {
                        System.out.println("");
                        PVBoss -= 5 + profile.getPuissanceMagique();
                        System.out.println(Reussite);
                    }

                }


                else if (ChoixAttaque.equals("2")) {
                    random = rand.nextInt(100);

                    if (random > ReussiteAttaque + 95) {
                        System.out.println("");
                        System.out.println(Rate);
                    }

                    if (random < ReussiteAttaque + 95) {
                        System.out.println("");
                        PVBoss -= profile.getPuissancePhysique();
                        System.out.println(Reussite);
                    }
                }


                else if (ChoixAttaque.equals("3")) {
                    System.out.println("");
                    System.out.println("Il ne se passe rien");
                }


                else if (ChoixAttaque.equals("4")) {
                    random = rand.nextInt(100);

                    if (random < ReussiteAttaque + 30) {

                        if (profile.Sortinghat.getSortinghat().equals("Gryffindor")) {

                            System.out.println("Rien ne se passe");

                        } else {
                            System.out.println("");
                            System.out.println("vous récupérez l'épée de Gryffondor ");
                            EpeeGryffondor = "1";
                        }
                    }

                    else if (random > ReussiteAttaque + 30) {
                        System.out.println("");
                        System.out.println(Rate);
                    }

                }

                if (PVBoss > 0) {
                    System.out.println("");
                    System.out.println("Il reste " + PVBoss + "PV au Boss");
                    System.out.println("");
                }

            }


            else if (ChoixCombat.equals("2")) {
                System.out.println("1 Potion de soin (restaure 30PV");
                System.out.println("Il vous en reste " + NombrePotion);

                String ChoixPotion = "";
                ChoixPotion = input.next();

                if (ChoixPotion.equals("1")) {

                    if (NombrePotion > 0) {
                        NombrePotion -= 1;
                        PV += Potion + profile.getBuffPotionHufflepuff();

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


            else if (ChoixCombat.equals("4")) {
                System.out.println("");
                PVBoss = -100;
                System.out.println("L'épée de Gryffondor one shot le Basilic");
            }

            if (PVBoss > 0) {
                random = rand.nextInt(100);

                if (random > profile.getEsquive()) {
                    System.out.println("");
                    System.out.println("Le Basilic vous attaque et vous perdez 30 PV");
                    PV -= 30;

                    if (PV > 0) {
                        System.out.println("");
                        System.out.println("Il vous reste " + PV + "PV");
                    }
                }

                if (random < profile.getEsquive()) {

                    System.out.println("");
                    System.out.println("Le Basilic rate son attaque");

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
            System.out.println("Félicitation vous avez vaincu le Basilic !");
        }

    }
}


