package class28;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapsDemo5 {
    public static void main(String[] args) {
        HashMap<String,Double> items=new HashMap<>();
        items.put("Iphone 14",1000.0);
        items.put("Eggs",2.40);
        items.put("Apples",5.0);
        items.put("Keyboard",100.0);
        items.put("Flower",1.0);


        //"entrySet" => return a set of entry
        //Set<Map.Entry<String,Double>> entrySet=items.entrySet();
                //OR
        var entrySet=items.entrySet();
        System.out.println(entrySet);  //[Apples=5.0, Flower=1.0, Keyboard=100.0, Iphone 14=1000.0, Eggs=2.4]

        for (var item:entrySet
             ) {
            System.out.println(item.getKey()+" "+item.getValue());
        }



    }
}
