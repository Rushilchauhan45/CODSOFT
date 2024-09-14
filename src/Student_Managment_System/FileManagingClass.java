package Student_Managment_System;

import java.io.*;
import java.util.ArrayList;

public class FileManagingClass
{
    public static void SaveStudentsAtFile(ArrayList<Student> students, String filename)
    {
        try(ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(filename)))
        {
            out.writeObject(students);
            System.out.println("------------------------------------------");
            System.out.println("Students Data Sucessfully Saved to File..!");
            System.out.println("------------------------------------------");
        }catch (IOException e)
        {
        	System.out.println("--------------------------------------------------------------");
        	System.out.println("Error Saving Students to File: " + e.getMessage());
        	System.out.println("--------------------------------------------------------------");
        }
    }//student Data Saver Class

    public static ArrayList<Student> loadStudentsFromFile(String filename)
    {
        ArrayList<Student> students = new ArrayList<>();
        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream(filename)))
        {
            students = (ArrayList<Student>) in.readObject();
            System.out.println("------------------------------------");
            System.out.println("Students data loaded from file.....!");
            System.out.println("------------------------------------");
        } catch (IOException | ClassNotFoundException e)
        {
        	System.out.println("-----------------------------------------------------------");
            System.out.println("Error Loading Students From File: " + e.getMessage());
            System.out.println("-----------------------------------------------------------");
        }
        return students;
    }//student data loader class
}//main class ending
