package FileHandling;

import java.io.FileWriter;
import java.io.IOException;

public class WriteFile {

    public static void main(String[] args) {
        try {
            FileWriter file = new FileWriter("C:\\Java File Handling\\Sample.txt");

            file.write("Hi, I am writing to the file!");
            file.close();
            System.out.println("Successfully written to the file");
        }
        catch (IOException e){
            System.out.println("An error occured");
            e.printStackTrace();
        }
        }
    }


