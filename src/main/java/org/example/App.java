package org.example;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws IOException {
        //create dir
        File newObject = new File("C:/Users/karin/IdeaProjects/Homework-16/newObject");
        if (newObject.mkdir()) {
            System.out.println("Directory created");
        }else{
            System.out.println("Directory cannot be created or already exists");
        }
        //create & write to the file
        try {
            FileWriter myWriter = new FileWriter("C:/Users/karin/IdeaProjects/Homework-16/newObject/example.txt");
            myWriter.write("Example string");
            myWriter.close();
            System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
        //delete the file
        String filename = "C:/Users/karin/IdeaProjects/Homework-16/newObject/example.txt";
        try {
            Files.delete(Paths.get(filename));
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
