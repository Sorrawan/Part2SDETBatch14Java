package class26;
//ไม่สำคัญ
import java.util.LinkedList;

public class ArraylistVsLinkedList {
    public static void main(String[] args) {

        //Just to find out How efficient your code is
        LinkedList<String> linkedList=new LinkedList<>();

        long startTime=System.currentTimeMillis();
        for (int i = 0; i < 10; i++) {
            linkedList.add(0,"Test");



        }
    }
}
