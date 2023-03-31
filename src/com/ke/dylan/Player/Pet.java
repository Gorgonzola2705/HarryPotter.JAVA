package com.ke.dylan.Player;
import java.util.Scanner;

public class Pet {
    private String name;
    private String Pet;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPet() {
        return Pet;
    }

    public void setPet(String pet) {
        this.Pet = pet;
    }

    public Pet() {
        System.out.println("Vous arrivez dans la boutique d'animaux.");
        System.out.println(" ");
        System.out.println("Bonjour jeune sorcier tu vas pouvoir choisir ton animal de compagnie. ");
        System.out.println("1 Hibou ");
        System.out.println("2 Rat ");
        System.out.println("3 Phoenix ");
        System.out.println("4 Licorne");

        Scanner input = new Scanner(System.in);
        String Pet = "";
        Pet = input.next();

        String PetName = "";


        if (Pet.equals("1")) {
            System.out.println("Une obtenez un hibou, comment souhaitez vous l'appeler ?");
            Pet = "Hibou";
            PetName = input.next();
            System.out.println(PetName);
        }

        if (Pet.equals("2")) {
            System.out.println("Une obtenez un Rat, comment souhaitez vous l'appeler ?");
            Pet = "Rat";
            PetName = input.next();
            System.out.println(PetName);
        }

        if (Pet.equals("3")) {
            System.out.println("Une obtenez un Phoenix, comment souhaitez vous l'appeler ?");
            Pet = "Phoenix";
            PetName = input.next();
            System.out.println(PetName);
        }

        if (Pet.equals("4")) {
            System.out.println("Une obtenez un Licorne, comment souhaitez vous l'appeler ?");
            Pet = "Licorne";
            PetName = input.next();
            System.out.println(PetName);
        }

        this.Pet = Pet;
        this.name = PetName;


    }
}
