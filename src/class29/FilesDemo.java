package class29;
//Related to ConfigReader class in Utils
//Related to ExcelReader class in Utils
import utils.ConfigReader;
import utils.ExcelReader;

import java.io.IOException;

public class FilesDemo {
    public static void main(String[] args) throws IOException {

        //Want to read "browser" from the properties file
        String path="Data/config.properties";    //Get the path
        var properties=  ConfigReader.read(path);     //Call the method from "ConfigReader class in Utils"
        System.out.println(properties.getProperty("browser"));

        //Want to Read the data from Excel file
        String excelPath="Data/Testtest.xlsx";
        var excelData=  ExcelReader.read(excelPath);  ////Call the method from "ExcelReader class"
        System.out.println(excelData);

    }
}
