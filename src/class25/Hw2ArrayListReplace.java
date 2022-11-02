package class25;

import java.util.ArrayList;
import java.util.Iterator;

public class Hw2ArrayListReplace {
    /*
    Create an arrayList of drinks. If any drink has letter “a” or “e” replace it with water.
     */

    public static void main(String[] args) {
        ArrayList<String> drinks = new ArrayList<>();
        drinks.add("Pepsi");
        drinks.add("Coke");
        drinks.add("Martini");
        drinks.add("Mojito");
        drinks.add("Daiquiri");
        drinks.add("Mimosa");
        drinks.add("Maitai");

        Iterator<String> iterator=drinks.iterator();
        while(iterator.hasNext()){
            String drink =iterator.next();
            if (drink.contains("a")  || drink.contains("e")){
                System.out.println("water");
            }else{
                System.out.println(drink);
            }
        }

    }
}
