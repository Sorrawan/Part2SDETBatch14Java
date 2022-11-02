package class25;

import java.util.ArrayList;

public class Hw3ArrayListEvenNumber {
    /*
    Create an arrayList of even numbers from 1 to 500.
    Remove any number that is divisible by 5 from that arrayList.
     */

    public static void main(String[] args) {
        ArrayList<Integer>  numbers=new ArrayList<>();
        for (int i = 2; i <= 500; i+=2) {
            if(i%5!=0){
                numbers.add(i);
            }
        }
        System.out.println(numbers);
    }
}
