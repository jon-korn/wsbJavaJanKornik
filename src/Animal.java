public class Animal {
    final String species;
    String name;
    Double weight;
    Boolean isAlive;
    Animal(String species){
        this.isAlive = true;
        this.species = species;
        if (this.species == "tiger"){
            this.weight = 80.0;
        } else if (this.species == "bear") {
            this.weight = 450.0;
        }
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
            System.out.println("Ty zły człowieku czemu nie nakarmiłeś kota?");
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
    public String toString(){
        return species+ " "+ name + " " + weight;
    }
}
