package devices;

public class Phone {
    final String model;
    final String producer;
    String color;



    public Phone(String model, String producer) {
        this.model = model;
        this.producer = producer;
    }

    public String toString() {
        return model+ " "+ producer;
    }
}