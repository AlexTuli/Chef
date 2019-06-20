package Food;

import java.util.ArrayList;

/**
 * Created by Alexander on 10.10.2015.
 */
public class Salad {
    private ArrayList<Item> salad = new ArrayList();
    private String name;

    public Salad(String name) {
        this.name = name;
    }

    public Salad(){
        super();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList getSalad() {
        return salad;
    }

    public void setSalad(ArrayList salad) {
        this.salad = salad;
    }
}
