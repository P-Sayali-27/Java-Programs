package FileHandling;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {

    public static void main(String[] args) throws IOException {
        FileInputStream file = new FileInputStream("C:\\Users\\A\\IdeaProjects\\JavaProj\\src\\Config.properties");
        Properties p = new Properties();
        p.load(file);
         String url = p.getProperty("url");
         String apiurl = p.getProperty("api.url");

        System.out.println("url: " +url);
        System.out.println("Api url: "+ apiurl);
 file.close();
    }
}
