package tools;

import food.Meat;
import food.Salad;
import food.Vegetable;

import java.util.ArrayList;

/**
 *
 * Created by Alexander on 10.10.2015.
 */
public class Tools {

    public static void sortSalad(Salad obj, String sortBy){
        //ArrayList<Item> tmp = obj.getSalad();
        switch (sortBy) {
            case "Calories":
                //Arrays.sort(tmp, new SortByCalories());
                obj.getSalad().sort(new SortByCalories());
                break;
            case "Weight":
                obj.getSalad().sort(new SortByWeight());
                break;
            case "Cost":
                obj.getSalad().sort(new SortByCost());
                break;
            default:
                System.out.println("Error");
                break;
        }
    }

    //Create & return a predetermined amount of tomatoes
    public static ArrayList<Vegetable> newTomatoes(int i){
        ArrayList<Vegetable> tomatoes = new ArrayList<Vegetable>(i);
        for (int j =0; j < i; j++) {
            tomatoes.add(Vegetable.newBuilder().setCalories(20).setCost(50).setName("Tomato").setRoasted(false).setWeight(50).build());
        }
        return tomatoes;
    }
    public static ArrayList<Vegetable> newCucumber(int i){
        ArrayList<Vegetable> cucumbers = new ArrayList<Vegetable>(i);
        for(int j=0; j < i; j++){
            cucumbers.add(Vegetable.newBuilder().setCalories(15).setCost(40).setName("Cucumber").setRoasted(false).setWeight(60).build());
        }
        return cucumbers;
    }
    public static ArrayList<Meat> newCowMeat(int i){
        ArrayList<Meat> cowMeat = new ArrayList<Meat>(i);
        for(int j=0; j < i; j++){
            cowMeat.add(Meat.newBuilder().setWeight(120).setRoasted(true).setName("Cow meat").setCalories(200).setCost(300).build());
        }
        return cowMeat;
    }



}
