package reviewclass12;

import java.util.ArrayList;
import java.util.ListIterator;

public class ListsDemo {
    public static void main(String[] args) {
        // <> called=> generic  to put the type of the obj, we are going to store

        ArrayList<String>   animals=new ArrayList<>();
        animals.add("Dog"); //When we use the simple "add method" that takes one parameter elements are added
        animals.add("Cat");  //the end of the list
        animals.add("Lion");
        animals.add("Monkey");
        animals.add("Tiger");
        animals.add("Panda");
        animals.add("Horse");

        System.out.println(animals);
        // iter  => shortcut for writing "Loop" for you

        //length() is for String
        //size()  is for Arraylist
        for (String animal : animals) {
            System.out.println(animal.length());
        }

        // how can we remove words which have more than 4 letters?
        //  animals.removeIf(x->x.length()>4);
        //System.out.println(animals);

        /* if element is more than 4 letters we want to replace that with Camel
         1)we should not use iterator because we are not performing any operation that can change the size
        of the List
        we should not use enhanced for loop here as we are not printing the data we are updating the data
        as we need the index to update the data we should use simple for loop
         */

        for (int i = 0; i < animals.size(); i++) {
            if(animals.get(i).length()>4){
                animals.set(i,"Camel"); // set methods replaces the elements
            }
        }
        System.out.println(animals);


        System.out.println( animals.subList(0,3));
        ListIterator<String> stringListIterator = animals.listIterator();
        while (stringListIterator.hasNext()){
            System.out.println(stringListIterator.next());
        }
    }
}
