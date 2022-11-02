package class25;

import java.util.ArrayList;

public class Hw1ArrayListRemove {
    /*
    Create an arrayList of words. Remove every word that ends with “e”.
     */
    public static void main(String[] args) {
        ArrayList<String> words=new ArrayList<>();
        words.add("cat");
        words.add("eagle");
        words.add("fish");
        words.add("whale");
        words.add("fox");
        words.add("goat");

        for (int i = 0; i < words.size() ; i++) {
            if(words.get(i).endsWith("e")){
                words.remove(i);
            }
        }
        System.out.println(words);
    }
}
