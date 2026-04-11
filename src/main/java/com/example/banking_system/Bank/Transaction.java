package com.example.banking_system.Bank;

import java.time.LocalDateTime;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;


@Entity
public class Transaction {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private Long id;
private String type; //Deposit or Withdraw
private double amount;
private LocalDateTime timestamp;

@ManyToOne
@JoinColumn (name="account_name")
private BankAccount account;

public Transaction(){}

public Transaction (String type, double amount, BankAccount account){
    this.type = type;
    this.amount = amount;
    this.timestamp = LocalDateTime.now();
    this.account = account;
}
// Add getters
    public String getType(){
        return type;
    }
    public double getAmount(){
        return amount;
    }
}
