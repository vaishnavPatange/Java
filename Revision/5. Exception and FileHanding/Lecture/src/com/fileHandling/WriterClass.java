package com.fileHandling;

import java.io.FileWriter;
import java.io.IOException;

public class WriterClass {
        public static void main(String[] args) {
                String fileName  = "WriterClassFile.txt";

                try(FileWriter writer = new FileWriter(fileName)) { // this method is called Try with resource
                        writer.write("Hello, This file is created using Java File writer class");
                        for (int i = 0; i < 10000; i++) {
                                if(i % 50 == 0) writer.write("\n");
                                writer.write('&');
                        }
                        writer.flush();
                        System.out.println("File Created successfully");
                } catch (IOException e) {
                        System.out.println(e.getMessage());
                }

        }
}
