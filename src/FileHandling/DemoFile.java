package FileHandling;

import java.io.File;

public class DemoFile {

    public static void main(String[] args) {
        File file = new File("C:\\Java File Handling\\sample.txt");

        try
        {
            if(file.createNewFile())
            {
                System.out.println("File Created: " +file.getName());
            }
            else
            {
                System.out.println("File already exists");
            }
            System.out.println("File path: "+file.getAbsoluteFile());
            System.out.println("File can be read or not:"+file.canRead());
            System.out.println("File can be write or not:"+ file.canWrite());
            System.out.println("File is existing or not:"+file.exists());
            System.out.println("File length:"+file.length());
           // System.out.println("File is deleted or not:"+file.delete());

        }
catch (Exception e)
{
    e.printStackTrace();
}
    }
}
