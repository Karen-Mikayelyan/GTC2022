package chapters.lesson22.fileExample.fileExample;

import java.io.*;

public class DataIOStream {

    private static final String FILE_PATH = "C:\\Users\\Admin\\IdeaProjects\\GTC2022\\src\\chapters\\lesson22\\fileExample\\fileExample\\ioExamples\\file\\example.txt";

    public static void main(String[] args) throws IOException {
        write();
        read();
    }

    private static void write() throws IOException {
        DataOutputStream out = new DataOutputStream(new FileOutputStream(FILE_PATH));
        out.writeInt(543);
        out.writeBoolean(true);
        out.close();

    }

    private static void read() throws IOException {
        DataInputStream inputStream = new DataInputStream(new FileInputStream(FILE_PATH));
        System.out.println(inputStream.readInt());
        System.out.println(inputStream.readBoolean());

        inputStream.close();

    }

}
