package org.xislabs.fileReadAndWrite;

import java.io.FileWriter;
import java.io.IOException;

public class AppendToBottom {
    public static void main(String[] args) {
        try {
            FileWriter myWriter = new FileWriter("C:\\Users\\ADMIN\\Desktop\\TestFile.txt",true);
            try {
                myWriter.write("Stop");
            } finally {
                myWriter.close();
            }
            System.out.println("Data appended to the bottom of file successfully..");
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}