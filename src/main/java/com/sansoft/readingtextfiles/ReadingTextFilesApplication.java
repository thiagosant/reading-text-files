package com.sansoft.readingtextfiles;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

@SpringBootApplication
public class ReadingTextFilesApplication {

    public static void main(String[] args) {
        SpringApplication.run(ReadingTextFilesApplication.class, args);

        File file = new File("C:\\temp\\in.txt");

        Scanner input = null;

        try{
            input = new Scanner(file);
            while (input.hasNextLine()){
                System.out.println(input.nextLine());
            }
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
        finally {
            if (input != null) input.close();
        }
    }

}
