package food;

/**
 * Created by Alexander on 10.10.2015.
 */
public abstract  class Item {
    private String name;
    private int cost;
    private int calories;
    private int weight;

    public Item(String name, int cost, int calories, int weight) {
        this.name = name;
        this.cost = cost;
        this.calories = calories;
        this.weight = weight;
    }

    public Item(){
        super();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public int getCalories() {
        return calories;
    }

    public void setCalories(int calories) {
        this.calories = calories;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Item{" + "name='" + name + '\'' + '}';
    }

}


