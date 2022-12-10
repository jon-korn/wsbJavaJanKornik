package kornik.devices;

public class LPGCar extends Car{
    public LPGCar(String model, String producer, Integer yearOfproduction) {
        super(model, producer, yearOfproduction);
    }

    @Override
    public void refuel() {
        System.out.println("Butla z gazem napelniona o tak o :D");
    }
}
