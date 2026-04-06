package com.example.banking_system.Bank;
import java.util.HashMap;

import org.springframework.stereotype.Service;
@Service
public class BankService {
    private HashMap<String, BankAccount> account = new HashMap<>();

    public void createAccount(String accNo, String name){
        BankAccount acc = new BankAccount(accNo, name);
        account.put(accNo, acc);
    }
    public BankAccount getAccount(String accNo){
        return account.get(accNo);
    }
}
