package kornik.devices;

import kornik.Human;

import java.util.ArrayList;
import java.util.List;

public abstract class Car extends Device {

    private String color;
    private int numberOfCrashes;
    private double power;
    private double price = 1;

    private List<Human> owner = new ArrayList<Human>();

    public void setOwner(Human human) {
        this.owner.add(human);
    }

    public Car(String model, String producer, int yearOfproduction, double value) {
        super(model, producer, yearOfproduction, value);
    }

    public Car() {
        super();
    }


    public String toString() {
        return model;
    }

    public double getvalue() {
        return value;
    }

    @Override
    public void turnOn() {
        System.out.println("Odpalamy WUUUTTT TUTUTUTUUTUUU");
    }

    abstract void refuel();

    public int getyear() {

        return yearOfProduction;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getNumberOfCrashes() {
        return numberOfCrashes;
    }

    public void setNumberOfCrashes(int numberOfCrashes) {
        this.numberOfCrashes = numberOfCrashes;
    }

    public double getPower() {
        return power;
    }

    public void setPower(double power) {
        this.power = power;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void sell(Human seller, Human buyer, double price) throws Exception {
        if(!seller.hasACar(this)){
            throw new Exception("Sprzedawca nie ma auta");
        }
        if(!buyer.hasFreeSpace()){
            throw new Exception("Kupujący nie ma miejsca");
        }
        if (buyer.cash< price){
            throw  new Exception("Kupujący nie ma siana");
        }
        if (owner.get(owner.size()-1)!=seller){
            throw new Exception("Sprzedawca nie jest aktualnym właścicielem auta");
        }
        buyer.addCar(this);
        seller.removeCar(this);
        buyer.cash-=price;
        seller.cash += price;
        System.out.println("Transakcja udana");
    }

    public boolean checkOwner(Human human){
       if(owner.contains(human)){
           System.out.println("Auto należało do "+ human+".");
           return true;
       }
        return false;
    }

    public boolean ifSoldAToB(Human seller, Human buyer){
        if (owner.contains(seller) && owner.contains(buyer)){
            if (owner.get(owner.indexOf(seller)+1)==buyer){
                System.out.println("Była taka transakcja");
                return true;
            }
        }
        System.out.println("Nie było takiej transakcji");
        return false;
    }
    public int howManyTransactions(){
        System.out.println(owner.size());
        System.out.println("transakcji było "+ (owner.size()-1));
        return (owner.size()-1);
    }

    public List<Human> getOwner() {
        System.out.println(owner);
        return owner;
    }
}