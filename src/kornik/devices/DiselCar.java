package kornik.devices;

import kornik.Human;

public class DiselCar extends Car{
    public DiselCar(String model, String producer, int yearOfproduction, double value) {
        super(model, producer, yearOfproduction, value);
    }

    @Override
    public void refuel() {
        System.out.println("Disel został nalady do baku, miłej jazdy");
    }



    @Override
    public void sellable(Human seller, Human buyer, double price) {

    }
}
