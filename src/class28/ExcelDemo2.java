package class28;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ExcelDemo2 {
    public static void main(String[] args) throws IOException {
        String path="Data/Testtest.xlsx";
        FileInputStream fileInputStream=new FileInputStream(path);
        XSSFWorkbook excel=new XSSFWorkbook(fileInputStream);
        Sheet sheet=excel.getSheet("Sheet1");  //Make sure "import org.apache.poi.ss.usermodel.Sheet;"
        int noOfRows= sheet.getPhysicalNumberOfRows();  // returns how many rows in actual contains the data in sheet
        //System.out.println(noOfRows);  //6   => THere are 6 rows that contain in data

        for (int i = 0; i < noOfRows; i++) {
            Row row= sheet.getRow(i);
            int noOfCell=row.getPhysicalNumberOfCells();   //returns the total no.of cells that contain the data
            for (int j = 0; j < noOfCell; j++) {
                Cell cell=row.getCell(j);
                System.out.print(cell+" ");
            }
            System.out.println();
        }


    }
}
