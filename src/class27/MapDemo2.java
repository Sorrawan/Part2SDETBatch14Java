package class27;

import java.util.LinkedHashMap;

public class MapDemo2 {
    public static void main(String[] args) {
        LinkedHashMap<String, Double> beautyProduct=new LinkedHashMap<>();
        beautyProduct.put("Foundation",50.5);
        beautyProduct.put("Blush",20.0);
        beautyProduct.put("Lipstick",10.5);

        LinkedHashMap<String,Double> cosmetics=new LinkedHashMap<>();
        cosmetics.put("Soap",10.2);
        cosmetics.put("conditioner",20.5);
        cosmetics.put("Shampoo",30.99);

        LinkedHashMap<String,Double> grocery=new LinkedHashMap<>();
        grocery.putAll(beautyProduct);
        System.out.println(grocery);   //{Foundation=50.5, Blush=20.0, Lipstick=10.5}
        grocery.putAll(cosmetics);
        System.out.println(grocery);   //{Foundation=50.5, Blush=20.0, Lipstick=10.5, Soap=10.2, conditioner=20.5, Shampoo=30.99}
        //grocery.remove(beautyProduct);    Does not work, we can't remove all entire for the map
        grocery.clear();  //Delete everything
        System.out.println(grocery);     //{}

    }
}
