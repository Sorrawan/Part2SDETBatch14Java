package class27;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class MapDemo4 {
    public static void main(String[] args) {
        HashMap<String,Double> fruit=new HashMap<>();
        fruit.put("Apple",1.99);   //to store the values in a map
        fruit.put("Mango",2.99);
        fruit.put("Orange",4.99);
        fruit.put("Banana",10.1);

        //Get only the key from the map in the form of the set
       /*
        Set<String> allKeys=fruit.keySet();  //Calling the method call "Keyset" that we will Get all the keys in the form of a set

        System.out.println(allKeys);        //[Apple, Mango, Orange, Banana]

        Iterator<String> iterator= allKeys.iterator();    //Getting an itetator on that set //<String>  => All keys are String
        while (iterator.hasNext()){
            String item= iterator.next();
            if (item.contains("n")){
                iterator.remove();
            }
        }
        */

        //OR
        fruit.keySet().removeIf(x->x.contains("n"));

        //Get the same result
        System.out.println(fruit);   // {Apple=1.99}
    }
}
