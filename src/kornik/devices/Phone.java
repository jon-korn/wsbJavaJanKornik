package kornik.devices;


import kornik.Human;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Phone extends Device implements kornik.Salleable {

    String color;
    String DEFAULT_adresSerwera = "Intra.PR1.INTEl";

    double DEFAULT_wersja = 2.01;

    String DEFAULT_nazwa = "INTEL";

    private List<Application> appList = new ArrayList<Application>();


    public Phone(String model, String producer, Integer yearOfproduction, double value) {
        super(model, producer, yearOfproduction, value);
    }

    public String toString() {
        return model + " " + producer;
    }

    public void turnOn() {
        System.out.println("Siuuumm dziala");
    }


//    public void installAnnApp(String note, double kornik){
//        this.installAnnApp(DEFAULT_nazwa,DEFAULT_wersja, DEFAULT_adresSerwera);
//    }
//    public void installAnnApp(String nazwa){
//        this.installAnnApp(nazwa,DEFAULT_wersja, DEFAULT_adresSerwera);
//    }
//    public void installAnnApp(String nazwa, double  wersja){
//        this.installAnnApp(nazwa,wersja, DEFAULT_adresSerwera);
//    }
//    public void installAnnApp(String nazwa, double  wersja, String adresSerwera){
//        System.out.println("Za chwile zostanie zainstalowana aplikacja o nazwie "+nazwa+" i wersji"+wersja+"" +
//                "\nPliki potrzebne do aplikacji są pobierane z "+adresSerwera+"." +
//                "\nPliki są wypakowywane." +
//                "\n"+nazwa+" jest instalowa.\nInstalizacja się NIE UDAŁA");
//    }

    public void sellable(Human seller, Human buyer, double price) {
        if (seller.phone == this) ;
    }

    public List<Application> getAppList() {
        return appList;
    }

    public void setAppList(Application application) {
        appList.add(application);
    }

    public void installApp(Application application, Human human) {
        if (human.cash >= application.getPrice()) {
            this.setAppList(application);
            human.cash -= application.getPrice();
            System.out.println("Applikacja pomyślnie zainstalowana");
        } else {
            System.out.println("za mało pieniedzy");
        }

    }

    public boolean checkIfYouHaveApp(Application application) {
        if (this.appList.contains(application)) {
            System.out.println("Applikacja jest zainstalowana na tym telefonie");
            return true;
        }
        System.out.println("takiej aplikacji tu nie ma");
        return false;
    }

    public boolean checkIfYouHaveApp(String name) {
        boolean retu = false;
        for (int i = 0; i < this.appList.size();i++) {
            if (this.appList.get(i).getName() == name){
                System.out.println("Applikacja jest zainstalowana na tym telefonie");
                retu = true;
                return true;
            }


        }
        System.out.println("takiej aplikacji tu nie ma");
        return retu;
    }
    public void showFreeApps(){
        System.out.println("Tu jest lista bezpłatnych applikacji na tym telefonie");
        for (int i = 0; i < this.appList.size();i++) {
            if (this.appList.get(i).getPrice() == 0){
                System.out.println(appList.get(i).getName());
            }
        }
        System.out.println("koniec listy.");
    }

    public double appsPrice(){
        double sum =0;
        for (int i = 0; i < this.appList.size();i++) {
            sum+=this.appList.get(i).getPrice();
        }
        System.out.println("Suma ceny wszystkich appek na tym telefonie to "+sum);
        return sum;
    }
    public void sortAppsByName(){
        Collections.sort(this.appList);
        System.out.println(this.appList);
    }
    public void sortAppsByPrice(){
        Collections.sort(this.appList,new ApplicationComparator());
        System.out.println(this.appList);
    }

}