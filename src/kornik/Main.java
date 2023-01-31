package kornik;

import kornik.devices.*;
import kornik.creatures.Pet;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws Exception {

        Human kornik = new Human("kornik","Kornik",2002,10900,20000);
        Human kamil = new Human("Kamil","Kamil",1999,12013,12310);
        kornik.phone = new Phone("galaxy","samsung",1999,12);
        kamil.phone = new Phone("xiaomi","xiaomi",1231,111);

        Application note = new Application("notatka",1,0);
        kornik.phone.installApp(new Application("facebook",1,12),kornik);
        kornik.phone.installApp(new Application("amazon",1,0),kornik);
        kornik.phone.installApp(new Application("google",1,0),kornik);
        kornik.phone.installApp(note,kornik);

        kornik.phone.getAppList();
        kornik.phone.checkIfYouHaveApp(note);
        kamil.phone.checkIfYouHaveApp(note);
        kornik.phone.checkIfYouHaveApp("amazon");
        kamil.phone.checkIfYouHaveApp("notatka");
        kornik.phone.showFreeApps();
        kornik.phone.appsPrice();
        kornik.phone.sortAppsByName();
        kornik.phone.sortAppsByPrice();








    }

}