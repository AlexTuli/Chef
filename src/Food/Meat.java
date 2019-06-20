package Food;

/**
 * Created by Alexander on 10.10.2015.
 */
public class Meat extends Item {
    //private String speciesOfMeat;
    private boolean isRoasted;

    public Meat(String name, int cost, int calories, int weight, boolean isRoasted) {
        super(name, cost, calories, weight);
        //this.speciesOfMeat = scpeciesOfMeat;
        this.isRoasted = isRoasted;
    }

    public Meat(){
        super();
    }

   /* public String getSpeciesOfMeat() {
        return speciesOfMeat;
    }

    public void setSpeciesOfMeat(String speciesOfMeat) {
        this.speciesOfMeat = speciesOfMeat;
    }
*/
    public boolean isRoasted() {
        return isRoasted;
    }

    public void setIsRoasted(boolean isRoasted) {
        this.isRoasted = isRoasted;
    }




    public static Builder newBuilder(){
        return new Meat().new Builder();
    }

    public class Builder {
        private Builder(){

        }
        public Builder setName(String name){
            Meat.super.setName(name);
            return this;
        }
        public Builder setCalories(int calories){
            Meat.super.setCalories(calories);
            return this;
        }
        public Builder setWeight(int weight){
            Meat.super.setWeight(weight);
            return this;
        }
        public Builder setCost(int cost){
            Meat.super.setCost(cost);
            return this;
        }
        public Builder setRoasted(boolean isRoasted){
            Meat.this.isRoasted = isRoasted;
            return this;
        }
        public Meat build(){
            return Meat.this;
        }

    }
}

