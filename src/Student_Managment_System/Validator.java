package Student_Managment_System;

//The Input Validator Class 
public class Validator
{

    public static boolean validateStudentInput(String name, String rollNumber, String grade)
    {
        if (name == null || name.isEmpty() || rollNumber == null || rollNumber.isEmpty() || grade == null || grade.isEmpty()) {
            System.out.println("Input cannot be empty. Please try again.");
            return false;
        }
        return true;
    }//end 
}//end of main  class
