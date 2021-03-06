package tools;

import food.Item;
import java.util.Comparator;

public class SortByWeight implements Comparator<Item> {
    @Override
    public int compare(Item o1, Item o2){
         if (o1.getWeight() < o2.getWeight())
             return -1;
        else if (o1.getWeight() > o2.getWeight())
             return 1;
        else return 0;
    }
}
