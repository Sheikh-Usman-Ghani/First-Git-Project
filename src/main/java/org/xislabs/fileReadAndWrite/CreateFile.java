package org.xislabs.fileReadAndWrite;

import java.io.File;
import java.io.IOException;

public class CreateFile {
    public static void main(String[] args) throws IOException{

            File file = new File("C:\\Users\\ADMIN\\Desktop\\TestFile.txt");
            if (file.createNewFile()) {
                System.out.println("File Successfully Create");
            } else {
                System.out.println("File Already Exists");
            }
    }
}
