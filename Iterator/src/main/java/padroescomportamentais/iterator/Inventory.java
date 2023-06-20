package padroescomportamentais.iterator;

import java.util.Iterator;

public class Inventory {

    public static int countAvailableItems(Stock stock) {
        int count = 0;
        for (Item item : stock) {
            if (item.isAvailable()) {
                count++;
            }
        }
        return count;
    }

    public static int countTotalItems(Stock stock) {
        int count = 0;
        Iterator<Item> iterator = stock.iterator();
        while (iterator.hasNext()) {
            count++;
            iterator.next();
        }
        return count;
    }
}
