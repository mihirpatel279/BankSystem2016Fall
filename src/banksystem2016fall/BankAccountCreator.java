/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banksystem2016fall;

import java.util.Scanner;

/**
 *
 * @author Mihir
 */
public class BankAccountCreator {
    
    public static void createNewBankAccount(){
        
        //get the input;
        
        
        String ssn;
        double balance;
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Please enter your ssn");
        ssn = input.next();
        
        System.out.println("Please enter the initial balance");
        balance = input.nextDouble();
        
        
        //
        
        BankAccount aNew = new BankAccount(ssn,balance);
        BankSystem2016Fall.allBankAccounts.add(aNew);
    }
    
}

