package Student_Managment_System;

import java.util.Scanner;

import java.util.Scanner;

//TestApp Class For Serve all Services
public class TestApp
{

    public static void main(String[] args)
    {
        StudentManagementSystem sms = new StudentManagementSystem();
        Scanner sc = new Scanner(System.in);
        int choice;

        do{
        	System.out.println("------------------------------------");
            System.out.println("\n|    Student Management System    |");
            System.out.println("------------------------------------");
            System.out.println("[1] Add Student");
            System.out.println("[2] Remove Student");
            System.out.println("[3] Search Student");
            System.out.println("[4] Display All Students");
            System.out.println("[5] Exit");
            System.out.println("------------------------------------");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine(); // consume the newline

            switch (choice)
            {
                case 1:
                    // Case for Adding a student
                    System.out.print("Enter Name: ");
                    String name = sc.nextLine();
                    System.out.print("Enter Roll Number: ");
                    String rollNumber = sc.nextLine();
                    System.out.print("Enter Grade: ");
                    String grade = sc.nextLine();

                    Student student = new Student(name, rollNumber, grade);
                    sms.addStudent(student);
                    break;

                case 2:
                    // Case for Removing a student
                    System.out.print("Enter Roll of Student You want to Remove: ");
                    String removeRollNumber = sc.nextLine();
                    sms.removeStudent(removeRollNumber);
                    break;

                case 3:
                    // Case for Searching a student
                    System.out.print("Enter Roll Of Student You Want to Search: ");
                    String searchRollNumber = sc.nextLine();
                    
                    Student foundStudent = sms.searchStudent(searchRollNumber);
                    if (foundStudent != null)
                    {
                        System.out.println("Student Found At : " + foundStudent);
                    }else
                    {
                        System.out.println("Student Not Found...!!");
                    }
                    break;

                case 4:
                    // Case for Displaying all students
                    sms.displayAllStudents();
                    break;

                case 5:
                    // Exiting the application
                	System.out.println("--------------------------");
                    System.out.println("Exiting the application...");
                    System.out.println("--------------------------");
                    break;

                default:
                    System.out.println("Invalid choice.... Please Enter Valid Choice..!!");
                    break;
            }//end of switch Case
        }while (choice != 5);

        sc.close();//to close a File
    }//end of main  method
}//end of main class
