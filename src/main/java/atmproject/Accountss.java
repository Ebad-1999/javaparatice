package atmproject;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Accountss {

    private int accountNumber;
    private int pinNumber;
    private double checkingBalance;
    private double savingBalance;

    Scanner input = new Scanner(System.in);

    DecimalFormat moneyFormat = new DecimalFormat();

    public int getAccountNumber() {
        return accountNumber;
    }

    public int getPinNumber() {
        return pinNumber;
    }

    public double getCheckingBalance() {
        return checkingBalance;
    }

    public double getSavingBalance() {
        return savingBalance;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setPinNumber(int pinNumber) {
        this.pinNumber = pinNumber;
    }

    public void setCheckingBalance(double checkingBalance) {
        this.checkingBalance = checkingBalance;
    }

    public void setSavingBalance(double savingBalance) {
        this.savingBalance = savingBalance;
    }

    //calculate the checking balance after withdraw
    public double calculateCheckingBalanceAfterWithdraw (double amount){
        checkingBalance= checkingBalance-amount;
        return checkingBalance;

    }

    //calculate the checking balance after Deposit
    public double calculateCheckingBalanceAfterDeposit(double amount){
        checkingBalance = checkingBalance+amount;
        return checkingBalance;
    }

    //calculate the saving balance after withdraw
    public double calculateSavingBalanceAfterWithdraw(double amount){
        savingBalance = savingBalance-amount;
        return savingBalance;
    }

    //calculate the saving balance after deposit
    public double calculateSavingAccountAfterDeposit(double amount){
        savingBalance = savingBalance+amount;
        return savingBalance;
    }

    //Interact with the customer to withdraw from checking account

    public void getCheckingWithdraw(){
        System.out.println("Your checking balance is :" + moneyFormat.format(checkingBalance));
        System.out.println("Enter the amount you want to withdraw!");

        double amount = input.nextDouble();

        if (amount<=0){
            System.out.println("Negative or zero amount is not acceptable!");
        }else if (checkingBalance>amount){
            calculateCheckingBalanceAfterWithdraw(amount);

            System.out.println("This is your remaining balance :"+checkingBalance);

        }else {
            System.out.println("You don't have enough money");

        }


    }

    //interact with customer to deposit money to  checking account

    public void getCheckingDeposit(){
        System.out.println("Your checking balance is :" + moneyFormat.format(checkingBalance));
        System.out.println("Enter the amount you want to withdraw!");

        double amount = input.nextDouble();
        if (amount<=0){
            System.out.println("Negative or zero amount is not acceptable!");
            getCheckingDeposit();
        }else {

            calculateCheckingBalanceAfterDeposit(amount);
            System.out.println("This is youe balance :" + moneyFormat.format(checkingBalance));
        }
    }

    //Interact with customer to withdraw from saving account

    public void getSavingWithdraw(){
        System.out.println("This is your saving balance :"+ moneyFormat.format(savingBalance));
        System.out.println("Enter the amount you would like to with draw!");
        double amount = input.nextDouble();
        if (amount<=0){
            System.out.println("Negative or zero amount is not acceptable!");

        }else if (savingBalance>=amount){
            calculateSavingBalanceAfterWithdraw(amount);
            System.out.println();
            System.out.println(" your remaining balance is :"+ moneyFormat.format(savingBalance));
        }else {
            System.out.println("You don't have enough money");
        }

    }


    //Interact with customer to deposit to saving account

    public void getSavingDeposit(){
        System.out.println("Your saving balance is :"+ moneyFormat.format(savingBalance));

        System.out.println("Enter the amount you would like to deposit!");

        double amount = input.nextDouble();
        if (amount<=0){
            System.out.println( "Negative or zero amount is not acceptable!");
            getSavingDeposit();
        }else {
            calculateSavingAccountAfterDeposit(amount);
            System.out.println(" your remaining balance is :"+ moneyFormat.format(savingBalance));
        }
    }




}
