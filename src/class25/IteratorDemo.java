package class25;

import java.util.ArrayList;
import java.util.Iterator;

//งง Iterator
public class IteratorDemo {
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

        Iterator<String> iterator =beautyProducts.iterator();
        System.out.println(iterator.hasNext());
        System.out.println(iterator.next());   //It gives us the item and also removes the items from iterator
        System.out.println(iterator.hasNext());   //checking is there any items next?
        iterator.next();
        iterator.next();
        System.out.println(iterator.next());

        /*
         while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
         */
    }
}
