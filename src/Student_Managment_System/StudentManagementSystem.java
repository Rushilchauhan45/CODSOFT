package Student_Managment_System;

import java.util.ArrayList;

public class StudentManagementSystem
{
	    private ArrayList<Student> students;
	
	    public StudentManagementSystem()
	    {
	        this.students = new ArrayList<>();
	    }//Public Constructor
	
	    public void addStudent(Student student)
	    {
	        students.add(student);
	        System.out.println("----------------------------------");
	        System.out.println("Student Added Successfully....!!");
	        System.out.println("----------------------------------");
	    }//Add method
	
	    public void removeStudent(String rollNumber)
	    {
	        boolean found = false;
	        for (Student student : students)
	        {
	            if (student.getRollNumber().equals(rollNumber))
	            {
	                students.remove(student);
	                
	                System.out.println("-----------------------------------");
	                System.out.println("Student removed successfully.....!!");
	                System.out.println("-----------------------------------");
	                found = true;
	                break;
	            }
	        }//end of inner loop
	        if (!found)
	        {
	            System.out.println("Student not found with Roll Number: " + rollNumber);
	        }
	    }//ReMove Method
	
	    public Student searchStudent(String rollNumber)
	    {
	        for (Student student : students)
	        {
	            if (student.getRollNumber().equals(rollNumber))
	            {
	                return student;
	            }
	        }
	        return null;
	    }//Search Method
	
	    public void displayAllStudents()
	    {
	        if (students.isEmpty())
	        {
	            System.out.println("---------------------------------------------------");
	            System.out.println("Sorry ..No Any Students Record in the System.....!!");
	            System.out.println("---------------------------------------------------");
	        }else
	        {
	            System.out.println("---------------------------------------------------");
	            System.out.println(String.format("%-20s %-15s %-10s", "Name", "Roll Number", "Grade"));
	            System.out.println("---------------------------------------------------");
	            for (Student student : students)
	            {
	                // Using String.format() to ensure consistent spacing between columns
	                System.out.println(String.format("%-20s %-15s %-10s",student.getName(),student.getRollNumber(),student.getGrade()));
	            }
	            System.out.println("---------------------------------------------------");
	        }
	    }//Display Method
	    
}//end of main class
