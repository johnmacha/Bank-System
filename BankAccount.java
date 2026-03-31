public class BankAccount {
    private String accountNumber;
    private String accountHolder;
    private double balance;

    public BankAccount(String accountNumber, String accountHolder){
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = 0.0;
    }

    public void deposit(double amount){
        balance += amount; //balance = balance + amount;
    }

    public void withdraw(double amount){
        if (amount <= balance){
            balance -= amount; //balance = balance - amount;
        } else{
            System.out.println("Insufficient funds");
        }
    }

    public double getBalance(){
        return balance;
    }
}