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
public class OnlineSystem {
    
    private OnlineAccount theLoginAccount;
    
    public OnlineSystem(){
        
        theLoginAccount = null;
    }
    
    //main menu 
    
    public void showMainPage(){
        Scanner input = new Scanner(System.in);
        String selection = "";
        
        while(!selection.equals("x")){
            
            //options
            System.out.println();
            System.out.println("Welcome to UHCL Bank!");
            System.out.println("1: create a new online access ID; ");
            System.out.println("2 : login your online account");
            System.out.println("x : leave the online system");
            System.out.println();
            
            
            //get input
            
            selection = input.next();
            
            if(selection.equals("1")){
                
                signUp();
                //sign up
            }
            else if (selection.equals("2")){
                //login
                
                login();
            }
            else {
                ;
            }
           
        }
    }
    
    
    public void signUp(){
        
        Scanner input = new Scanner(System.in);
        
        //get the ssn,id and psw
        
        System.out.println("Please enter your ssn");
        String ssn = input.next();
        System.out.println("Please enter your new login ID");
        String id = input.next();
        
        System.out.println("Please enter your selected password");
        String psw = input.next();
        
        //boolean variables for conditions
        
        boolean idUsed = false;
        boolean ssnUsed = false;
        
        //because we check each onlineAccount in the arrayList
        //we can use enhanced for loop
        
        for(OnlineAccount one : BankSystem2016Fall.allOnlineAccounts){
            
            //check the id
            
            if(id.equals(one.getId())){
                
                idUsed = true;
                break;
            }
            //check ssn
            if(ssn.equals(one.getSsn())){
                
                ssnUsed = true;
                break;
            }
        }
        
        //the conditions are updated already
        
        if(idUsed == true){
            System.out.println("**** The login ID is used! Please select "
                    + "another one!  *****");
        }
        else if (ssnUsed == true){
            
            System.out.println("**** You have an ID already. Please contact "
                    + "Customer service for your account information.  *****");
        
        }
        else {
            OnlineAccount aNew = new OnlineAccount(ssn,id,psw);
            BankSystem2016Fall.allOnlineAccounts.add(aNew);
        }
    }
    
    public void login(){
        
        //get the input
        
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your ID");
        String id = input.next();
        System.out.println("Please enter your password");
        String password = input.next();
        
        // id found boolean
        
        boolean idFound = false;
        
        //search all online accounts
        
        for(OnlineAccount one : BankSystem2016Fall.allOnlineAccounts){
            
            if(id.equals(one.getId())){
                
                //id is found
                
                idFound = true;
                //check the password
                
                if(password.equals(one.getPsw())){
                    //login succesful
                    
                    theLoginAccount = one;
                    //go to the main menu of the onlineAccount
                    theLoginAccount.welcome();
                    break;
                }
                else{
                    //incorrct passowrd
                    
                    System.out.println(" **** Your password was in correct");
                }
            }
            
            else {
                
                System.out.println(" **** Your Id not found");
                
            }
        }
        
        if(idFound == false){
            System.out.println(" **** Your Id not found");
        }
        
    }
    
}
