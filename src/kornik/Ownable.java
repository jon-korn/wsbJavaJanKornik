package kornik;

import kornik.Human;

public interface Ownable {
    public Human getOwer();
    public Boolean isOwned();
}
