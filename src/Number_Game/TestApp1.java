package Number_Game;

import java.util.Random;
import java.util.Scanner;


//main class 
public class TestApp1
{
	    //public main method 
		public static void main(String[] args)
	    {
	        //Generate Random number between 1 to 100
			Random random = new Random();
			
	        int Rnumber = random.nextInt(100) + 1;
	        int Attempts_count = 0;
	        //import Scanner For Scan The Number From Console
	        Scanner sc = new Scanner(System.in);


	        System.out.println("|---------------Number Guessing Game-------------|");
	        //Loop Execute until User Guessing Right Number 
	        while(true)
	        {
	        	System.out.print("\nGuess the number between 1 to 100: ");
	            int Unumber = sc.nextInt();
	            Attempts_count++;

	            if(Attempts_count == 20)
	            {
	            	System.out.println("|------------------------------------------------|");
	            	System.out.println("|You have Out of Chances....!!                   |");
	                System.out.println("|The Number Was: " + Rnumber+"                              |");
	                System.out.println("|Better luck next time.....!!                    |");
	                System.out.println("|------------------------------------------------|");
	            	
	                break;
	            }
	            if(Unumber == Rnumber)
	            {
	                System.out.println("|------------------------------------------------|");
	            	System.out.println("|Your Guessed Number  "+Rnumber+"  Is Right...!!          |");
	            	System.out.println("|Congratulations...!You Won The Game..... !!     |");
	                System.out.println("|You Guessed Right Number in " + Attempts_count + " Guesses...!!      |");
	                System.out.println("|------------------------------------------------|");
	            	
	                break;
	            
	            }else if(Unumber < Rnumber)
	            {
	            	System.out.println("!.....Your guess is TOO LOW.....!");
	            
	            }else if(Unumber > Rnumber)
	            {
	            
	            	System.out.println("!....Your guess is TOO HIGH....!");
	            
	            }else
	            {
	                System.out.println("!....Pls Enter Valid Input....!");
	            }

	            if (Attempts_count == 5)
	            {
	            
	            	System.out.println("\n!...You're a Genius...!\n");
	            
	            }
	        	
	        }//end of switch Case
	        
	    }//end of main method
	}//end of main class



