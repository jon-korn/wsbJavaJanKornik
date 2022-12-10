package kornik;

import kornik.devices.CarWash;
import kornik.devices.ElectricCar;
import kornik.devices.Phone;
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
        tesla.refuel();
        CarWash niezbedna = new CarWash();
        niezbedna.wash(tesla);

    }

}