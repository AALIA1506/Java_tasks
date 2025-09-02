package tasks.com;


class Bank
{
	private int accountnum,balance;
	
	public void setDeposit(int amount)
	{
		if(amount>0)
		{
			balance+=amount;
			System.out.println("Deposited amount is:"+balance);
		}
		else
		{
			System.out.println("Not sufficient amount to deposit");
		}
	}
	public void setWithdrawal(int amount)
	{
		if(amount>0 && amount<=balance)
		{
		   balance-=amount;
		   System.out.println("Withdrawal amount is:"+amount);
		  
		}
		else
		{
			System.out.println("Not sufficient amount to withdraw");
		}
	}
	protected int getBalance()
	{
		return balance;
	}
}

public class Bankbalance {

	public static void main(String[] args) 
	{
	    Bank b1=new Bank();
	    b1.setDeposit(4000);
	    b1.setWithdrawal(3000);
	    b1.setWithdrawal(3000);//this shows no amount to withdraw
	    int balance=b1.getBalance();
	    
	    System.out.println("The Balance amount is: "+balance);

	}

}


/*

package tasks.com;

class BankAccount {
    // Private variables (cannot be accessed directly)
    private int accountNumber;
    private double balance;

    // Setter for accountNumber
    public void setAccountNumber(int accNo) {
        accountNumber = accNo;
    }

    // Method to deposit money
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount);
        } else {
            System.out.println("Deposit amount must be positive!");
        }
    }

    // Method to withdraw money
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Invalid withdraw amount or insufficient balance!");
        }
    }

    // Method to check balance
    public double getBalance() {
        return balance;
    }

    // Method to get account number
    public int getAccountNumber() {
        return accountNumber;
    }
}

// Test class
public class BankApp {
    public static void main(String[] args) {
        BankAccount account = new BankAccount();

        // Set account number
        account.setAccountNumber(12345);

        // Perform transactions
        account.deposit(1000);
        account.withdraw(200);

        // Show results
        System.out.println("Account Number: " + account.getAccountNumber());
        System.out.println("Current Balance: " + account.getBalance());
    }
}
*/

