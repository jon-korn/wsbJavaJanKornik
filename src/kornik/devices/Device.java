package kornik.devices;
import kornik.Human;
import kornik.Salleable;
public abstract class Device implements Salleable {
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

    @Override
    public void sellable(Human seller, Human buyer, Double price) {
        if (seller.car != this) {
            System.out.println("Nie możesz sprzedawać nie swoich aut");
        } else if (buyer.cash < price) {
            System.out.println("Nie masz kasy");
        } else {
            buyer.cash -= price;
            seller.cash += price;
            buyer.car = (Car) this;
            seller.car = null;
            System.out.println("Transakcja udana");
        }
    }
}
