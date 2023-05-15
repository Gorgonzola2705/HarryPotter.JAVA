package com.ke.dylan.Level;
import com.ke.dylan.Player.Profile;

import java.util.Random;
import java.util.Scanner;

public class Level7 {
    private Profile profile;

    public Level7(Profile profile) {
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
        Focus3 = "2 Bellatrix Lestrange";


        String Reussite;
        Reussite = "Vous réussissez votre attaque";
        String Rate;
        Rate = "Vous ratez votre attaque";

        int Expelliarmus1;
        Expelliarmus1 = 0;

        int Expelliarmus2;
        Expelliarmus2 = 0;

        int Useless1;
        Useless1 = 0;

        int Useless2;
        Useless2 = 0;

        int NombrePotion;
        NombrePotion = 5;
        int Potion;
        Potion = 30;

        int Blood;
        Blood = 10;

        int BloodActivation1;
        BloodActivation1 = 0;

        int BloodActivation2;
        BloodActivation2 = 0;

        int PVBoss = 700;
        int PVBoss2 = 500;

        System.out.println("Vous apprenez Expelliarmus.");

        System.out.println("Souhaitez vous commencer le dernier niveau ?");
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
        System.out.println("Vous êtes face à face avec Voldemort et Bellatrix Lestrange pour un combat au sommet à Poudlard. ");
        System.out.println("Voldemort a " + PVBoss + " PV.");
        System.out.println("Bellatrix Lestrange a " + PVBoss2 + " PV.");

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

                System.out.println("");

                System.out.println("6 Sectumsempra");
                System.out.println("Dégât magique : 50, inflige Saignement (-10PV par tour jusqu'à la fin du combat)");
                System.out.println("90% de précision");

                System.out.println("");

                System.out.println("7 Expelliarmus ");
                System.out.println("Ne marche que si Voldemort ou Bellatrix lancent Avada Kedavra (ils ne pourront plus lancer de sort après avoir été désarmés)");
                System.out.println("L'attaque ne rate jamais");


                String ChoixAttaque = "";
                ChoixAttaque = input.next();


                if (ChoixAttaque.equals("1")) {

                    System.out.println(Focus);

                    if (PVBoss > 0) {
                        System.out.println(Focus2);
                    }
                    if (PVBoss2 > 0) {
                        System.out.println(Focus3);
                    }

                    String ChoixFocus = "";
                    ChoixFocus = input.next();

                    if (ChoixFocus.equals("1")) {
                        random = rand.nextInt(100);

                        if (random > ReussiteAttaque + 100) {
                            System.out.println(Rate);
                        } else if (random < ReussiteAttaque + 100) {
                            PVBoss -= 5 + profile.getPuissanceMagique();
                            System.out.println(Reussite);
                            if (PVBoss <= 0) {
                                System.out.println("Voldemort meurt par votre attaque");
                            }
                        }
                    } else if (ChoixFocus.equals("2")) {
                        random = rand.nextInt(100);

                        if (random > ReussiteAttaque + 100) {
                            System.out.println(Rate);
                        } else if (random < ReussiteAttaque + 100) {
                            PVBoss2 -= 5 + profile.getPuissanceMagique();
                            System.out.println(Reussite);
                            if (PVBoss2 <= 0) {
                                System.out.println("Bellatrix meurt par votre attaque");
                            }
                        }
                    }
                } else if (ChoixAttaque.equals("2")) {

                    System.out.println(Focus);

                    if (PVBoss > 0) {
                        System.out.println(Focus2);
                    }
                    if (PVBoss2 > 0) {
                        System.out.println(Focus3);
                    }
                    String ChoixFocus = "";
                    ChoixFocus = input.next();

                    if (ChoixFocus.equals("1")) {
                        random = rand.nextInt(100);

                        if (random > ReussiteAttaque + 95) {
                            System.out.println(Rate);

                        } else if (random < ReussiteAttaque + 95) {
                            PVBoss -= 5 + profile.getPuissancePhysique();
                            System.out.println(Reussite);
                            if (PVBoss <= 0) {
                                System.out.println("Voldemort meurt par votre attaque");
                            }
                        }
                    } else if (ChoixFocus.equals("2")) {

                        random = rand.nextInt(100);

                        if (random > ReussiteAttaque + 95) {
                            System.out.println(Rate);

                        } else if (random < ReussiteAttaque + 95) {
                            PVBoss2 -= 5 + profile.getPuissancePhysique();
                            System.out.println(Reussite);
                            if (PVBoss2 <= 0) {
                                System.out.println("Bellatrix meurt par votre attaque");
                            }
                        }
                    }
                } else if (ChoixAttaque.equals("3")) {
                    System.out.println("Il ne se passe rien");

                } else if (ChoixAttaque.equals("4")) {
                    random = rand.nextInt(100);

                    if (random > ReussiteAttaque + 30) {

                        System.out.println(Rate);

                    } else {
                        System.out.println("");
                        System.out.println("Vous ne récupérez rien");

                    }
                } else if (ChoixAttaque.equals("5")) {

                    random = rand.nextInt(100);

                    if (random > ReussiteAttaque + 100) {
                        System.out.println(Rate);
                    }

                    if (random < ReussiteAttaque + 100) {
                        System.out.println("Votre Patronus est invoqué, mais il s'enfuit en voyant Voldemort");
                    }
                }

                else if (ChoixAttaque.equals("6")) {

                    System.out.println(Focus);

                    if (PVBoss > 0) {
                        System.out.println(Focus2);
                    }
                    if (PVBoss2 > 0) {
                        System.out.println(Focus3);
                    }

                    String ChoixFocus = "";
                    ChoixFocus = input.next();

                    if (ChoixFocus.equals("1")) {
                        random = rand.nextInt(100);

                        if (random > ReussiteAttaque + 90) {
                            System.out.println(Rate);

                        } else if (random < ReussiteAttaque + 90) {
                            PVBoss -= 50 + profile.getPuissancePhysique();
                            System.out.println(Reussite);
                            if (PVBoss <= 0) {
                                System.out.println("Voldemort meurt par votre attaque");
                            }

                            if (BloodActivation1 == 0) {
                                System.out.println("Vous infligez Saignement sur Voldemort");
                                BloodActivation1 = 1;
                            }


                        }
                    } else if (ChoixFocus.equals("2")) {
                        random = rand.nextInt(100);

                        if (random > ReussiteAttaque + 90) {
                            System.out.println(Rate);

                        } else if (random < ReussiteAttaque + 90) {
                            PVBoss2 -= 50 + profile.getPuissancePhysique();
                            System.out.println(Reussite);
                            if (PVBoss2 <= 0) {
                                System.out.println("Bellatrix meurt par votre attaque");
                            }

                            if (BloodActivation2 == 0) {
                                System.out.println("Vous infligez Saignement sur Bellatrix Lestrange");
                                BloodActivation2 = 1;
                            }
                        }
                    }

                }

                else if (ChoixAttaque.equals("7")) {

                    if (PVBoss > 0) {
                        System.out.println(Focus2);
                    }
                    if (PVBoss2 > 0) {
                        System.out.println(Focus3);
                    }

                    String ChoixFocus = "";
                    ChoixFocus = input.next();

                    if (ChoixFocus.equals("1")) {

                        System.out.println("Vous préparez un expelliarmus sur Voldemort");
                        Expelliarmus1 = 1;
                    }

                    if (ChoixFocus.equals("2")) {

                        System.out.println("Vous préparez un expelliarmus sur Bellatrix Lestrange");
                        Expelliarmus2 = 1;
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


                if (BloodActivation1 == 1) {
                    PVBoss -= Blood;
                    System.out.println("Voldemort saigne et perd 10PV");
                }

                if (PVBoss <= 0) {
                    System.out.println("Voldemort meurt de son saignement");

                }

                if (PVBoss > 0) {

                    System.out.println("Il reste " + PVBoss + "PV à Voldemort");

                    random = rand.nextInt(2);
                    random2 = rand.nextInt(100);



                        if (random == 0) {

                            if (Useless1 == 0) {

                                if (random2 > 60 + profile.getEsquive()) {

                                    System.out.println("Voldemort utilise Avada Kedavra");

                                    if (Expelliarmus1 == 0) {
                                        PV = -100;
                                    }
                                    if (Expelliarmus1 == 1) {
                                        System.out.println("Vous contrez le Avada Kedavra de Voldemort et il ne pourra plus utiliser de sorts !");
                                        Useless1 = 1;
                                    }
                                }
                            }

                            if (Useless1 == 0) {
                                System.out.println("Voldemort vous regarde");
                            }

                        }

                    if (random == 1) {
                        if (random2 < profile.getEsquive()) {

                            System.out.println("");
                            System.out.println("Voldemort rate son attaque");
                        } else if (random2 > profile.getEsquive()) {

                            System.out.println("");
                            System.out.println("Voldemort fait un Moonwalk pour essayer de vous intimider");

                        }
                    }
                }
            }


            if (PVBoss2 > 0) {


                if (BloodActivation2 == 1) {
                    PVBoss2 -= Blood;
                    System.out.println("Bellatrix saigne et perd 10PV");
                }

                if (PVBoss2 <= 0) {
                    System.out.println("Bellatrix meurt de son saignement");

                }
                if (PVBoss2 > 0) {

                    System.out.println("Il reste " + PVBoss2 + "PV à Bellatrix");

                    random = rand.nextInt(2);
                    random2 = rand.nextInt(100);

                    if (Useless1 == 0) {

                        if (random == 0) {

                            if (random2 > 60 + profile.getEsquive()) {

                                System.out.println("Bellatrix utilise Avada Kedavra");

                                if (Expelliarmus2 == 0) {
                                    PV = -100;
                                }

                                if (Expelliarmus2 == 1) {
                                    System.out.println("Vous contrez le Avada Kedavra de Bellatrix et elle ne pourra plus utiliser de sorts !");
                                    Useless2 = 1;
                                }
                            }
                        }
                    }

                        if (Useless2 == 0) {
                            System.out.println("Bellatrix vous regarde");
                        }

                    if (random2 < profile.getEsquive()) {

                        System.out.println("");
                        System.out.println("Bellatrix rate son attaque");
                    } else if (random2 > profile.getEsquive()) {

                        System.out.println("");
                        System.out.println("Bellatrix fait un Moonwalk pour essayer de vous intimider");

                    }

                }
            }


            if (PV <= 0) {
                System.out.println("");
                System.out.println("Vous n'avez plus de points de vie");
                System.out.println("Dommage, vous avez perdu...");
                System.exit(0);
            }

            Expelliarmus1 = 0;
            Expelliarmus2 = 0;
        }


        if (PVBoss <= 0 && PVBoss2 <= 0)   {
            System.out.println("");
            System.out.println("Félicitation vous avez terminé le jeu !!!!");

        }


}

}
