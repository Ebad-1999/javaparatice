package practice;

import java.util.Arrays;

public class Q3FindElement {
    public static void main(String[] args) {

     /*
        Find the middle element in an integer array
       Example: (12, 5, 8) ==> (5, 8, 12) ==> Output=8
       (12, 5, 8, 13) ==> (5, 8, 12, 13) ==> Output=(8+12)/2 = 10
    */

        int [] mid = {12, 5, 8, 21, 13, 15, 50};

        Arrays.sort(mid);

        double midinx = mid.length/2;

        System.out.println(midinx);
        if (midinx%2!=0){
            System.out.println(midinx);
        }else {

        }



    }
}
