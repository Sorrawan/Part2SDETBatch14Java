package class29;

import class27.Dog;
import utils.ExcelReader;

import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.Map;

public class MethodsDemo {
    //Create Method of Dog class
    public static Dog returnDog(){    //"Dog" : class name in Class27
        return new Dog("Fuff","green","German");
    }
    //Create the method that return Map
    public static Map<String,String> getMap(){
        Map<String,String> map=new LinkedHashMap<>();
        map.put("Apple","Mango");

        return map;
    }

    public static void main(String[] args) throws IOException {

        //Call the method
        Dog dog=returnDog();
        System.out.println(dog);

        System.out.println(getMap());

        var data=  ExcelReader.read("Data/Testtest.xlsx");
        System.out.println(data.get(1));  //Wannna get the data from Row1
        Map<String,String> map=data.get(2);
        System.out.println(map.get("Age"));

    }
}
