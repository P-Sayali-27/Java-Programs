package FileHandling;

import java.io.FileReader;

public class ReadFile {

    public static void main(String[] args) {
        try {
            FileReader file = new FileReader("C:\\Java File Handling\\Sample.txt");
           int c;
            while((c=file.read()) != -1){
                System.out.println((char) c);
            }
            file.close();
        }
        catch (Exception e) {
            e.printStackTrace();

        }

    }
}
