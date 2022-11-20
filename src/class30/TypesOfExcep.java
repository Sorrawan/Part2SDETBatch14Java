package class30;
//จดไม่เสร็จ

import utils.ExcelReader;

import java.io.IOException;

public class TypesOfExcep {
    public static void main(String[] args) {
        String name=null;
        if(name!=null){
            System.out.println(name.length());
        }

        int [] arr=new int[5];
        int index=10;
        try {
            System.out.println(arr[index]);
        }catch (Exception e){
            System.out.println("Josh please fix your issues you never write good code");
        }

        if(index<arr.length){
            System.out.println(arr[index]);
        }


//Click "Surround with trycatch"
        try {
            System.out.println(ExcelReader.read("/Users/apple/IdeaProjects/SDETBatch14Java/Data/Test.xlsx"));
        } catch (IOException e) {
            System.out.println("Error");   //ใส่เพื่อบอกDeveloper ว่ามันerrorตรงนี้Baily#0983

          //  throw new RuntimeException(e);
        }


    }
}
