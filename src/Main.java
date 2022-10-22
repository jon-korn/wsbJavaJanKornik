public class Main {

    public static void main(String[] args) {

        Animal cat = new Animal("tYgrYs");
        cat.name = "Dzambo";
        cat.weight = 90;

        Human jasio = new Human();
        jasio.pet = cat;
        System.out.println(jasio.pet.name);

        Car fiat = new Car("Fiat 126p", "Fiat");
        jasio.car = fiat;
        System.out.println(jasio.car.model);
        //ctr+alt+l
    }
}