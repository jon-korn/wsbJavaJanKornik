package kornik;

import kornik.devices.*;
import kornik.creatures.Pet;

public class Main {
    public static void main(String[] args) {


        Pet pet = new Pet("Kot");
        Human Jaś = new Human();
        Human Kornik = new Human();
        LPGCar krolWsi = new LPGCar("Polonez","FSO",1234);
        Kornik.car = krolWsi;
        Jaś.pet = pet;
        Jaś.cash += 5000.0;
        Kornik.cash += 400.0;

        System.out.println(Kornik.cash+ " Przed jakim kolwiek handlem");
        Jaś.sellable(Jaś, Kornik,200.0);

        System.out.println(Kornik.cash+" Po handlu człowiekiem");

        Kornik.car.sellable(Kornik, Jaś, 4000.0);
        System.out.println(Kornik.cash+" Po zakupie kota i sprzedaniu auta");

        System.out.println(Kornik.pet);



    }

}