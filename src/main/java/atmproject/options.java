package atmproject;

import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class options extends Account{

    Scanner input = new Scanner(System.in);

    DecimalFormat moneyFormat = new DecimalFormat();

    Map<Integer, Integer> data = new HashMap<>();

    boolean flag = true;

    public void checkingOperation(){

        do {

            optionalDisplay();

            int option = input.nextInt();

            if (option == 4) {
                break;
            }

            switch (option){
                case 1:
                    System.out.println("Your checking balance is "+ moneyFormat.format(getCheckBalance()));
                    break;
                case 2:
                    getCheckingWithdraw();
                    break;
                case 3:
                    getCheckingDeposit();
                    break;
                default:
                    System.out.println("Invalid option please select 1, 2, 3, or 4");

            }


        }while (true);
        getAccountType();

    }

    public void savingOperation(){

        do {
            optionalDisplay();

            int option= input.nextInt();

            if (option==4){
                break;
            }

            switch (option){
                case 1:
                    System.out.println("This is your saving balance:" + moneyFormat.format(getSaveBalance()));
                    break;

                case 2:
                    getSavingWithdraw();
                    break;

                case 3:
                    getSavingDeposit();
                    break;
                default:
                    System.out.println("Invalid option please select 1, 2, 3, or 4");

            }
        }while (true);

        getAccountType();


    }

    public void getAccountType(){
        System.out.println("Select the account you would like to access!");
        System.out.println("1: Checking Account");
        System.out.println("2: Saving Account");
        System.out.println("3: Quit");

        int option = input.nextInt();

        switch (option){
            case 1:
                System.out.println("You are in checking account!");
                checkingOperation();
                break;
            case 2:
                System.out.println("You are in Saving account!");
                savingOperation();
                break;
            case 3:
                System.out.println("Thanks for choosing the ATM! See you later");
                flag=false;
                break;
            default:
                System.out.println("Invalid choice! Please select 1, 2, 3");



        }


    }



    public void optionalDisplay(){
        System.out.println("select options:");

        System.out.println("1: view Balance");
        System.out.println("2: Withdraw");
        System.out.println("3: Deposit");
        System.out.println("4: Exit");
    }
}
