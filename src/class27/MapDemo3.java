package class27;
//จดไม่เสร็จ

import java.util.HashMap;
import java.util.Set;

public class MapDemo3 {
    public static void main(String[] args) {
        HashMap<String,Double> fruit=new HashMap<>();
        fruit.put("Apple",1.99);   //to store the values in a map
        fruit.put("Mango",2.99);
        fruit.put("Orange",4.99);
        fruit.put("Banana",10.1);
        fruit.put("Banana",12.0);  // can store the Duplicate but can't recall, then the previous one will be removed
                                    // **The key need to be Unique


        System.out.println(fruit);// {Apple=1.99, Mango=2.99, Orange=4.99, Banana=12.0}=> It replace the old"Banana"
        System.out.println(fruit.get("Banana"));  //12.0  will get the new one

        Set<String> keySet=fruit.keySet();   //Returns all the keys in the form of set
        System.out.println(keySet);   //[Apple, Mango, Orange, Banana] =>  will get only all Keyset in map

        var Values =fruit.values();  //
        System.out.println(Values);     //[1.99, 2.99, 4.99, 12.0]


    }
}
