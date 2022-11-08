package reviewclass12;

import org.apache.commons.math3.analysis.polynomials.PolynomialSplineFunction;

import java.util.Objects;
import java.util.regex.PatternSyntaxException;

//Related to ListDemoWithCustomClass
public class Student {
    private  String firstname;
    private  String lastName;
    private  String rollNumber;

    public Student(String firstname, String lastName, String rollNumber) {
        this.firstname = firstname;
        this.lastName = lastName;
        this.rollNumber = rollNumber;

    }

    void printName(){
        System.out.println(firstname+lastName);
    }

    //**********Always override "toString" and "equals" method in our custom classes then
    //Most of the collection framework will not work properly with those classes*********
    @Override
    public String toString() {
        return "Student{" +
                "firstname='" + firstname + '\'' +
                ", lastName='" + lastName + '\'' +
                ", rollNumber='" + rollNumber + '\'' +
                '}';
    }
    //IF we dont oveeride this method Java by default checks the address only
    //to figure out if two objects are same or not
    //type = eq => choose  (generate via...) . Next > Next >Next
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return Objects.equals(firstname, student.firstname) && Objects.equals(lastName, student.lastName) && Objects.equals(rollNumber, student.rollNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstname, lastName, rollNumber);
    }
}