package kornik.devices;


import kornik.Human;

public class ElectricCar extends Car {
    public ElectricCar(String model, String producer, int yearOfproduction, double vaule) {
        super(model, producer, yearOfproduction, vaule);
    }

    public ElectricCar() {
    }

    @Override
    public void refuel() {
        System.out.println("Bateryjki naładowane");
    }

    @Override
    public void sellable(Human seller, Human buyer, double price) {

    }
}
