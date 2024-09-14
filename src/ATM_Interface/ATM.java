package ATM_Interface;

import java.util.Scanner;

//ATM Class To Call ATM Services Methods
public class ATM
{
    private BankAccount account;

    public ATM(BankAccount account)
    {
        this.account = account;
    }//end of constructor

    public void StartProcess()
    {
        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        //while loop for Continue the Process Until User Want
        while (running)
        {
            System.out.println("-----------------------");
        	System.out.println("\n|       ATM         |");
            System.out.println("-----------------------");
            System.out.println("[1] Check Balance");
            System.out.println("[2] Deposit");
            System.out.println("[3] Withdraw");
            System.out.println("[4] Exit");
            System.out.println("-----------------------");

            System.out.print("Choose your option: ");
            int choice = scanner.nextInt();

            switch (choice)
            {
                case 1:
                    System.out.println("Your Current Balance: " + account.checkBalance());
                break;
                
                case 2:
                    System.out.print("Enter Deposit Amount: ");
                    double depositAmount = scanner.nextDouble();
                    account.deposit(depositAmount);
                break;
                
                case 3:
                    System.out.print("Enter Withdrawal Amount: ");
                    double withdrawAmount = scanner.nextDouble();
                    account.withdraw(withdrawAmount);
                break;
                
                case 4:
                    System.out.println("Thank you for using the ATM... Have Nice Day!");
                    running = false;
                break;
                
                default://default class for invalid value
                    System.out.println("Invalid Option ...So Try Again..!!");
            }//end of Switch Case
        }//end of while
        scanner.close();
    }//End of StartProcess method
}//End of ATM Class 
