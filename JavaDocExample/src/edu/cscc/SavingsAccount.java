package edu.cscc;

import java.text.DecimalFormat;
import java.text.NumberFormat;

/**
 * Savings account class
 * @author Bob Platt
 * @version 1.0
 */
public class SavingsAccount extends BankAccount {
    private double interestRate;

    /**
     * Constructor
     * @param customerName customer name
     * @param balance account balance
     * @param interestRate savings interest rate (percent)
     */
    public SavingsAccount(String customerName, double balance, double interestRate) {
        super(customerName, balance);
        this.interestRate = interestRate;
    }

    /*
     * @return savings account interest rate
     */
    public double getInterestRate() {
        return interestRate;
    }

    /**
     * @param interestRate savings account interest rate
     */
    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }

    /**
     * Generate report for savings account
     */
    public void report() {
        NumberFormat formatter = new DecimalFormat("#0.00");
        System.out.println("Savings Account" + "\nCustomer Name: " + customerName +
                "\nBalance: $" +  formatter.format(balance));
        System.out.println("Interest rate: "+formatter.format(interestRate));
    }
}
