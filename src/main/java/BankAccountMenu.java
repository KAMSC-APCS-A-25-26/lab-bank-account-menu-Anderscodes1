import java.util.Scanner;

public class BankAccountMenu {
    public static void main(String[] args) {
        boolean running=true;
        Scanner sc= new Scanner(System.in);
        double balance = 0;
        while (running==true)
        {
        	System.out.println("--- Bank Account Menu ---");
        	System.out.println("1. Add Money");
        	System.out.println("2. Withdraw Money");
        	System.out.println("3. Check balance");
        	System.out.println("4. Exit");
        	System.out.print("Enter your choice: ");
        	int choice = sc.nextInt();
        	
        	switch(choice)
        	{
        		case 1:
        		{
        			System.out.print("Enter amount to add: ");
        			double add = sc.nextDouble();
        			if (add > 0)
        			{
        			    balance += add;
        				System.out.printf("Added $%.2f", add);
        				System.out.println();
        				System.out.printf("New balance: $%.2f", balance);
        			}
        			else
        			{
        				System.out.println("Cannot add negative number");
        			}
        			System.out.println();
        			System.out.println();
        			break;
        		}
        		case 2:
        		{
        			System.out.print("Enter amount to withdraw: ");
        			double withdraw = sc.nextDouble();
        			if (withdraw>=0 && withdraw<=balance)
        			{
        				balance -= withdraw;
        				System.out.printf("Withdrew $%.2f", balance);
        				System.out.println();
        				System.out.printf("New balance: $%.2f", balance);
        			}
        			else
        			{
        				System.out.print("Insufficient funds");
        			}
        			System.out.println();
        			System.out.println();
        			break;
        		}
        		case 3:
        		{
        			System.out.printf("Balance: $%.2f", balance);
        			System.out.println();
        			System.out.println();
        			break;
        		}
        		case 4:
        		{
        			System.out.println("Goodbye!");
        			running = false;
        			break;
        		}
        	}
        }
    }
}
