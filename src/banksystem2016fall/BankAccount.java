/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banksystem2016fall;

import java.text.DecimalFormat;
import java.util.ArrayList;

/**
 *
 * @author Mihir
 */
public class BankAccount {
    
    private static int nextAccountNumber = 100001;
    
    //attributes of the bank
    private String ssn;
    private String accountNumber;
    private double balance;
    private ArrayList<String> statement;
    
    public BankAccount(String s, double b){
     
        ssn = s;
        balance = b;
        
        accountNumber = "" + nextAccountNumber;
        nextAccountNumber++;
        statement =  new ArrayList<String>();
    
    DecimalFormat df = new DecimalFormat("##.00");
    
    statement.add(DateAndTime.DateTime() + ": Account opened" +
             "with an initial balance $ " + df.format(balance));
    }

    //deposit
    
    public void deposit(double da){
        
        if(da >0.0){
            balance = balance + da;
            DecimalFormat df = new DecimalFormat("##.00");
            statement.add(DateAndTime.DateTime() + ": Deposit $" + df.format(da) +
                    " . Balance: $ " + df.format(balance));
        }
    }
    
     public void withdraw(double wa){
        
        if(balance - wa >0.0){
            balance = balance - wa;
            DecimalFormat df = new DecimalFormat("##.00");
            statement.add(DateAndTime.DateTime() + ": Withdraw $" + df.format(wa) +
                    " . Balance: $ " + df.format(balance));
        }
    }
     
     public void showStatement()
     {
         
         for(int i = statement.size()-1 ; i >=0 ; i--)
         {
             System.out.println(statement.get(i));
             
         }
     }
    
    
    //get and set methods
    public static int getNextAccountNumber() {
        return nextAccountNumber;
    }

    public static void setNextAccountNumber(int nextAccountNumber) {
        BankAccount.nextAccountNumber = nextAccountNumber;
    }

    public String getSsn() {
        return ssn;
    }

    public void setSsn(String ssn) {
        this.ssn = ssn;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public ArrayList<String> getStatement() {
        return statement;
    }

    public void setStatement(ArrayList<String> statement) {
        this.statement = statement;
    }
    
    
    
    
}
