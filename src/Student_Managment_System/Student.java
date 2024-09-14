package Student_Managment_System;


//Public Student Class For Implemenmt Getter And Setter Methods
public class Student
{
	    private String name;
	    private String rollNumber;
	    private String grade;
	
	    //Class Constructor
	    public Student(String name, String rollNumber, String grade)
	    {
	        this.name = name;
	        this.rollNumber = rollNumber;
	        this.grade = grade;
	    }
	
	    //Getter And setter Methods
	    public String getName()
	    {
	        return name;
	    }
	
	    public void setName(String name)
	    {
	        this.name = name;
	    }
	
	    public String getRollNumber()
	    {
	        return rollNumber;
	    }
	
	    public void setRollNumber(String rollNumber)
	    {
	        this.rollNumber = rollNumber;
	    }
	
	    public String getGrade()
	    {
	        return grade;
	    }
	
	    public void setGrade(String grade)
	    {
	        this.grade = grade;
	    }
	
	    @Override
	    public String toString() 
	    {
	        return "Student [Name=" + name + ", Roll Number=" + rollNumber + ", Grade=" + grade + "]";
	    }
	    //Method To Override All Detailes OF Student

}//end of main class
