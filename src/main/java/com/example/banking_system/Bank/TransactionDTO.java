package com.example.banking_system.Bank;

import java.time.LocalDateTime;

public class TransactionDTO {
    private String type;
    private double amount;
    private LocalDateTime timestamp;

    public TransactionDTO(String type, double amount){
        this.type = type;
        this.amount = amount;
        this.timestamp = LocalDateTime.now();
    }
    // Add getters
    public String getType(){
        return type;
    }
    public double getAmount(){
        return amount;
    }
    public LocalDateTime getDate(){
        return timestamp;
    }

}
