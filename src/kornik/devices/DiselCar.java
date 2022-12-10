package kornik.devices;

public class DiselCar extends Car{
    public DiselCar(String model, String producer, Integer yearOfproduction) {
        super(model, producer, yearOfproduction);
    }

    @Override
    public void refuel() {
        System.out.println("Disel został nalady do baku, miłej jazdy");
    }
}
