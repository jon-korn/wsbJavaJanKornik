package kornik.creatures;

import kornik.Human;

public class Pet extends Animal{
    public Pet(String species){
        super(species);
    }

    @Override
    public void sellable(Human seller, Human buyer, double price) {

    }
}
