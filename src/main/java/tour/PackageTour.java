package tour;

import java.util.ArrayList;
import java.util.List;

public class PackageTour implements Tour {

    private String packageName;
    private List<Tour> tours = new ArrayList<Tour>();
    private int availableSeats;

    public PackageTour(String packageName){
        this.packageName = packageName;
    }

    public void addTours(Tour tour){
        tours.add(tour);

    }


    @Override
    public double getPrice() {
        double total = 0;
        for (Tour t : tours)
            total += t.getPrice();
        return total*0.9;
    }


    public String getName() {
        return packageName;
    }


    public int getAvailableSeats() {
        return 0;
    }
}
