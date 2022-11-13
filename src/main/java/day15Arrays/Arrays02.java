package day15Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Arrays02 {
    public static void main(String[] args) {

        //Type code to print the sum of the minimum and maximum value of an integer Array.

        int arr[]={23, 12, 34, 10, 78, 19};
        System.out.println(Arrays.toString(arr));

        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        int min = arr[0];
        int max = arr[arr.length-1];


        //Create an Array and first take the number of the elements and then print them on the console.
       Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number of employee to store in the array");

        int len = scan.nextInt();

        String arrEmp[]= new String[len];
        for (int i = 0 ; i<len ; i++){

            System.out.println("Enter"+(i+1)+". employee name. Pleasr press 'Q' to skip");

            String EmpName = scan.next();
            if (!EmpName.equalsIgnoreCase("Q")){
                arrEmp[i]=EmpName;

            }else {
                break;
            }
        }
        System.out.println(Arrays.toString(arrEmp));











    }

}
