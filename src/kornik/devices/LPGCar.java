package kornik.devices;

import kornik.Human;

public class LPGCar extends Car{

    public LPGCar(String model, String producer, int yearOfproduction, double value) {
        super(model, producer, yearOfproduction, value);
    }

    public LPGCar() {
        super();
    }

    @Override
    public void refuel() {
        System.out.println("Butla z gazem napelniona o tak o :D");
    }

    @Override
    public void sellable(Human seller, Human buyer, double price) {

    }
}
