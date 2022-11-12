package class28;
//Related to Config.properties in Data folder,
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class FileDemo1 {
    public static void main(String[] args) throws IOException {
        //Data folder > Rclick "Config.properties" >copy Path/Reference > path from content Root
        //then will get "Data/config.properties"
        String path="Data/config.properties";   //Location of the file
        var fileInputStream=new FileInputStream(path); //it helps us Navigate to the file  //This line open the File
        var properties=new Properties();  //that special software which helps us read data from that file
        properties.load(fileInputStream);  //loads all the data from the file inside(Memory)
        System.out.println(properties.getProperty("URL"));
        System.out.println(properties.getProperty("password"));
        fileInputStream.close();   //Close the file



    }
}
