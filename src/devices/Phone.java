package devices;


public class Phone extends Device {

    String color;
    public Phone(String model, String producer, Integer yearOfproduction){
        super(model,producer,yearOfproduction);
    }
    public String toString() {
        return model+ " "+ producer;
    }

    public void turnOn(){
        System.out.println("Siuuumm dziala");
    }

}