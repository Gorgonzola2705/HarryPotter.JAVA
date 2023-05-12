
package com.ke.dylan;
import com.ke.dylan.Level.*;
import com.ke.dylan.Player.Profile;
import com.ke.dylan.Player.Sortinghat;
import com.ke.dylan.Player.WizardCreation;


public class Main {

    public static void main(String[] args) {

        Profile profile = new Profile();
        WizardCreation wizard = new WizardCreation(profile);
        wizard.start();


        Level1 Level1 = new Level1(profile);
        Level1.start();

        Level2 Level2 = new Level2(profile);
        Level2.start();

        Level3 Level3 = new Level3(profile);
        Level3.start();

        Level4 Level4 = new Level4(profile);
        Level4.start();

        Level5 Level5 = new Level5(profile);
        Level5.start();

        Level6 Level6 = new Level6(profile);
        Level6.start();

        Level7 Level7 = new Level7(profile);
        Level7.start();

    }

}



