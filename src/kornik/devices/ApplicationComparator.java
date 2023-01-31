package kornik.devices;

import java.util.Comparator;

public class ApplicationComparator implements Comparator<Application> {
    @Override
    public int compare(Application o1, Application o2) {
        int result = (int) (o1.getPrice()-o2.getPrice());
        return result;
    }
}
