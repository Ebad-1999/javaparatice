package assigment;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class fg {
    public static void main(String[] args) {

        /*
        - Type code to ask user to enter the int elements and add elements into the list
        - Ask user to enter the elements to remove, then remove that element from list.
        - Ask user to enter the element to update, then update it.

         */


        Scanner scan=new Scanner(System.in);
        System.out.print("Enter the number of elements you want to store: ");
        //reading the number of elements from the that we want to enter
        int n=scan.nextInt();

        List<Integer> e = new ArrayList<>(5);
        System.out.println("Enter the elements of the array: ");
        for(int i=0; i<n; i++)

        {
         //reading array elements from the user
            e.add(scan.nextInt()) ;

        }
        System.out.println(e);

        System.out.print("Enter the number of elements you want to remove ");
        int remove =scan.nextInt();
        e.remove(Integer.valueOf(remove));
        System.out.println(e);



    }
}
