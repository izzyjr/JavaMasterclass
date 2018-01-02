package com.israelmesa;

public class BankAccount {
    private int accountNumber;
    private int balance;
    private String customerName;
    private String email;
    private int phoneNumber;

    public BankAccount() {
        System.out.println("Empty Constructor called");
    }

    public BankAccount(int accountNumber, int balance, String customerName, String email, int phoneNumber) {
        System.out.println("BankAccount Constructor called with parameters: ");
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.customerName = customerName;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public BankAccount(String customerName, String email, int phoneNumber) {
        this(12345, 1, customerName, email, phoneNumber);
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }
    public void setBalance(int balance) {
        this.balance = balance;
    }
    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    /////////////////////////////////////////////////

    public int getAccountNumber() {
        return this.accountNumber;
    }
    public int getBalance() {
        return this.balance;
    }
    public String getCustomerName() {
        return this.customerName;
    }
    public String getEmail() {
        return this.email;
    }
    public int getPhoneNumber() {
        return this.phoneNumber;
    }

    /////////////////////////////////////////////////

    public void deposit(int depositAmount) {
        this.balance = this.balance + depositAmount;
    }
    public void withdraw(int withdrawAmount) {
        if (this.balance < withdrawAmount) {
            System.out.println("Insufficient funds");
        } else {
            this.balance = this.balance - withdrawAmount;
        }
    }


}
