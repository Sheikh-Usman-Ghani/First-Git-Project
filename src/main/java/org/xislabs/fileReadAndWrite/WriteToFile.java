package org.xislabs.fileReadAndWrite;

import java.io.FileWriter;
import java.io.IOException;


public class WriteToFile {
    public static void main(String[] args) {


//       Using FileWriter
        try {
            FileWriter myWriter = new FileWriter("C:\\Users\\ADMIN\\Desktop\\TestFile.txt");
            try {
                myWriter.write("This is an example file\n");
                myWriter.write("This is the 2nd line\n");
                myWriter.write("This is the 3rd line");
            } finally {
                myWriter.close();
            }
            System.out.println("Data save to the file successfully.");
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}


////       Using PrintWriter
//        try {
//            FileWriter myWriter = new FileWriter("C:\\Users\\ADMIN\\Desktop\\TestFile2.txt");
//            PrintWriter printWriter = new PrintWriter(myWriter);
//
//            printWriter.println("This is an example file111");
//            printWriter.println("This is the 2nd line");
//            printWriter.close();
//
//            System.out.println("Data save to the file successfully.");
//        } catch (IOException e) {
//            System.out.println("e");
//        }
//
//
////       Using BufferedWriter
//        String filePath = "C:\\Users\\ADMIN\\Desktop\\TestFile3.txt";
//        try (
//                BufferedWriter writer = new BufferedWriter(new FileWriter(filePath))) {
//            writer.write("This is an example file111\n");
//            writer.write("This is the 2nd line");
//            System.out.println("Data save to the file successfully.");
//        } catch (IOException e) {
//            System.out.println(e);
//        }
//
//
//        String filePath2 = "C:\\Users\\ADMIN\\Desktop\\TestFile4.txt";
////       Using FileOutputStream
//        try (FileOutputStream fos = new FileOutputStream(filePath2)) {
//            String data = "This is an example file111\n" +
//                    "This is the 2nd line";
////       Convert the string to bytes
//            fos.write(data.getBytes());
//            System.out.println("Data save to the file successfully.");
//        } catch (IOException e) {
//            System.out.println(e);
//        }
//    }
//
//}