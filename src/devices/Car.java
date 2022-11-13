package devices;

public class Car extends Device {

    String color;
    Integer numberOfCrashes;
    Double power;
    public Double prize=1990.0;

    public Car(String model, String producer, Integer yearOfproduction){
        super(model,producer,yearOfproduction);
    }

    public String toString() {
        return model + " " + color;
    }

    @Override
    public void turnOn() {
        System.out.println("Odpalamy WUUUTTT TUTUTUTUUTUUU");
    }
}
