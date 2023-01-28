package kornik.creatures;

import kornik.Human;

public class FarmAnimal extends Animal implements Edbile {
    public FarmAnimal(){
        super("krowa");
    }

    @Override
    public void beEaten() {
        System.out.println("Było smacze");
    }

    @Override
    public void sellable(Human seller, Human buyer, double price) {

    }
}
