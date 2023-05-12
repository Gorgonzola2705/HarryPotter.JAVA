package com.ke.dylan.Player;
import java.util.Random;
import java.util.Scanner;


public class Wand {

    private String Wand;

    public String getWand() {
        return Wand;
    }

    public void setWand(String wand) {
        this.Wand = wand;
    }


    public Wand() {

        Scanner input = new Scanner(System.in);
        System.out.println("Vous arrivez dans le magasin de baguette magique. ");
        System.out.println("Bonjour jeune sorcier, je suis Ollivander, tu vas aujourd'hui trouver la baguette qui te convient le mieux ! ");
        System.out.println("Fais une action, celle que tu veux.");
        System.out.println(" ");

        System.out.println("1 Poing en l'air");
        System.out.println("2 Sauter");
        System.out.println("3 S'endormir ");
        System.out.println("4 Péter ");
        System.out.println("5 Ne rien faire ");
        System.out.println("6 Taper le vide ");
        System.out.println("7 réfléchir ");
        System.out.println("8 Insulter Ollivander ");
        System.out.println("9 Regarder autour de vous ");

        String Wand = "";
        Wand = input.next();

        if (Wand.equals("1")) {
            System.out.println("Une baguette magique arrive devant vous,");
            System.out.println("Il s'agit de FortusBrutus, Une baguette faite avec des poils de loup garou et le nez de Voldemort");
            System.out.println("Elle vous donnera +10 en puissance magique, mais sa texture est tellement horrible que vous perdez -15% de précision sur toutes vos attaques");
            Wand = "FortusBrutus";

            int FortusBrutusPuiMag = 10;
            int FortusBrutusPrecision = -15;

        }

        else if (Wand.equals("2")) {
            System.out.println("Une baguette magique fonce sur vous,");
            System.out.println("Il s'agit de MBappe, Une baguette faite en coquille de tortue et de pied de licorne.");
            System.out.println("Elle vous donnera +20 d'esquive, mais vous devenez si rapide que vous perdez -10 de précision sur toutes vos attaques");
            Wand = "MBappe";

        }


        else if (Wand.equals("3")) {

            System.out.println("Une baguette roule lentement jusqu'à vous");
            System.out.println("Il s'agit UnMAXdePV, une baguette faite en peau de Ronflex et en plume de chouette");
            System.out.println("Elle vous donnera +200 PV, mais vous perdez -10 en puissance magique et -30 en précision");
            Wand = "UnMAXdePV";

        }

        else if (Wand.equals("4")) {
            System.out.println("Une baguette se rapproche de vous avec des bruits et une odeur horrible");
            System.out.println("Il s'agit de ErenPeteur, Une baguette faite en peau de titan infusé dans les pets d'Eren Yeager. Son odeur vous détend");
            System.out.println("Elle vous donnera +5 de force, +5 esquive + 5 précision sur toutes vos attaques + 20 pv");
            Wand = "ErenPeteur";
        }

        else if (Wand.equals("5")) {
            System.out.println("Aucune baguette se rapproche de vous.");
            System.out.println("Néanmoins vous sentez qu'une puissance vous envahi, +40 en puissance physique, mais vous perdez toute votre puissance magique");
            Wand = "Rien";
        }

        else if (Wand.equals("6")) {
            System.out.println("Une baguette s'envole vers vous");
            System.out.println("Il s'agit de Smash, une baguette faite en plume de hiboux et en corne de licorne.");
            System.out.println("Elle vous donnera +10 de puissance magique, +1 en puissance physique + 5 en précision");
            Wand = "Smash";

        }

        else if (Wand.equals("7")) {
            System.out.println("Une baguette arrive mais elle semble méfiante");
            System.out.println("Il s'agit de 100%, avec elle vous ne raterez jamais une seule attaque, vous perdez par contre -5 puissance magique");
            Wand = "CentPourcent";

        }

        else if (Wand.equals("8")) {
            System.out.println("Ollivander s'énerve et vous donne la baguette maudite");
            System.out.println("Il s'agit de MBaclé le jumeau maléfique de Mbappé,");
            System.out.println("Vos attaques ne toucheront plus jamais vos ennemis, et vous perdez -50PV.");
            Wand = "MBaclé";

        }

        else if (Wand.equals("9")) {
            System.out.println("Une baguette invisible s'approche de vous");
            System.out.println("Il s'agit de ???");
            System.out.println("Personne ne connait ses stats (change à chaque partie)");
            Wand = "Hazard";
            Random rand = new Random();
            int HazardPV = rand.nextInt(200);
            int HazardPuiPhy = rand.nextInt(25);
            int HazardPuiMag = rand.nextInt(25);
            int HazardPrecision = rand.nextInt(100);
            int HazardEsquive = rand.nextInt(20);

        }

        this.Wand = Wand;

    }
}
