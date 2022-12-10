package kornik.devices;
import kornik.Human;
import kornik.Salleable;
public abstract class Device  {
    final String model;
    final String producer;
    final Integer yearOfProduction;

    public Device(String model, String producer, Integer yearOfProduction){
        this.model=model;
        this.producer=producer;
        this.yearOfProduction=yearOfProduction;
    }

    public String toString(){
        return model + " " + producer;
    }

    abstract void turnOn();

}
