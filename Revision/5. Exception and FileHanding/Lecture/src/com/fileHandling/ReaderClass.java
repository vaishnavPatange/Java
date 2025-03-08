package com.fileHandling;

import java.io.FileReader;
import java.io.IOException;

public class ReaderClass {
        public static void main(String[] args) {
                String fileName  = "Writer.txt";

                try(FileReader read = new FileReader(fileName)){
                        int character;
                        do {
                                character = read.read();
                                if(character != -1) System.out.print((char) character);
                        } while (character != -1);
                } catch (IOException e){
                        System.out.println("Exception occurred: " + e.getMessage());
                }

        }
}
