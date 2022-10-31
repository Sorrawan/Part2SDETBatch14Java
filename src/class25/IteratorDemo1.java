package class25;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorDemo1 {
    public static void main(String[] args) {
        ArrayList<String> beautyProducts=new ArrayList<>();
        beautyProducts.add("Blush");
        beautyProducts.add("Base");
        beautyProducts.add("Mascara");
        beautyProducts.add("lipstick");
        beautyProducts.add("Dove Soap");
        beautyProducts.add("Conditioner");
        beautyProducts.add("shampoo");
        beautyProducts.add("lotion");
        beautyProducts.add("concealer");
        beautyProducts.add("eyeLinear");

        Iterator<String> iterator=beautyProducts.iterator();

        //Using while loop is perfect for this situation, it will keep looping until find the result
        while (iterator.hasNext()){
            String item=iterator.next(); //Getting the element and storing the elements inside and use it
            if (item.endsWith("r")){
                iterator.remove();
            }
        }
        System.out.println(beautyProducts);   //No output that endwith "r"
    }
}
