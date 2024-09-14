package ATM_Interface;

public class ATMInterface
{
    public static void main(String[] args)
    {
        BankAccount account = new BankAccount(500.00); // Initial balance
        ATM atm = new ATM(account);
        atm.StartProcess();  // Start the ATM interface
    }
}//end of Interface
