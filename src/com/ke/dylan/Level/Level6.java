package com.ke.dylan.Level;
import com.ke.dylan.Player.Profile;
import com.ke.dylan.Player.Sortinghat;

import java.util.Random;
import java.util.Scanner;

public class Level6 {
    private Profile profile;

    public Level6(Profile profile) {
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

        int Blood;
        Blood = 10;

        int BloodActivationLuciusMalefoy;
        BloodActivationLuciusMalefoy = 0;

        int BloodActivationAntoninDolohov;
        BloodActivationAntoninDolohov = 0;

        int BloodActivationFenrirGreyback;
        BloodActivationFenrirGreyback = 0;

        int BloodActivationIgorKarkaroff;
        BloodActivationIgorKarkaroff = 0;

        int BloodActivationBellatrixLestrange;
        BloodActivationBellatrixLestrange = 0;

        String Focus;
        String Focus2;
        String Focus3;
        String Focus4;
        String Focus5;
        String Focus6;
        Focus = "Qui souhaitez-vous attaquer ?";
        Focus2 = "1 Lucius Malefoy";
        Focus3 = "2 Antonin Dolohov";
        Focus4 = "3 Fenrir Greyback";
        Focus5 = "4 Igor Karkaroff";
        Focus6 = "5 Bellatrix Lestrange";

        int PVBossLuciusMalefoy = 100;
        int PVBossAntoninDolohov = 100;
        int PVBossFenrirGreyback = 100;
        int PVBossIgorKarkaroff = 100;
        int PVBossBellatrixLestrange = 100;

        Scanner input = new Scanner(System.in);

        System.out.println("");
        System.out.println("Avec le professeur Rogue, vous apprenez le sort Sectumsempra");

        System.out.println("");
        System.out.println("Souhaitez vous commencer le sixième niveau ?");
        System.out.println("1 Oui");
        System.out.println("2 Non");


        String DebutLevel1 = "2";
        DebutLevel1 = input.next();

        while (DebutLevel1.equals("2")) {

            System.out.println("");
            System.out.println("Bon tu es prêt maintenant ?");
            System.out.println("1 Oui ");
            System.out.println("2 Non ");
            DebutLevel1 = input.next();
        }

        System.out.println("");
        System.out.println("Vous êtes dans la tour d'astronomie, 5 mangemorts ont envahit Poudlard.");
        System.out.println("Lucius Malefoy a " + PVBossLuciusMalefoy + " PV.");
        System.out.println("Antonin Dolohov a " + PVBossAntoninDolohov + " PV.");
        System.out.println("Fenrir Greyback a " + PVBossFenrirGreyback + " PV.");
        System.out.println("Igor Karkaroff a " + PVBossIgorKarkaroff + " PV.");
        System.out.println("Bellatrix Lestrange a " + PVBossBellatrixLestrange + " PV.");

        if (profile.Sortinghat.getSortinghat().equals("Slytherin")) {
            System.out.println("Souhaitez vous vous alliez temporairement avec les mangemorts ?");
            System.out.println("1 Oui");
            System.out.println("2 Non");

            String AllianceChoice = "";
            AllianceChoice = input.next();

            if (AllianceChoice.equals("1")) {

                PVBossLuciusMalefoy = -100;
                PVBossAntoninDolohov = -100;
                PVBossFenrirGreyback = -100;
                PVBossIgorKarkaroff = -100;
                PVBossBellatrixLestrange = -100;

            }
            else if (AllianceChoice.equals("2")) {

                System.out.println("Et bien que le combat commence !");
            }
        }


        while ( (PVBossLuciusMalefoy > 0) || (PVBossAntoninDolohov > 0) || (PVBossFenrirGreyback > 0) ||
                (PVBossIgorKarkaroff > 0) || (PVBossBellatrixLestrange > 0) ) {

            System.out.println("");
            System.out.println("Que souhaitez vous faire ?");
            System.out.println("");

            System.out.println("1 Attaquer");
            System.out.println("2 Ouvrir le sac");
            System.out.println("3 Ne rien faire");

            String ChoixCombat = "";
            ChoixCombat = input.next();


            if (ChoixCombat.equals("1")) {

                System.out.println("");

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

                String ChoixAttaque = "";
                ChoixAttaque = input.next();

                if (ChoixAttaque.equals("1")) {

                    System.out.println("");

                    System.out.println(Focus);

                    if (PVBossLuciusMalefoy > 0) {
                        System.out.println(Focus2);
                    }
                    if (PVBossAntoninDolohov > 0) {
                        System.out.println(Focus3);
                    }
                    if (PVBossFenrirGreyback > 0) {
                        System.out.println(Focus4);
                    }
                    if (PVBossIgorKarkaroff > 0) {
                        System.out.println(Focus5);
                    }
                    if (PVBossBellatrixLestrange > 0) {
                        System.out.println(Focus6);
                    }

                    String ChoixFocus = "";
                    ChoixFocus = input.next();

                    if (ChoixFocus.equals("1")) {
                        random = rand.nextInt(100);


                        if (random > ReussiteAttaque + 100) {
                            System.out.println(Rate);
                        } else if (random < ReussiteAttaque + 100) {
                            PVBossLuciusMalefoy -= 5 + profile.getPuissanceMagique();
                            System.out.println(Reussite);
                            if (PVBossLuciusMalefoy <= 0) {
                                System.out.println("Lucius meurt par votre attaque");
                            }
                        }
                    } else if (ChoixFocus.equals("2")) {
                        random = rand.nextInt(100);


                        if (random > ReussiteAttaque + 100) {
                            System.out.println(Rate);
                        } else if (random < ReussiteAttaque + 100) {
                            PVBossAntoninDolohov -= 5 + profile.getPuissanceMagique();
                            System.out.println(Reussite);
                            if (PVBossAntoninDolohov <= 0) {
                                System.out.println("Antonin meurt par votre attaque");
                            }
                        }
                    } else if (ChoixFocus.equals("3")) {
                        random = rand.nextInt(100);

                        if (random > ReussiteAttaque + 100) {
                            System.out.println(Rate);
                        } else if (random < ReussiteAttaque + 100) {
                            PVBossFenrirGreyback -= 5 + profile.getPuissanceMagique();
                            System.out.println(Reussite);
                            if (PVBossFenrirGreyback <= 0) {
                                System.out.println("Fenrir meurt par votre attaque");
                            }
                        }
                    } else if (ChoixFocus.equals("4")) {
                        random = rand.nextInt(100);

                        if (random > ReussiteAttaque + 100) {
                            System.out.println(Rate);
                        } else if (random < ReussiteAttaque + 100) {
                            PVBossIgorKarkaroff -= 5 + profile.getPuissanceMagique();
                            System.out.println(Reussite);
                            if (PVBossIgorKarkaroff <= 0) {
                                System.out.println("Igor meurt par votre attaque");
                            }
                        }
                    } else if (ChoixFocus.equals("5")) {
                        random = rand.nextInt(100);

                        if (random > ReussiteAttaque + 100) {
                            System.out.println(Rate);
                        } else if (random < ReussiteAttaque + 100) {
                            PVBossBellatrixLestrange -= 5 + profile.getPuissanceMagique();
                            System.out.println(Reussite);
                            if (PVBossBellatrixLestrange <= 0) {
                                System.out.println("Bellatrix meurt par votre attaque");
                            }
                        }
                    }

                } else if (ChoixAttaque.equals("2")) {

                    System.out.println(Focus);

                    if (PVBossLuciusMalefoy > 0) {
                        System.out.println(Focus2);
                    }
                    if (PVBossAntoninDolohov > 0) {
                        System.out.println(Focus3);
                    }
                    if (PVBossFenrirGreyback > 0) {
                        System.out.println(Focus4);
                    }
                    if (PVBossIgorKarkaroff > 0) {
                        System.out.println(Focus5);
                    }
                    if (PVBossBellatrixLestrange > 0) {
                        System.out.println(Focus6);
                    }

                    String ChoixFocus = "";
                    ChoixFocus = input.next();

                    if (ChoixFocus.equals("1")) {
                        random = rand.nextInt(100);

                        if (random > ReussiteAttaque + 95) {
                            System.out.println(Rate);

                        } else if (random < ReussiteAttaque + 95) {
                            PVBossLuciusMalefoy -= 5 + profile.getPuissancePhysique();
                            System.out.println(Reussite);
                            if (PVBossLuciusMalefoy <= 0) {
                                System.out.println("Lucius meurt par votre attaque");
                            }
                        }
                    } else if (ChoixFocus.equals("2")) {
                        random = rand.nextInt(100);

                        if (random > ReussiteAttaque + 95) {
                            System.out.println(Rate);

                        } else if (random < ReussiteAttaque + 95) {
                            PVBossAntoninDolohov -= 5 + profile.getPuissancePhysique();
                            System.out.println(Reussite);
                            if (PVBossAntoninDolohov <= 0) {
                                System.out.println("Antonin meurt par votre attaque");
                            }
                        }
                    } else if (ChoixFocus.equals("3")) {
                        random = rand.nextInt(100);

                        if (random > ReussiteAttaque + 95) {
                            System.out.println(Rate);

                        } else if (random < ReussiteAttaque + 95) {
                            PVBossFenrirGreyback -= 5 + profile.getPuissancePhysique();
                            System.out.println(Reussite);
                            if (PVBossFenrirGreyback <= 0) {
                                System.out.println("Fenrir meurt par votre attaque");
                            }
                        }
                    } else if (ChoixFocus.equals("4")) {
                        random = rand.nextInt(100);

                        if (random > ReussiteAttaque + 95) {
                            System.out.println(Rate);

                        } else if (random < ReussiteAttaque + 95) {
                            PVBossIgorKarkaroff -= 5 + profile.getPuissancePhysique();
                            System.out.println(Reussite);
                            if (PVBossIgorKarkaroff <= 0) {
                                System.out.println("Igor meurt par votre attaque");
                            }
                        }
                    } else if (ChoixFocus.equals("5")) {
                        random = rand.nextInt(100);

                        if (random > ReussiteAttaque + 95) {
                            System.out.println(Rate);

                        } else if (random < ReussiteAttaque + 95) {
                            PVBossBellatrixLestrange -= 5 + profile.getPuissancePhysique();
                            System.out.println(Reussite);
                            if (PVBossBellatrixLestrange <= 0) {
                                System.out.println("Bellatrix meurt par votre attaque");
                            }
                        }
                    }
                } else if (ChoixAttaque.equals("3")) {
                    System.out.println("Il ne se passe rien");
                }

                else if (ChoixAttaque.equals("4")) {
                    random = rand.nextInt(100);

                    if (random > ReussiteAttaque + 30) {

                        System.out.println("");
                        System.out.println(Rate);

                    } else {
                        System.out.println("");
                        System.out.println(Reussite);
                        System.out.println("Mais rien ne se passe");

                    }
                } else if (ChoixAttaque.equals("5")) {
                    random = rand.nextInt(100);

                    if (random < ReussiteAttaque + 30) {

                        System.out.println("");
                        System.out.println(Rate);

                    } else {
                        System.out.println("");
                        System.out.println(Reussite);
                        System.out.println("Votre patronus apparaît mais il ne sert à rien");

                    }
                } else if (ChoixAttaque.equals("6")) {

                    System.out.println(Focus);

                    if (PVBossLuciusMalefoy > 0) {
                        System.out.println(Focus2);
                    }
                    if (PVBossAntoninDolohov > 0) {
                        System.out.println(Focus3);
                    }
                    if (PVBossFenrirGreyback > 0) {
                        System.out.println(Focus4);
                    }
                    if (PVBossIgorKarkaroff > 0) {
                        System.out.println(Focus5);
                    }
                    if (PVBossBellatrixLestrange > 0) {
                        System.out.println(Focus6);
                    }

                    String ChoixFocus = "";
                    ChoixFocus = input.next();

                    if (ChoixFocus.equals("1")) {
                        random = rand.nextInt(100);

                        if (random > ReussiteAttaque + 90) {
                            System.out.println(Rate);

                        } else if (random < ReussiteAttaque + 90) {
                            PVBossLuciusMalefoy -= 50 + profile.getPuissancePhysique();
                            System.out.println(Reussite);
                            if (PVBossLuciusMalefoy <= 0) {
                                System.out.println("Lucius meurt par votre attaque");
                            }

                            if (BloodActivationLuciusMalefoy == 0) {
                                System.out.println("Vous infligez Saignement sur Lucius Malefoy");
                                BloodActivationLuciusMalefoy = 1;
                            }


                        }
                    } else if (ChoixFocus.equals("2")) {
                        random = rand.nextInt(100);

                        if (random > ReussiteAttaque + 90) {
                            System.out.println(Rate);

                        } else if (random < ReussiteAttaque + 90) {
                            PVBossAntoninDolohov -= 50 + profile.getPuissancePhysique();
                            System.out.println(Reussite);
                            if (PVBossAntoninDolohov <= 0) {
                                System.out.println("Antonin meurt par votre attaque");
                            }

                            if (BloodActivationAntoninDolohov == 0) {
                                System.out.println("Vous infligez Saignement sur Antonin Dolohov");
                                BloodActivationAntoninDolohov = 1;
                            }
                        }
                    } else if (ChoixFocus.equals("3")) {
                        random = rand.nextInt(100);

                        if (random > ReussiteAttaque + 90) {
                            System.out.println(Rate);

                        } else if (random < ReussiteAttaque + 90) {
                            PVBossFenrirGreyback -= 50 + profile.getPuissancePhysique();
                            System.out.println(Reussite);
                            if (PVBossFenrirGreyback <= 0) {
                                System.out.println("Fenrir meurt par votre attaque");
                            }

                            if (BloodActivationFenrirGreyback == 0) {
                                System.out.println("Vous infligez Saignement sur Fenrir Greyback");
                                BloodActivationFenrirGreyback = 1;
                            }
                        }
                    } else if (ChoixFocus.equals("4")) {
                        random = rand.nextInt(100);

                        if (random > ReussiteAttaque + 90) {
                            System.out.println(Rate);

                        } else if (random < ReussiteAttaque + 90) {
                            PVBossIgorKarkaroff -= 50 + profile.getPuissancePhysique();
                            System.out.println(Reussite);
                            if (PVBossIgorKarkaroff <= 0) {
                                System.out.println("Igor meurt par votre attaque");
                            }

                            if (BloodActivationIgorKarkaroff == 0) {
                                System.out.println("Vous infligez Saignement sur Igor Karkaroff");
                                BloodActivationIgorKarkaroff = 1;
                            }
                        }
                    } else if (ChoixFocus.equals("5")) {
                        random = rand.nextInt(100);

                        if (random > ReussiteAttaque + 90) {
                            System.out.println(Rate);

                        } else if (random < ReussiteAttaque + 90) {
                            PVBossBellatrixLestrange -= 50 + profile.getPuissancePhysique();
                            System.out.println(Reussite);
                            if (PVBossBellatrixLestrange <= 0) {
                                System.out.println("Bellatrix meurt par votre attaque");
                            }

                            if (BloodActivationBellatrixLestrange == 0) {
                                System.out.println("Vous infligez Saignement sur Bellatrix Lestrange");
                                BloodActivationBellatrixLestrange = 1;
                            }
                        }
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
                    }

                    if (NombrePotion == 0) {
                        System.out.println("Vous n'avez plus de potions...");
                    }
                }
            } else if (ChoixCombat.equals("3")) {
                System.out.println("");
                System.out.println("Vous choisissez de ne rien faire");

            }


            if (PVBossLuciusMalefoy > 0) {

                if (BloodActivationLuciusMalefoy == 1) {
                    PVBossLuciusMalefoy -= Blood;
                    System.out.println("Lucius saigne et perd 10PV");
                }

                if (PVBossLuciusMalefoy <= 0) {
                    System.out.println("Lucius meurt de son saignement");
                }

                else if (PVBossLuciusMalefoy > 0) {

                    System.out.println("Il reste " + PVBossLuciusMalefoy + "PV à Lucius Malefoy");

                    random = rand.nextInt(100);

                    if (random > profile.getEsquive()) {

                        System.out.println("Lucius vous attaque et vous perdez 5 PV");
                        PV -= 5;

                        if (PV > 0) {

                            System.out.println("Il vous reste " + PV + "PV");
                            System.out.println("");
                        }
                    }

                    if (random < profile.getEsquive()) {

                        System.out.println("");
                        System.out.println("Lucius Malefoy rate son attaque");

                        if (PV > 0) {
                            System.out.println("Il vous reste " + PV + "PV");
                            System.out.println("");
                        }
                    }
                }
            }

            if (PV <= 0) {
                System.out.println("");
                System.out.println("Vous n'avez plus de points de vie");
                System.out.println("Dommage, vous avez perdu...");
                System.exit(0);
            }

            System.out.println("");

            if (PVBossAntoninDolohov > 0) {

                if (BloodActivationAntoninDolohov == 1) {
                    PVBossAntoninDolohov -= Blood;
                    System.out.println("Antonin saigne et perd 10PV");
                }

                if (PVBossAntoninDolohov <= 0) {
                    System.out.println("Antonin meurt de son saignement");
                }

                if (PVBossAntoninDolohov > 0) {
                    System.out.println("Il reste " + PVBossAntoninDolohov + "PV à Antonin Dolohov");

                    random = rand.nextInt(100);

                    if (random > profile.getEsquive()) {
                        System.out.println("");
                        System.out.println("Antonin vous attaque et vous perdez 5 PV");
                        PV -= 5;

                        if (PV > 0) {
                            System.out.println("Il vous reste " + PV + "PV");
                            System.out.println("");
                        }
                    }

                    if (random < profile.getEsquive()) {

                        System.out.println("");
                        System.out.println("Antonin rate son attaque");

                        if (PV > 0) {
                            System.out.println("Il vous reste " + PV + "PV");
                            System.out.println("");
                        }
                    }
                }
            }

            if (PV <= 0) {
                System.out.println("");
                System.out.println("Vous n'avez plus de points de vie");
                System.out.println("Dommage, vous avez perdu...");
                System.exit(0);
            }

            System.out.println("");

            if (PVBossFenrirGreyback > 0) {

                if (BloodActivationFenrirGreyback == 1) {
                    PVBossFenrirGreyback -= Blood;
                    System.out.println("Fenrir saigne et perd 10PV");
                }

                if (PVBossFenrirGreyback <= 0) {
                    System.out.println("Fenrir meurt de son saignement");
                }

                if (PVBossFenrirGreyback > 0) {
                    System.out.println("Il reste " + PVBossFenrirGreyback + "PV à Fenrir Greyback");

                    random = rand.nextInt(100);

                    if (random > profile.getEsquive()) {
                        System.out.println("");
                        System.out.println("Fenrir vous attaque et vous perdez 5 PV");
                        PV -= 5;

                        if (PV > 0) {
                            System.out.println("Il vous reste " + PV + "PV");
                            System.out.println("");
                        }
                    }

                    if (random < profile.getEsquive()) {

                        System.out.println("Fenrir rate son attaque");

                        if (PV > 0) {
                            System.out.println("Il vous reste " + PV + "PV");
                            System.out.println("");
                        }
                    }
                }
            }

            if (PV <= 0) {
                System.out.println("");
                System.out.println("Vous n'avez plus de points de vie");
                System.out.println("Dommage, vous avez perdu...");
                System.exit(0);
            }

            System.out.println("");


            if (PVBossIgorKarkaroff > 0) {


                if (BloodActivationIgorKarkaroff == 1) {
                    PVBossIgorKarkaroff -= Blood;
                    System.out.println("Igor saigne et perd 10PV");
                }

                if (PVBossIgorKarkaroff <= 0) {
                    System.out.println("Igor meurt de son saignement");
                }

                if (PVBossIgorKarkaroff > 0) {

                    System.out.println("Il reste " + PVBossIgorKarkaroff + "PV à Igor Karkaroff");

                    random = rand.nextInt(100);

                    if (random > profile.getEsquive()) {
                        System.out.println("");
                        System.out.println("Igor vous attaque et vous perdez 5 PV");
                        PV -= 5;

                        if (PV > 0) {
                            System.out.println("Il vous reste " + PV + "PV");
                            System.out.println("");
                        }
                    }

                    if (random < profile.getEsquive()) {

                        System.out.println("");
                        System.out.println("Igor rate son attaque");

                        if (PV > 0) {
                            System.out.println("Il vous reste " + PV + "PV");
                            System.out.println("");
                        }
                    }
                }
            }

            if (PV <= 0) {
                System.out.println("");
                System.out.println("Vous n'avez plus de points de vie");
                System.out.println("Dommage, vous avez perdu...");
                System.exit(0);
            }

            System.out.println("");

            if (PVBossBellatrixLestrange > 0) {


            if (BloodActivationBellatrixLestrange == 1) {
                PVBossBellatrixLestrange -= Blood;
                System.out.println("Bellatrix saigne et perd 10PV");
            }

                if (PVBossBellatrixLestrange <= 0) {
                    System.out.println("Bellatrix meurt de son saignement");
                }

            if (PVBossBellatrixLestrange > 0) {

                System.out.println("Il reste " + PVBossBellatrixLestrange + "PV à Bellatrix Lestrange");

                random = rand.nextInt(100);

                if (random > profile.getEsquive()) {
                    System.out.println("");
                    System.out.println("Bellatrix vous attaque et vous perdez 5 PV");
                    PV -= 5;

                    if (PV > 0) {
                        System.out.println("Il vous reste " + PV + "PV");
                        System.out.println("");
                    }
                }

                if (random < profile.getEsquive()) {

                    System.out.println("");
                    System.out.println("Bellatrix rate son attaque");

                    if (PV > 0) {
                        System.out.println("Il vous reste " + PV + "PV");
                        System.out.println("");
                    }
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

        if ((PVBossLuciusMalefoy <= 0) || (PVBossAntoninDolohov <= 0) || (PVBossFenrirGreyback <= 0) ||
                (PVBossIgorKarkaroff <= 0) || (PVBossBellatrixLestrange <= 0)) {
            System.out.println("");
            System.out.println("Félicitation vous avez terminé le niveau !");

        }


    }
}
