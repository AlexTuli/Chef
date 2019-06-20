import Food.Meat;
import Personal.Chief;

import java.util.ArrayList;

/**
 * @author Alexander
 * @version v 1.1
 * for EPAM system corp.
 * Created by Alexander on 08.10.2015.
 */
public class Main {
    public static void main(String[] args){
        //Create some vegetables
      /*  Vegetable tomato1 = new Vegetable(100,20,5, "Tomato" );
        Vegetable tomato2 = new Vegetable(100,20,5, "Tomato" );
        Vegetable tomato3 = new Vegetable(100,20,5, "Tomato" );
        Vegetable cucumber1 = new Vegetable(75, 15, 8, "Cucumber");
        Vegetable cucumber2 = new Vegetable(75, 15, 8, "Cucumber");
        Vegetable parsley1 = new Vegetable(10, 5, 3, "Parsley");
        //Create salad from our vegetables.
        Salad someSalad = new Salad(15, tomato1, cucumber1, tomato3, parsley1, tomato2);
        someSalad.about(); //Ask for main info about salad
        someSalad.addVegetable(cucumber2);  //Adding one more vegetable.
        someSalad.about(); //Ask one more time for info.

        //Look for order in list vegetables, looks not very good, and we want to sort this
        someSalad.displayVegetables();

        someSalad.sortByCalories();
        someSalad.displayVegetables(); //Now we have completely sorted list of vegetables
        someSalad.sortByWeight();  // Sort by weight. Just for fun.
        someSalad.displayVegetables(); //look for make sure, that our sorting is work correctly.

        //Looking for vegetable with specify quantity of calories
        someSalad.findByCalories(20);
        someSalad.findByCalories(25);*/

        //Meat somethng = new Meat("Meat of Goat", 200, 150, 300, "Goat", true);
       // System.out.println(somethng.toString());
        //Chief chief = new Chief();
        Chief.makeSalad();




    }
}
