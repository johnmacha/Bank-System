package com.example.banking_system.Bank;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
@RequestMapping("/bank")
public class BankController {
    @Autowired
    private BankService bankService;

    @PostMapping("/create")
    public String createAccount(@RequestBody BankAccount account){
        bankService.createAccount(account.getAccNo(), account.getName());
        return "Account created successfully!";
    }

    @GetMapping("/test")
    public String Test(){
        return "Working";
    }
}
