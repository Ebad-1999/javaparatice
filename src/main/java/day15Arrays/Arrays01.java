package day15Arrays;

import java.util.Arrays;

public class Arrays01 {
    public static void main(String[] args) {

        //Example 1:Type code to check a specific elements in an Array or
        // not ("Ellie", "Susan", "Micheal", "George", "Tom")



        String str[]={"Ellie", "Susan", "Micheal", "George", "Tom"};

        /*
        String name ="Susan";

        int counter = 0;
        for (String w : str){
            if (w.equals(name)){
                counter++;
            }
        }
        if (counter>0){
            System.out.println(name + " "+ " is exist");
        }else {
            System.out.println(name+" "+"is not exist");
        }

         */

        //second 2 way: We will have binarySearch().
        //If the element exists binarySearch() method returns the index of the element.
        //When we need to use binarySearch(), we have to sort the array first and then use binarySearch().



        Arrays.sort(str);
        System.out.println(Arrays.toString(str));
        int ind = Arrays.binarySearch(str, "Susan");
        System.out.println(ind);
























    }
}
