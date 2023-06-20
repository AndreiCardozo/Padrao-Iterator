package padroescomportamentais.iterator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Stock implements Iterable<Item> {

    private List<Item> items;

    public Stock(Item... items) {
        this.items = new ArrayList<>();
        for (Item item : items) {
            this.items.add(item);
        }
    }

    @Override
    public Iterator<Item> iterator() {
        return items.iterator();
    }
}