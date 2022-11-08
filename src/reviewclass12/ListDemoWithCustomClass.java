package reviewclass12;
//จดไม่เสร็จ

import java.util.ArrayList;

public class ListDemoWithCustomClass {
    public static void main(String[] args) {
        ArrayList<Student> students=new ArrayList<>();
        students.add(new Student("Josh","Plantin","123"));
        students.add(new Student("Adam","Park","123"));
        students.add(new Student("Yusuf","Engin","123"));
        students.add(new Student("Cam","Jo","123"));

        System.out.println(students);

        //

        for (Student student : students) {
            student.printName();
        }

        Student student=new Student("Josh","Plantin","123");
        System.out.println(students.contains(students));  // will work proper until you have >//type = eq => choose  (generate via...) . Next > Next >Next
        //Then you weill get "true" as an answer

      //  System.out.println(joshAgain);
        System.out.println(students);
    }
}
