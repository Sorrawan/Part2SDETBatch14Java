package class28;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ExcelDemo1 {
    public static void main(String[] args) throws IOException {
        //we need to know path of the file
        //R.click"Testtest.xlsx" > copy path > Path from content root
        String path="Data/Testtest.xlsx";
        //Navigate to this path
        FileInputStream fileInputStream=new FileInputStream(path);

        //That special that can handle the xlsx files
        XSSFWorkbook excelFile=new XSSFWorkbook(fileInputStream);
        Sheet sheet=excelFile.getSheet("Sheet1");   //Require the name of the sheet in excel file you wanna open
        Row row0= sheet.getRow(0);
        System.out.println(row0.getCell(0));   //FirstName

        //Get the data from Row1
        Row row1= sheet.getRow(1);
        System.out.println(row1.getCell(0));    //Rome

    }
}
