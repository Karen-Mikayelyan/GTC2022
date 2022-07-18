package homework.fileUtil;

import java.io.*;
import java.util.Scanner;

public class FileUtil {

    static String filePath = "C:\\Users\\Admin\\IdeaProjects\\GTC2022\\src\\homework\\fileUtil\\Java2022";
    private static Scanner scanner = new Scanner(System.in);
    public static File myFile = new File(filePath);

    public static void main(String[] args) throws IOException {
//        fileSearch();
//        contentSearch();
//        findLines();
//        printSizeOfPackage();
        createFileWithContent();
    }

    // 1
    //այս մեթոդը պետք է սքաններով վերցնի երկու string.
    // 1 - path թե որ ֆոլդերում ենք փնտրելու
    // 2 - fileName - ֆայլի անունը, որը փնտրում ենք։
    //Որպես արդյունք պտի ծրագիրը տպի true եթե կա էդ ֆայլը էդ պապկի մեջ, false եթե չկա։
    static void fileSearch() {

        System.out.println("please input fileDirectory");
        String fileDirectoryStr = scanner.nextLine();
        System.out.println("please input fileName");
        String fileName = scanner.next();
        if (myFile.getParent().equals(fileDirectoryStr) && myFile.getName().equals(fileName)) {
            System.out.println(myFile.exists());
        } else {
            System.out.println(false);
        }
    }

    // 2
    //այս մեթոդը պետք է սքաններով վերցնի երկու string.
    // 1 - path թե որ ֆոլդերում ենք փնտրելու
    // 2 - keyword - ինչ որ բառ
    // Մեթոդը պետք է նշված path-ում գտնի բոլոր .txt ֆայլերը, և իրենց մեջ փնտրի
    // մեր տված keyword-ը, եթե գտնի, պետք է տպի տվյալ ֆայլի անունը։
    static void contentSearch() throws IOException {
        System.out.println("please input path");
        String path = scanner.nextLine();
        System.out.println("please input keyword");
        String keyword = scanner.nextLine();
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            boolean b = filePath.endsWith(".txt");
            String text;
            text = reader.readLine();
            if (text.contains(keyword) && b) {
                System.out.println(myFile.getName());
            } else {
                System.out.println(false);
            }
        }


    }

    // 3
    //այս մեթոդը պետք է սքաններով վերցնի երկու string.
    // 1 - txtPath txt ֆայլի փաթը
    // 2 - keyword - ինչ որ բառ
    // տալու ենք txt ֆայլի տեղը, ու ինչ որ բառ, ինքը տպելու է էն տողերը, որտեղ գտնի էդ բառը։
    static void findLines() throws IOException {
        System.out.println("please input txtPath");
        String txtPath = scanner.nextLine();
        System.out.println("please input keyword");
        String keyword = scanner.nextLine();
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            boolean b = filePath.endsWith(".txt");
            String text;
            int line = 0;
            while ((text = reader.readLine()) != null) {
                if (text.contains(keyword)) {
                    line++;
                    System.out.println(line + ": " + text);
                }
            }
        }
    }


    // 4
    //այս մեթոդը պետք է սքաններով վերցնի մեկ string.
    // 1 - path թե որ ֆոլդերի չափն ենք ուզում հաշվել
    // ֆոլդերի բոլոր ֆայլերի չափսերը գումարում ենք իրար, ու տպում
    static void printSizeOfPackage() {
        System.out.println("please input pathFolder");
        String pathFolder = myFile.getPath();
        pathFolder = scanner.nextLine();
        if (myFile.isDirectory()) {
            File[] files = myFile.listFiles();
            int size = 0;
            for (File file : files) {
                size += file.length();
                System.out.println("size of all files: " + size);
            }

        }
    }

    //5
    //այս մեթոդը պետք է սքաններով վերցնի երեք string.
    // 1 - path պապկի տեղը, թե որտեղ է սարքելու նոր ֆայլը
    // 2 - fileName ֆայլի անունը, թե ինչ անունով ֆայլ է սարքելու
    // 3 - content ֆայլի պարունակությունը։ Այսինքն ստեղծված ֆայլի մեջ ինչ է գրելու
    // որպես արդյունք պապկի մեջ սարքելու է նոր ֆայլ, իրա մեջ էլ լինելու է content-ով տվածը
    static void createFileWithContent() throws IOException {
        System.out.println("please input folder path");
        String folderPath = scanner.nextLine();
        System.out.println("please input file name you want to create");
        String fileName = scanner.nextLine();
        System.out.println("please input the text you want to content");
        String content = scanner.nextLine();
        if (myFile.isDirectory()) {
            myFile.createNewFile();
        }
        BufferedWriter bw = new BufferedWriter(new FileWriter(filePath));
        bw.write(content);

        bw.close();

    }
}


