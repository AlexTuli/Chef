package food;

/**
 * Created by Alexander on 10.10.2015.
 */
public class Vegetable extends Item {
    private boolean isRoasted;

    public Vegetable(String name, int cost, int calories, int weight, boolean isRoasted) {
        super(name, cost, calories, weight);
        this.isRoasted = isRoasted;
    }

    public Vegetable() {
        super();
    }

    public boolean isRoasted() {
        return isRoasted;
    }

    public void setIsRoasted(boolean isRoasted) {
        this.isRoasted = isRoasted;
    }

    public static Builder newBuilder(){
        return new Vegetable().new Builder();
    }

    public class Builder {
        private Builder(){

        }
        public Builder setName(String name){
            Vegetable.super.setName(name);
            return this;
        }
        public Builder setCalories(int calories){
            Vegetable.super.setCalories(calories);
            return this;
        }
        public Builder setWeight(int weight){
            Vegetable.super.setWeight(weight);
            return this;
        }
        public Builder setCost(int cost){
            Vegetable.super.setCost(cost);
            return this;
        }
        public Builder setRoasted(boolean isRoasted){
            Vegetable.this.isRoasted = isRoasted;
            return this;
        }
        public Vegetable build(){
            return Vegetable.this;
        }

    }

}
