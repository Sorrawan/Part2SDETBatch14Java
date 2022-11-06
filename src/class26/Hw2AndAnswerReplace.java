package class26;

import java.util.ArrayList;
import java.util.Iterator;

public class Hw2AndAnswerReplace {
    /*
    Create an arrayList of drinks. If any drink has letter “a” or “e” replace it with water.
     */
    public static void main(String[] args) {
        ArrayList<String> drinks=new ArrayList<>();
        drinks.add("Tea");
        drinks.add("fresh Juice");
        drinks.add("Iced Tea");
        drinks.add("Soda");
        drinks.add("canned Juice");
        drinks.add("Milk");
        drinks.add("Chocolate Milk");
        for (int i = 0; i < drinks.size(); i++) {
            if (drinks.get(i).contains("a") ||drinks.get(i).contains("e")){
                drinks.set(i,"Water");     //".set" =>used to replacing the element
            }
        }
        System.out.println(drinks);




    }
}
