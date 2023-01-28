package kornik.devices;
import kornik.Human;
import kornik.Salleable;
public abstract class Device implements Salleable {
     String model;
     String producer;
     int yearOfProduction;

     double value;

    public Device(String model, String producer, int yearOfProduction, double value){
        this.model=model;
        this.producer=producer;
        this.yearOfProduction=yearOfProduction;
        this.value=value;
    }

    public Device() {

    }


    public String toString(){
        return model + " " + producer;
    }

    abstract void turnOn();

}
