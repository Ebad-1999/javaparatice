package atmproject;

import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.Scanner;

public class atm extends Accountss {

  Scanner inout= new Scanner(System.in);

  DecimalFormat moneyFormat = new DecimalFormat("'$'###,##0.00");

  HashMap<Integer, Integer> data = new HashMap<>();

  boolean flag = true;

  public void checkingOperations(){
      do{
          optionsDisplay();

          int option = inout.nextInt();

          if (option==4){
              break;
          }

          switch (option){
              case 1:
                  System.out.println("Your checking balance is :"+ moneyFormat.format(getCheckingBalance()));
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
      GetaccountType();



  }
  public void savingOperation(){



     do {

         optionsDisplay();
         int option =inout.nextInt();
         if (option==4){
             break;
         }
         switch (option){
             case 1:
                 System.out.println("Yuor saving balance is:"  + moneyFormat.format(getSavingBalance()));
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
      GetaccountType();

  }

  public void GetaccountType(){
      System.out.println("Select the account you would like to access!");
      System.out.println("1: Checking Account");
      System.out.println("2: Saving Account");
      System.out.println("3: Quit");

      int option = inout.nextInt();

      switch (option){
          case 1:
              System.out.println("Your in checking account!");
              break;
          case 2:
              System.out.println("Your in saving account!");
              break;
          case 3:
              System.out.println("Thank you for choosing the AtM! See you later!");
              break;
          default:
              System.out.println("Invalid choice! pelase select 1, 2, 3, or 4");
      }

  }












  public void optionsDisplay(){
      System.out.println("Select Operation");

      System.out.println("1: view Balance");
      System.out.println("2: Withdraw");
      System.out.println("3: Deposit");
      System.out.println("4: Exit");
  }

}
