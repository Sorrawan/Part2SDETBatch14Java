package class26;

import java.util.ArrayList;
import java.util.Iterator;

public class Hw3AndAnswerArrayListEvenNumber {
     /*
    Create an arrayList of even numbers from 1 to 500.
    Remove any number that is divisible by 5 from that arrayList.
     */
     public static void main(String[] args) {
         ArrayList<Integer> numbers=new ArrayList<>();
         for (int i = 2; i <= 500; i=i+2) {
             numbers.add(i);
         }
         System.out.println(numbers);

         var it=numbers.iterator();

         while(it.hasNext()){
             Integer num= it.next();
             if(num%5==0){
                 it.remove();
             }
         }
         System.out.println(numbers);
     }



}
