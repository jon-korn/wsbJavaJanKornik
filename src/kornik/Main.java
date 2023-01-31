package kornik;

import kornik.devices.*;
import kornik.creatures.Pet;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws Exception {



        Human kornik = new Human("Justyun","Bambo",123,2331,12333,8);
        Human blaszak = new Human("kamil", "blasza",112,2222,222222,3);
        LPGCar automobil = new LPGCar("kysz","adsada",1999, 20);
        LPGCar automobil2 = new LPGCar("asiema","adsada",2002, 20);
        LPGCar automobil3 = new LPGCar("szybka","adsada",2006, 20);
        LPGCar automobil4 = new LPGCar("asieaddma","adsada",1902, 20);
        LPGCar automobil5 = new LPGCar("asiddsssssssema","adsada",2, 20);
        kornik.setCar(automobil,0);
        kornik.setCar(automobil2,1);
        kornik.setCar(automobil3,2);
        kornik.setCar(automobil4,3);
        kornik.setCar(automobil5,4);

        kornik.getCar(1).sell(kornik,blaszak,230);

        kornik.carsValue();
        System.out.println(kornik);
         kornik.sortYourGarage();
        System.out.println(kornik);

        blaszak.getCar(1).checkOwner(kornik);

        blaszak.getCar(1).ifSoldAToB(kornik,blaszak);
        blaszak.getCar(1).howManyTransactions();
        blaszak.getCar(1).getOwner();









    }

}