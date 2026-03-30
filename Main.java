import java.util.Scanner;

public class Main {
    public static void main (String args []){
        // Create an account using 'Object Instantiation',where 'ac' is a 'reference variable'
        BankAccount ac = new BankAccount("9005", "John");
        Scanner sc = new Scanner(System.in);

        System.out.println("Select your option...");
        System.out.println("1. Deposit");
        System.out.println("2. Withdraw");
        System.out.println("3. Check Balance");
        System.out.println("4. Exit");
     
    while (true) { 
        int choice = sc.nextInt(); // Waits for user to type a number
        System.out.println("\n==== BANK MENU ====");

        if (choice == 1){
            System.out.println("Enter amount to deposit: ");
            double amount = sc.nextDouble();
            ac.deposit(amount);
            System.out.println("Deposit successful!");
        }
        else if (choice == 2){
            System.out.println("Enter amount to withdraw: ");
            double amount = sc.nextDouble();
            ac.withdraw(amount);
            System.out.println("Withdrawal successful!");

        }
        else if (choice == 3){
            System.out.println("Balance :"+ac.getBalance());
        }
        else if(choice == 4){
            System.out.println("Good bye!");
            break;
        }
        }
        }
    }


