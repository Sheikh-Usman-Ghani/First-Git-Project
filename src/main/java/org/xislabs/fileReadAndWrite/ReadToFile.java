package org.xislabs.fileReadAndWrite;

import java.io.FileReader;
import java.io.IOException;

public class ReadToFile {
    public static void main(String[] args) {

        try {
            FileReader fileReader = new FileReader("C:\\Users\\ADMIN\\Desktop\\TestFile.txt");
            try {
                int i;
                while ((i = fileReader.read()) != -1) {
                    System.out.print((char) i);
                }

            } finally {
                fileReader.close();
                System.out.println("\nFile closed");
            }
        } catch (IOException e) {
            System.out.println(e);

        }
    }
}
