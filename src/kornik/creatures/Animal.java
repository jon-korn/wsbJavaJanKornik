package kornik.creatures;
import kornik.Human;
import kornik.Salleable;

public abstract class Animal implements Feedable, Salleable{
    final String species;
    Boolean DEFAULT_bieganie = false;
    Double DEFAULT_dystans = 5.0;

    public Animal(String species){

        this.species = species;
    }
    public String toString(){
        return species;
    }

    @Override
    public void feed() {
        System.out.println("Pet nakarmiony");
    }

    @Override
    public void feed(Integer foodWeight) {
        System.out.println("Pet nakarmiony jedzeniem o wadze {0}");
    }

    public void takeForAWalk(Double dystans, Boolean bieganie)
    {
        if (bieganie){
            System.out.println("Człowieku łapiesz zadyszkę, ZWOLNIJ!");
            System.out.println("gratuluje z przebiegniecia "+dystans+" kilometrow");
            }
        else{
            System.out.println("Przeszedłeś "+dystans+" kilometrów ze swoim zwierzakiem");
        }
    }
    public void takeForAWalk(Double dystans){

        this.takeForAWalk(dystans,DEFAULT_bieganie);
    }

    public void takeForAWalk(){

        this.takeForAWalk(DEFAULT_dystans);
    }

    public void sellable(Human seller, Human buyer, Double price) {
        if (seller.pet != this || seller.pet == null) {
            System.out.println("Nie możesz sprzedawać nie swoich zwierzat");
        } else if (buyer.cash < price) {
            System.out.println("Nie masz kasy");
        }
         else{
            buyer.cash -= price;
            seller.cash += price;
            buyer.pet = this;
            seller.pet = null;
            System.out.println("Transakcja udana");
        }
    }
}
