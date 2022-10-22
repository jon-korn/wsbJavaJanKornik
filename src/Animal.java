public class Animal {
    final String species;
    String name;
    Integer weight;
    Boolean isAlive;
    Animal(String species){
        this.isAlive = true;
        this.species = species;
    }

    void feed(){
        if (isAlive) {
            weight += 50;
            System.out.println("Dzięki za żarcie");

        } else if (!isAlive&&weight>0) {
            isAlive = true;
            System.out.println("GRATULACJE!!");
            System.out.println("Kot został wskrzeszony.");
        } else{
            weight += 50;
            System.out.println("Ty mały kurwiu czemu nie nakarmiłeś kota?");
        }
    }
    void takeForAWalk()
    {
        if (isAlive){
            weight-=50;
            System.out.println("Kot sie cieszy ze spaceru! +_+");
            if (weight <=0) {
                isAlive = false;
            }
        }
        else{
            System.out.println("Kot nie żyje.");
            System.out.println("HAAALOO POLICJA!!");
        }

    }
}
