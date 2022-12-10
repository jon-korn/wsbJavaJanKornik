package kornik.devices;


import kornik.Human;

public class Phone extends Device implements kornik.Salleable {

    String color;
    String DEFAULT_adresSerwera = "Intra.PR1.INTEl";

    Double DEFAULT_wersja = 2.01;

    String DEFAULT_nazwa = "INTEL";

    public Phone(String model, String producer, Integer yearOfproduction){
        super(model,producer,yearOfproduction);
    }
    public String toString() {
        return model+ " "+ producer;
    }

    public void turnOn(){
        System.out.println("Siuuumm dziala");
    }


    public void installAnnApp(){
        this.installAnnApp(DEFAULT_nazwa,DEFAULT_wersja, DEFAULT_adresSerwera);
    }
    public void installAnnApp(String nazwa){
        this.installAnnApp(nazwa,DEFAULT_wersja, DEFAULT_adresSerwera);
    }
    public void installAnnApp(String nazwa, Double wersja){
        this.installAnnApp(nazwa,wersja, DEFAULT_adresSerwera);
    }
    public void installAnnApp(String nazwa, Double wersja, String adresSerwera){
        System.out.println("Za chwile zostanie zainstalowana aplikacja o nazwie "+nazwa+" i wersji"+wersja+"" +
                "\nPliki potrzebne do aplikacji są pobierane z "+adresSerwera+"." +
                "\nPliki są wypakowywane." +
                "\n"+nazwa+" jest instalowa.\nInstalizacja się NIE UDAŁA");
    }

    public void sellable(Human seller, Human buyer, Double price) {
        if(seller.phone == this);
    }



}