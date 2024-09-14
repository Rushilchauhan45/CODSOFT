package Student_Grade_Calculater;

import java.util.Map;
import java.util.Scanner;
import java.util.HashMap;

public class Grade_Calculator
{

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Number of Students:");
        int stunum = sc.nextInt();
        sc.nextLine(); 

        for (int i = 0; i < stunum; i++)
        {
            System.out.println("Enter Student Name:");
            String Sname = sc.nextLine();

            System.out.println("Enter the Number of Subjects:");
            int Subnum = sc.nextInt();
            sc.nextLine(); 

            Map<String, Integer> MarksOfSub = new HashMap<>();
            int Total = 0;

            for (int j = 0; j < Subnum; j++)
            {
                System.out.println("Enter the Name of Subject " + (j + 1) + ":");
                String Subname = sc.nextLine();

                System.out.println("Enter the Marks for " + Subname + " [Out of 100]:");
                int marks = sc.nextInt();
                sc.nextLine(); 

                MarksOfSub.put(Subname, marks);
                Total += marks;
            }//end of inner for

            // Calculate Average Percentage
            float Avg_Pct = (float) Total / Subnum;

            // Calculate Grade
            String Grade_cal = GradeCalculation(Avg_Pct);

            // Display Results 
            System.out.println("\n=====================================================");
            System.out.printf("| %-15s | %-8s | %-6s | %-4s | %-4s |\n", "Student", "Subjects", "Total", "Avg", "Grade");
            System.out.println("=====================================================");
            System.out.printf("| %-15s | %-8d | %-6d | %-4.2f | %-5s|\n", Sname, Subnum, Total, Avg_Pct, Grade_cal);
            System.out.println("=====================================================");

            // Display marks for each subject
            System.out.println("\nMarks per Subject:");
            System.out.println("=================================");
            System.out.printf("| %-20s | %-6s |\n", "Subject", "Marks");
            System.out.println("=================================");
            
            for (Map.Entry<String, Integer> entry : MarksOfSub.entrySet())
            {
                System.out.printf("| %-20s | %6d |\n", entry.getKey(), entry.getValue());
            }//end of inner for
            
            System.out.println("=================================");
        
        }//end of outer for
        
    }//end of main method

    private static String GradeCalculation(float Avg_Pct)
    {
        
    	if(Avg_Pct >= 90)
        {
           return "A+";
        }else if (Avg_Pct >= 80)
        {
           return "A";
        }else if (Avg_Pct >= 70)
        {
           return "B+";
        }else if (Avg_Pct >= 60)
        {
           return "B";
        }else if (Avg_Pct >= 50)
        {
           return "C+";
        }else if (Avg_Pct >= 40)
        {
           return "C";
        }else
        {
           return "D";
        }
        
    }//end of String Method
    
}//end of main class
