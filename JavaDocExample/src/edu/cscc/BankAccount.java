package edu.cscc;

import java.text.DecimalFormat;
import java.text.NumberFormat;

/**
 * Base bank account class
 * @author Bob Platt
 * @version 1.0
 */
public abstract class BankAccount {
    protected String customerName;
    protected double balance;

    /**
     * Constructor
     * @param customerName name of the customer
     * @param balance - account balance
     */
    public BankAccount(String customerName, double balance) {
        this.customerName = customerName;
        this.balance = balance;
    }

    /**
     * @return customer name
     */
    public String getCustomerName() {
        return customerName;
    }

    /**
     * @param customerName customer name
     */
    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    /**
     * @return account balance
     */
    public double getBalance() {
        return balance;
    }

    /**
     * @param balance - account balance
     */
    public void setBalance(double balance) {
        this.balance = balance;
    }

    /**
     * Generate a report for account (abstract method)
     */
    abstract public void report();
}