package org.xislabs.fileReadAndWrite;

import java.io.File;

public class FileInfo {
    public static void main(String[] args) {
        File file = new File("C:\\Users\\ADMIN\\Desktop\\TestFile.txt");

        if (file.exists()) {
            System.out.println("File Name: " + file.getName());
            System.out.println("File Location: " + file.getAbsoluteFile());
            System.out.println("File Writeable: " + file.canWrite());
            System.out.println("File Readable: " + file.canRead());
            System.out.println("File Size: " + file.length());


        } else {
            System.out.println("File does not exist");


        }
    }
}
