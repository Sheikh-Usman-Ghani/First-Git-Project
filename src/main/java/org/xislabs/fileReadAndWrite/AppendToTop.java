package org.xislabs.fileReadAndWrite;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class AppendToTop {
    public static void main(String[] args) {
        String filePath = "C:\\Users\\ADMIN\\Desktop\\TestFile.txt";
        String newData = "Start";

        try {
            FileReader fr = new FileReader(filePath);
            BufferedReader br = new BufferedReader(fr);
            StringBuilder sb = new StringBuilder();
            String line = br.readLine();
            while (line != null) {
                sb.append(line).append(System.lineSeparator());
                line = br.readLine();
            }
            br.close();
            fr.close();

            FileWriter fw = new FileWriter(filePath);
            fw.write(newData + System.lineSeparator() + sb.toString());
            fw.close();

            System.out.println("Data appended to the top of file successfully.");
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}