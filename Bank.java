import java.util.HashMap;

public class Bank{
    private HashMap<String, BankAccount> accounts = new HashMap<>();

    public void createAccount(String accNo, String name){
        accounts.put(accNo, new BankAccount(accNo, name));
    }

    public BankAccount getAccount(String accNo) {
        return accounts.get(accNo);
    }
}