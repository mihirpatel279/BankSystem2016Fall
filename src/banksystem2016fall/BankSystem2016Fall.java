/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banksystem2016fall;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Mihir
 */
public class BankSystem2016Fall {

    /**
     * @param args the command line arguments
     */
    public static ArrayList<BankAccount> allBankAccounts
            = new ArrayList<BankAccount>();
    
     public static ArrayList<OnlineAccount> allOnlineAccounts
            = new ArrayList<OnlineAccount>();
    
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        Scanner input = new Scanner(System.in);
        String selection = "";
        
        while(!selection.equalsIgnoreCase("x")){
            {
                System.out.println();
                System.out.println("Please make your selection");
                System.out.println("1 : Open a new Bank account");
                System.out.println("2 : GO to online System");
                System.out.println("3 : Display all bank accounts");
                System.out.println("x : Exit");
                  
                  
                selection = input.next();
                System.out.println();
                
                
                if(selection.equalsIgnoreCase("1")){
                    //Create the bank account
                    
                    BankAccountCreator.createNewBankAccount();
                    
                }
               else  if(selection.equalsIgnoreCase("2")){
                   
                   
                    //go to online system;
                    new OnlineSystem().showMainPage();
                } 
               else  if(selection.equalsIgnoreCase("3")){
                    //Display All bank accounts;
                    for (BankAccount bk : allBankAccounts ){
                        
                        System.out.println(bk.getAccountNumber() + " of  this " + bk.getSsn() + 
                                "is having " + bk.getBalance());
                    }
                }
                else   if(selection.equalsIgnoreCase("x")){
                    
                }
            }
            
        }
    }
    
}
