package com.ke.dylan.Player;

import java.util.Random;

public class Profile {

    private int PVmax;

    public int getPVmax() {
        return PVmax;
    }

    public void setPVmax(int PVmax) {
        this.PVmax = PVmax;
    }


    private int PuissancePhysique;

    public int getPuissancePhysique() {
        return PuissancePhysique;
    }

    public void setPuissancePhysique(int PuissancePhysique) {
        this.PuissancePhysique = PuissancePhysique;
    }


    private int PuissanceMagique;

    public int getPuissanceMagique() {return PuissanceMagique;
    }

    public void setPuissanceMagique(int PuissanceMagique) {
        this.PuissanceMagique = PuissanceMagique;
    }


    private int Esquive;

    public int getEsquive() {return Esquive;}

    public void setEsquive(int Esquive) { this.Esquive = Esquive;}

    private int Precision;

    public int getPrecision() {return Precision;}

    public void setPrecision(int Precision) { this.Precision = Precision;}

    public Pet pet;

    public Wand wand;

    public Sortinghat Sortinghat;


    private int BuffPotionHufflepuff;

    public int getBuffPotionHufflepuff() {
        return BuffPotionHufflepuff;
    }

    public void setBuffPotionHufflepuff(int BuffPotionHufflepuff) {
        this.BuffPotionHufflepuff = BuffPotionHufflepuff;
    }



    public void start() {

        PVmax = 100;
        PuissancePhysique = 10;
        PuissanceMagique = 20;
        Esquive = 15;

        String Wand = wand.getWand();

        String House = Sortinghat.getSortinghat();

        if (Wand.equals("FortusBrutus")) {

            PuissanceMagique += 10;
            Precision -=15;
        }

        else if (Wand.equals("MBappe")) {

            Esquive += 20;
            Precision -= 10;
        }

        else if (Wand.equals("UnMAXdePV")) {

            PuissanceMagique -= 10;
            PVmax += 200;
            Precision -= 30;
        }

        else if (Wand.equals("ErenPeteur")) {

            Precision += 5;
            PVmax += 20;
            PuissancePhysique += 5;
            Esquive += 5;
        }
        else if (Wand.equals("Rien")) {

            PuissancePhysique += 40;
            PuissanceMagique = -1000;
        }
        else if (Wand.equals("Smash")) {

            PuissancePhysique += 1;
            PuissanceMagique += 10;
            Precision += 5;
        }
        else if (Wand.equals("CentPourcent")) {

            PuissanceMagique -= 5;
            Precision = 100;
        }

        else if (Wand.equals("MBaclé")) {

            PVmax -= 50;
            Precision = -1000;

        }
        else if (Wand.equals("Hazard")) {
            Random rand = new Random();
            PVmax = rand.nextInt(200);
            PuissancePhysique = rand.nextInt(25);
            PuissanceMagique = rand.nextInt(25);
            Esquive = rand.nextInt(20);
            Precision = rand.nextInt(100);
        }


        if (House.equals("Gryffindor"))
        {
            PVmax += 50;
        }

        else if (House.equals("Slytherin"))
        {
            PuissanceMagique += 10;
        }

        else if (House.equals("Ravenclaw"))
        {
            Precision += 10;
        }

        else if (House.equals("Hufflepuf"))
        {
            BuffPotionHufflepuff = 10;
        }

        System.out.println(House);

        this.Sortinghat = Sortinghat;
        this.PuissancePhysique = PuissancePhysique;
        this.PVmax = PVmax;
        this.PuissanceMagique = PuissanceMagique;
        this.Esquive = Esquive;
        this.Precision = Precision;
        this.BuffPotionHufflepuff = BuffPotionHufflepuff;

    }
}
