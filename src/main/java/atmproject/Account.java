package atmproject;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Account {

    private int accountNumber;
    private int pinNumber;
    private double checkBalance;
    private double saveBalance;


    Scanner input  = new Scanner(System.in);


    DecimalFormat moneyFormat = new DecimalFormat("'$'###,##0.00");


    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public int getPinNumber() {
        return pinNumber;
    }

    public void setPinNumber(int pinNumber) {
        this.pinNumber = pinNumber;
    }

    public double getCheckBalance() {
        return checkBalance;
    }

    public void setCheckBalance(double checkAccount) {
        this.checkBalance = checkAccount;
    }

    public double getSaveBalance() {

        return saveBalance;
    }

    public void setSaveBalance(double saveAccount) {
        this.saveBalance = saveAccount;
    }

    //calculate checking balance after withdraw

    private double calculateCheckingBalanceAfterWithdraw( double amount){
        checkBalance = checkBalance - amount;
        return checkBalance;
    }

    //calculate Checking balance after deposit.
    public double calculateCheckingAfterDeposit(double amount){
        checkBalance= checkBalance+amount;
        return checkBalance;
    }

    //Calculate Saving balance after withdraw
    public double calculateSavingBalanceAfterWithdraw(double amount){
        saveBalance = saveBalance-amount;
        return saveBalance;
    }

    //calculate saving balance after deposit
    public double calculateSavingBalanceAfterDeposit(double amount){
        saveBalance = saveBalance+amount;
        return saveBalance;

    }

    //Interact with the customer to withdraw from checking account
    public void getCheckingWithdraw(){

        System.out.println("Your checking balanceis :" + moneyFormat.format(checkBalance));
        System.out.println("Enter the amount would you like to withdraw!");
        double amount = input.nextDouble();
        if (amount<=0){
            System.out.println("Negative or zero is not acceptable!");
        }else if (checkBalance>=amount){
            calculateCheckingBalanceAfterWithdraw(amount);
            System.out.println("THis is your remaining balance" + moneyFormat.format(checkBalance));
        }else {
            System.out.println("You dont have enough money");
        }
    }

    //interact with customer to deposit money to s= checking account

    public void getCheckingDeposit(){
        System.out.println("Your checking balance is :" + moneyFormat.format(checkBalance));
        System.out.println("Enter the amount you want to deposit");

       double amount = input.nextDouble();

       if (amount<=0){
           System.out.println("Negative or zero is not acceptable!");

           getCheckingDeposit();

       }else {
           calculateCheckingAfterDeposit(amount);
           System.out.println("This is your remaining balance :" + moneyFormat.format(checkBalance));
       }


    }

    //Interact with customer to withdraw from saving account
    public void getSavingWithdraw(){
        System.out.println("your saving balance is :" + moneyFormat.format(saveBalance));
        System.out.println("Enter the amount you want to withdraw");
        double amount = input.nextDouble();

        if (amount<=0){
            System.out.println("Negative or zero is not acceptable!");

            getSaveBalance();

        }else if (amount>0){
            calculateSavingBalanceAfterWithdraw(amount);
            System.out.println("Your remaining balance is :" + moneyFormat.format(saveBalance));
        }else {
            System.out.println("You don't have enough money");
        }
    }

    //Interact with customer to deposit to saving account
    public void getSavingDeposit(){
        System.out.println("your saving balance is :" + moneyFormat.format(saveBalance));
        System.out.println("Enter the money you want to deposit");
        double amount = input.nextDouble();

        if (amount<=0){
            System.out.println("Negative or zero is not acceptable!");

        }else {
            calculateSavingBalanceAfterDeposit(amount);
            System.out.println("your remaining balance is :" + moneyFormat.format(saveBalance));
        }
    }


}
