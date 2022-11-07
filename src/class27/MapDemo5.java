package class27;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;

public class MapDemo5 {
    public static void main(String[] args) {
        HashMap<String,Double> fruit=new HashMap<>();
        fruit.put("Apple",1.99);   //to store the values in a map
        fruit.put("Mango",1.99);
        fruit.put("Orange",4.99);
        fruit.put("Banana",10.1);

        //Remove all the value from this map if the price of item > $2
        //We wanna get "Value" first


        Collection<Double> values=fruit.values();  //returns all the values from a map


        //Get an itetator over the collection
        Iterator<Double> iterator=values.iterator();

        while (iterator.hasNext()){
            Double value= iterator.next();
            if(value>2){
                iterator.remove();
            }
        }
        System.out.println(fruit);   //{Apple=1.99, Mango=1.99}

                                        //OR
        //*******  SAME RESULT as code from Line19-31 *******
        //"x" => stand for each value 1.99,1.99,4.99,10.1 then Java will use them to compare if x>2 or not
       // fruit.values().removeIf(x->x>2);
        // System.out.println(fruit);     //{Apple=1.99, Mango=1.99}

    }
}
