package kornik.creatures;

public interface Feedable {

    abstract void feed();
    abstract void feed(Integer foodWeight);

    /*void feed(foodWeight){
        if (isAlive) {
            weight += 50;
            System.out.println("Dzięki za żarcie");

        } else if (!isAlive&&weight>0) {
            isAlive = true;
            System.out.println("GRATULACJE!!");
            System.out.println("Kot został wskrzeszony.");
        } else{
            weight += 50;
            System.out.println("Ty zły człowieku czemu nie nakarmiłeś kota?.");
        }
    }*/



    /*void takeForAWalk()
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

    }*/
}
