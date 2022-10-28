package devices;

public class Car {
    final String model;
    final String producer;
    String color;
    Integer numberOfCrashes;
    Double power;
    public Double prize=1990.0;

    public Car(String model, String producer){
        this.model = model;
        this.producer = producer;
    }

    public String toString() {
        return model + " " + color;
    }
}
