import java.util.ArrayList;

public class Cart {
    public static final int MAX_NUMBER_ORDERED = 20;
    private DigitalVideoDisc itemOrdered[] = new DigitalVideoDisc[MAX_NUMBER_ORDERED];

    private ArrayList<DigitalVideoDisc> discs = new ArrayList<>();

    public void addDigitalVideoDisc(DigitalVideoDisc disc) {
        discs.add(disc);
    }

    public float totalCost() {
        float total = 0;
        for (DigitalVideoDisc disc : discs) {
            total += disc.getCost();
        }
        return total;
    }
}



