import devices.Car;
import devices.Phone;

public class Main {

    public static void main(String[] args) {

        Animal cat = new Animal("tiger");
        cat.name = "Dzambo";


        Human jasio = new Human();
        jasio.pet = cat;
        System.out.println(jasio.pet.name);

        jasio.phone = new Phone( "galagxy", "Samsung");

        Car fiat = new Car("Fiat 126p", "Fiat");
        Car fiat2 = new Car("Fiat 126p", "Fiat");
        //jasio.setSalary(2000.0);
        //jasio.setCar(fiat ,jasio.getSalary());
        System.out.println(fiat.equals(fiat2));
        System.out.println(fiat);
        System.out.println(fiat2);
        System.out.println(cat);
        System.out.println(jasio);
        System.out.println(jasio.phone);
    }
}