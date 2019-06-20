package tools;

import food.Item;
import java.util.Comparator;

public class SortByCalories implements Comparator<Item> {
    @Override
    public int compare(Item o1, Item o2) {
        int cal1 = o1.getCalories();
        int cal2 = o2.getCalories();
        if (cal1 < cal2)
            return -1;
        else if (cal1 > cal2)
            return 1;
        else return 0;
    }



}
