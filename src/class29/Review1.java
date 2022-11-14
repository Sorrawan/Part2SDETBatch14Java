package class29;

import utils.ExcelReader;

import java.io.IOException;

public class Review1 {
     /*
    we wanted to read data from files  (Book1.xlsx) and Use"method from ExcelReader"
     */

    public static void main(String[] args) throws IOException {

        String path="Data/Book1.xlsx";
        var data=  ExcelReader.read(path);

       /* Map<String ,String> row1=data.get(0);
        System.out.println(row1.get("Name"));*/   //Adam

   /*     for (var row:data
             ) {
            System.out.println(row);
        }*/
        System.out.println(data);

    }
}
