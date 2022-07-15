package chapters.lesson22.fileExample.fileExample;

import java.io.*;

public class FileReadAndWrite {

    private static final String FILE_PATH = "C:\\Users\\Admin\\IdeaProjects\\GTC2022\\src\\chapters\\lesson22\\fileExample\\fileExample\\ioExamples\\file\\example.txt";


    public static void main(String[] args) throws IOException {
//        write();
        read();
    }

    private static void write() throws IOException {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(FILE_PATH))) {
            bw.write("H e llo From JAVA \n");
            bw.write("Hello From JAVA line 2!!!!!!!!!!!!!");
        }


    }

    private static void read() {
        try (BufferedReader inputStream = new BufferedReader(new FileReader(FILE_PATH))) {
//            String line = "";
//            while ((line = inputStream.readLine()) != null) {
//                System.out.println(line);
//            }

            int c;
            int aCount = 0;
            while ((c = inputStream.read()) != -1) {
                char a = (char) c;
                if(a == 'a') {
                    aCount++;
                }
                System.out.print(a);
            }
            System.out.println("aCount = " + aCount);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}


