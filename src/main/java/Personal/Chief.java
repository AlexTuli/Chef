package personal;

import food.Salad;
import tools.Tools;

/**
 * Created by Alexander on 11.10.2015.
 */
public class Chief {
    public static void makeSalad(){
        Salad something = new Salad();
        something.getSalad().add(Tools.newTomatoes(3));
        something.getSalad().add(Tools.newCowMeat(1));
        something.getSalad().add(Tools.newCucumber(2));
        System.out.println("We make a " + something.getSalad().toString());
        Tools.sortSalad(something, "Calories");
        System.out.println(something.getSalad().toString());
    }

}
