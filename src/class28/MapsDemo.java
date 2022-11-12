package class28;


import java.util.HashMap;
import java.util.Iterator;

public class MapsDemo {
    public static void main(String[] args) {
        HashMap<String,Double> items=new HashMap<>();
        items.put("Iphone 14",1000.0);
        items.put("Eggs",2.40);
        items.put("Apples",5.0);
        items.put("Keyboard",100.0);
        items.put("Flower",1.0);

        //Want to "Remove the items" if their price is more than 10
        //1. Using Lambda
        items.values().removeIf(price -> price>10);   //{Apples=5.0, Flower=1.0, Eggs=2.4}


                                //OR
        // 2. Using Iterator only for "Value"
        // 1st,we are getting a collection of values then a Iterator
        //first we are getting a collection of values then an Iterator
     /*      Iterator<Double> iterator=items.values().iterator(); //first we are getting a collection of values then an Iterator
        while (iterator.hasNext()){
            Double price=iterator.next();
            if(price>10){
                iterator.remove();
            }
        }*/

        System.out.println(items);
    }
}
