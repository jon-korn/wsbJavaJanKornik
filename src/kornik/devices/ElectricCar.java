package kornik.devices;


public class ElectricCar extends Car {
    public ElectricCar(String model, String producer, Integer yearOfproduction) {
        super(model, producer, yearOfproduction);
    }

    @Override
    public void refuel() {
        System.out.println("Bateryjki naładowane");
    }
}
