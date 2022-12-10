package kornik.creatures;

public class FarmAnimal extends Animal implements Edbile {
    public FarmAnimal(){
        super("krowa");
    }

    @Override
    public void beEaten() {
        System.out.println("Było smacze");
    }
}
