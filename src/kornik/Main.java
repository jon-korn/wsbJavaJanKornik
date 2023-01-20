package kornik;

import kornik.devices.*;
import kornik.creatures.Pet;

public class Main {
    public static void main(String[] args) {


        Pet pet = new Pet("Kot");
        Human Jaś = new Human();
        Jaś.pet = pet;
        Jaś.pet.takeForAWalk();

        Phone phone = new Phone("nowy","wsb",2022);
        phone.installAnnApp();

        ElectricCar tesla = new ElectricCar("tesla","tes",2022);
        DiselCar disel = new DiselCar("tesla","tes",2022);
        LPGCar lPG = new LPGCar("tesla","tes",2022);
        disel.refuel();
        lPG.refuel();
        tesla.refuel();
        CarWash niezbedna = new CarWash();
        niezbedna.wash(tesla);

    }

}