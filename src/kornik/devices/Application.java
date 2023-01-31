package kornik.devices;

import java.util.Comparator;

public class Application implements Comparable<Application> {
    private final String name;
    private double version;
    private double price;

    public Application(String name, double version, double price) {
        this.name = name;
        this.version = version;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getVersion() {
        return version;
    }

    public void setVersion(double version) {
        this.version = version;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public int compareTo(Application o) {
        int result = this.name.compareTo(o.name);
        return result;
    }

    @Override
    public String toString() {
        return "Application{" +
                "name='" + name + '\'' +
                '}';
    }
}
