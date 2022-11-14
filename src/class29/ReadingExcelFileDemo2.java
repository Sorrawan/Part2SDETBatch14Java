package class29;

import utils.ExcelReader;

import java.io.IOException;

//Related to Utils package, ExcelReader class
//อ่านข้อมูลจากUtils package, ExcelReader class ที่มี Methodไว้แล้ว,
// Call method to Read data from Excel file

public class ReadingExcelFileDemo2 {
    public static void main(String[] args) throws IOException {

        var excelData=   ExcelReader.read("Data/Testtest.xlsx");
        System.out.println(excelData);

    }
}

