package kornik;

import kornik.creatures.Animal;
import kornik.creatures.Pet;
import kornik.devices.Car;
import kornik.devices.LPGCar;
import kornik.devices.Phone;

import java.nio.DoubleBuffer;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class Human {
    public Car car;
    String firstName;
    String lastName;
    public Animal pet;
    Integer yearOfBirth;
    public Phone phone;
    private double salary = 50;
    public double cash = 400.0;

    private int DEF_GARAGE_SIZE = 1;
    private Car[] garage;

    public Human(String firstName, String lastName, Integer yearOfBirth, double salary, double cash) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.yearOfBirth = yearOfBirth;
        this.salary = salary;
        this.cash = cash;
        garage = new Car[DEF_GARAGE_SIZE];
        setDefaultCar();
    }

    public Human(String firstName, String lastName, Integer yearOfBirth, double salary, double cash, int garageSize) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.yearOfBirth = yearOfBirth;
        this.salary = salary;
        this.cash = cash;
        garage = new Car[garageSize];
        setDefaultCar();
    }

    public double getSalary() {
        System.out.println("Dane byly pobierane wczoraj");
        return salary;
    }

    public void setSalary(double salary) {
        if (salary < 0) {
            System.out.println("Złodzieju nie będę płacił za to że pracuję.");
        } else {
            System.out.println("Nowe dane zostały wysłane do systemu księgowego\nPrzypominamy o konieczności odebrania aneksu do umowy od pani Hani z kadr");
            System.out.println("ZUS i US już wiedzą o zmianie wypłaty więc nie ma sensu ukrywać dochodu");
            this.salary = salary;
        }
    }

    public Car getCar(int position) {
        if (position < garage.length && position >= 0) {
            return garage[position];
        } else {
            System.out.println("Pozycja sie nie zgadza.");
            return null;
        }
    }

    public void setCar(Car car, int position) {
        if (position < garage.length && position >= 0) {
            Car temp = garage[position];
            if (garage[position] != null && salary > car.getPrice()) {
                System.out.println("Udało się kupić automobil lecz poprzedni został wyrzucony na bruk i stracony");
                this.garage[position] = car;
                car.setOwner(this);
            } else if (garage[position] == null && salary > car.getPrice()) {
                System.out.println("Udało się kupć samochód za gotówkę.");
                this.garage[position] = car;
                car.setOwner(this);
            } else if (garage[position] == null && salary > 1 / 12 * car.getPrice()) {
                System.out.println("Automobil zostal kupiony na kredyt. W przyszłości polecamy rower");
                this.garage[position] = car;
                car.setOwner(this);
            } else {
                System.out.println("Nie udało się dodać auta.");
            }
        } else {
            System.out.println("Pozycja garażu się nie zgadza");
        }
    }


    @Override
    public String toString() {
        return "Human{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                "garage=" + Arrays.toString(garage) +
                '}';
    }

    public void sellable(Human seller, Human buyer, double price) {
        System.out.println("Naura");
    }

    public double carsValue() {
        double suma = 0.0;
        for (int i = 0; i <= garage.length; i++) {
            try {
                suma += garage[i].getvalue();
            } catch (Exception ArrayIndexOutOfBoundsException) {
                break;
            }
        }
        System.out.println("Wartość twoich pojazdów wynosi: " + suma);
        return suma;
    }

    public void sortYourGarage() {
        for (int i = 0; i < garage.length; i++) {
            for (int j = 0; j < garage.length; j++) {
                Car temp;
                if (garage[i] != null && garage[j] != null && garage[i].getyear() < garage[j].getyear()) {
                    temp = garage[i];
                    garage[i] = garage[j];
                    garage[j] = temp;
                }
            }
        }


        //Arrays.sort(garage,Comparator.comparingInt(Car::getyear));
        System.out.println("Garaż został posortowany");
    }

    private void setDefaultCar() {
        if (garage.length > 0 && garage[0] == null) {
            garage[0] = new LPGCar("Fiat126p", "Fiat", 2000, 20.0);
            garage[0].setOwner(this);
        }
    }

    public Car[] getGarage() {
        return garage;
    }

    public boolean hasACar(Car car) {
        for (Car value : garage) {
            if (value == car) {
                return true;
            }
        }
        return false;
    }

    public boolean hasFreeSpace() {
        for (Car car : garage) {
            if (car == null) {
                return true;
            }
        }
        return false;
    }

    public void addCar(Car car) {
        for (int i = 0; i < garage.length; i++) {
            if (garage[i] == null) {
                garage[i] = car;
                car.setOwner(this);
                return;
            }
        }
    }

    public void removeCar(Car car) {
        for (int i = 0; i < garage.length; i++) {
            if (garage[i] == car) {
                garage[i] = null;
                return;
            }
        }
    }


}