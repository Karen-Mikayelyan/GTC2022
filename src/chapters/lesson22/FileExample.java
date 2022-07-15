package chapters.lesson22;

import java.io.File;
import java.io.IOException;

public class FileExample {

    static String filePath = "C:\\Users\\Admin\\IdeaProjects\\GTC2022\\src\\chapters\\lesson22\\fileExample\\testFolder\\hello.txt";

    public static void main(String[] args) throws IOException {
        File myFile = new File(filePath);
        System.out.println(myFile.exists());
        if (!myFile.exists()) {
            myFile.createNewFile();
            System.out.println(myFile.exists());
        }
        System.out.println("isFile " + myFile.isFile());
        System.out.println("isDirectory " + myFile.isDirectory());
        if (myFile.isDirectory()) {
            File[] files = myFile.listFiles();
            for (File file : files) {
                if (file.isDirectory()) {
                    System.out.println(file.getName());
                }
            }
        }

    }
}
