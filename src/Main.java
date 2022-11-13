import devices.Car;
import devices.Phone;
import java.util.concurrent.TimeUnit;
public class Main {

    public static void main(String[] args) {

        Animal cat = new Animal("tiger");
        cat.name = "Dzambo";


        Human jasio = new Human();
        jasio.pet = cat;
        System.out.println(jasio.pet.name);

        jasio.phone = new Phone( "galagxy", "Samsung",1985 );

        Car fiat = new Car("Fiat 126p", "Fiat", 1528);
        Car fiat2 = new Car("Fiat 126p", "Fiat", 4532);
        //jasio.setSalary(2000.0);
        //jasio.setCar(fiat ,jasio.getSalary());
        System.out.println(fiat.equals(fiat2));
        System.out.println(fiat);
        System.out.println(fiat2);
        System.out.println(cat);
        System.out.println(jasio);
        System.out.println(jasio.phone);
        fiat.turnOn();
        jasio.phone.turnOn();

    }
}