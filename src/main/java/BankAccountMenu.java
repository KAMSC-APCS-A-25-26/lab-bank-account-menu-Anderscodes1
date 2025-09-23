import java.util.Scanner;

public class BankAccountMenu {
    public static void main(String[] args) {
        boolean running=true;
        Scanner sc= new Scanner(System.in);
        while (running==true)
        {
        	System.out.println("--- Bank Account Menu ---\n1. Add Money");
        	System.out.println("2. Withdraw Money\n3. Check balance\n4. Exit");
        	System.out.println("Enter your choice:  ");
        	int choice = sc.nextInt();
        	double balance = 0;
        	switch(choice)
        	{
        		case 1:
        		{
        			System.out.println("How much would you like to add?  ");
        			double add = sc.nextDouble();
        			if (add>=0)
        			{
        				balance += add;
        				System.out.println("Your new balance is $%.2f" + balance);
        			}
        			else
        			{
        				System.out.println("ERROR\nBalance: $%.2f" + balance);
        			}
        			System.out.println();
        			break;
        		}
        		case 2:
        		{
        			System.out.println("How much would you like to withdraw?  ");
        			double withdraw = sc.nextDouble();
        			if (withdraw>=0 && withdraw<=balance)
        			{
        				balance -= withdraw;
        				System.out.println("Your new balance is $%.2f" + balance);
        			}
        			else
        			{
        				System.out.println("ERROR\nBalance: $%.2f" + balance);
        			}
        			System.out.println();
        			break;
        		}
        		case 3:
        		{
        			System.out.println("Balance: $%.2f" + balance);
        			System.out.println();
        			break;
        		}
        		case 4:
        		{
        			System.out.println("Goodbye");
        			running = false;
        			break;
        		}
        	}
        }
    }
}
