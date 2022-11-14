package class29;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedHashMap;

public class ReadingExcelFileDemo1 {
    public static void main(String[] args) throws IOException {

        //Location of the file on your HardDrive where file is stored.
        String path="Data/Testtest.xlsx";
        // Reads the data from HardDrive brings it to RAM in the raw form 10101010101010
        // In simple words we can say computer has navigated to that file
        FileInputStream fis=new FileInputStream(path);
        // "XSSFWorkbook"=> this class converts the raw bytes to Excel format or in simple words it is that special software
        // that helps us read and write data to an Excel file.
        XSSFWorkbook excel=new XSSFWorkbook(fis);
        //Get to the "Sheet" that contains our data we want to open.
        Sheet sheet= excel.getSheet("Sheet1");

        //Want to get all the data from the Excel file
        int noOfRow=sheet.getPhysicalNumberOfRows();  //We have to find out how many row of data in that sheet
        // getting the first row so that we can use it as keys for our map
        //becuase 1st Row(index:0) contains = FirstName,LastName,Age,Salary that we will use as a "Key" for Map
        Row headerRow= sheet.getRow(0);

        //Want to store map inside the List
        ArrayList<LinkedHashMap<String,String>> excelData=new ArrayList<>(); // a list that can hold maps

        // A loop that goes through all the rows that contain the data.
        for (int rowNo = 1; rowNo < noOfRow; rowNo++) {
            // the Map that will store the data for each row
            LinkedHashMap<String,String> rowMap=new LinkedHashMap<>();
            // get a dataRow from sheet one by one through loop bcuz for each row we need a new map
            Row dataRow=sheet.getRow(rowNo);
            // getting the count of how many cells contain the data
            int noOfCell=dataRow.getPhysicalNumberOfCells();
            // A loop to go through all the cells
            for (int cellNo = 0; cellNo < noOfCell; cellNo++) {

                //getting keys from header row and values from data row
                String key=headerRow.getCell(cellNo).toString();
                String value=dataRow.getCell(cellNo).toString();
                rowMap.put(key,value);
            }
            //each loop will store each Row info inform of(map1,map2,map3,map4,map5,map6)
            //ex. Map1 : FirstName,LastName,Age,Salary of Rome
            //ex. Map2 :FirstName,LastName,Age,Salary Of Afsar
            //Want to store map inside the List
            //Using "add" because we create "ArrayList<LinkedHashMap<String,String>> excelData=new ArrayList<>();"
            excelData.add(rowMap);
            // System.out.println(rowMap);

        }
        System.out.println(excelData);



    }
}
