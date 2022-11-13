package day10ForlLoops;

import java.util.Scanner;

public class NestedLoops01 {
    public static void main(String[] args) {

        /*
     1. Example: Type code to get the output like
      Week: 1
       Day: 1
       Day: 2
       Day: 3
      ......
      Week: 2
       Day: 1
       Day: 2
       Day: 3
      ......
      Week: 3
       Day: 1
       Day: 2
       Day: 3

         */

        for (int i = 1 ; i<5 ;i++){
            System.out.println("Week:" + i);
            for (int k =1 ;k<8 ; k++)
                System.out.println("Day:"+ k);

        }

        System.out.println();

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the number of the rows");
        int row= input.nextInt();

        System.out.println("Enter the number of the colum");
        int colum= input.nextInt();

        for (int i = 1 ; i<=row ; i++){
            for (int ii = 1; ii<=colum; ii++){
                System.out.print("*");

            }
            System.out.println();
        }
        System.out.println();

        /*3.Example: Type code to get the output like
              1
              1 2
              1 2 3
              1 2 3 4
              1 2 3 4 5

         */
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the number of the rows");
        int numRow= input.nextInt();
        for (int i = 1  ;i<=numRow;i++){
            for (int ii = 1 ; ii<=i;ii++){
                System.out.print(ii+" ");
            }
            System.out.println();
        }





































    }
}
