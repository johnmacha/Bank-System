package com.example.banking_system.Bank;

//Wraps all responses in a standard format
public class APIResponse<T> {
private String status;
private String message;
private T data;

public APIResponse(String status, String message, T data){
this.status = status;
this.message = message;
this.data = data;
}
// Add  getters
public String getStatus(){
    return status;
}
public String getMessage(){
    return message;
}
public T getData(){
    return data;
}
}
