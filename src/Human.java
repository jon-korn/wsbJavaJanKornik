import devices.Car;
import devices.Phone;

public class Human {
    String firstName;
    String lastName;
    Animal pet;
    Integer yearOfBirth;
    private Car car;
    Phone phone;
    private Double salary;

    public Double getSalary() {
        System.out.println("Dane byly pobierane wczoraj");
        return salary;
    }

    public void setSalary(Double salary) {
        if (salary < 0) {
            System.out.println("Złodzieju nie będę płacił za to że pracuję.");
        } else {
            System.out.println("Nowe dane zostały wysłane do systemu księgowego\nPrzypominamy o konieczności odebrania aneksu do umowy od pani Hani z kadr");
            System.out.println("ZUS i US już wiedzą o zmianie wypłaty więc nie ma sensu ukrywać dochodu");
            this.salary = salary;
        }
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car, Double salary) {
        if (this.salary > car.prize) {
            System.out.println("Udało się kupć samochód za gotówkę.");
            this.car = car;
        } else if (salary > 1 / 12 *car.prize) {
            System.out.println("Automobil zostal kupiony na kredyt. W przyszłości polecamy rower");
            this.car = car;
        } else {
            System.out.println("Chłopie weź się za naukę, bo auta to na pewno nie kupisz.");
        }

    }

    public String toString() {
        return firstName;
    }
}