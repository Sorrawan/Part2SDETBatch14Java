package class27;

import java.util.HashMap;

public class MapDemo1 {
    public static void main(String[] args) {
        //Want to store
        HashMap<String,Double> fruit=new HashMap<>();
        fruit.put("Apple",1.99);   //to store the values in a map
        fruit.put("Mango",2.99);
        fruit.put("Orange",4.99);
        fruit.put("Banana",10.1);

        System.out.println(fruit);   //{Apple=1.99, Mango=2.99, Orange=4.99, Banana=10.1}
        System.out.println(fruit.get("Orange"));   //4.99
        fruit.remove("Mango");  //Delete this key ans its value from the map
        System.out.println(fruit);  //{Apple=1.99, Orange=4.99, Banana=10.1} => Mango will be romoved.

        System.out.println( fruit.containsKey("Apple"));   //true    //Tell us if a keay is present inside the map or not
        System.out.println( fruit.containsKey("Kiwi"));    //False
        System.out.println( fruit.containsValue(4.99));     //true   //Searches the map fpr this value
        System.out.println(fruit.isEmpty());                //False

        fruit.replace("Apple",2.9);
        System.out.println(fruit);   //{Apple=2.9, Orange=4.99, Banana=10.1}

    }
}
