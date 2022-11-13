package day15MulidimensionArrays;

import java.sql.Array;
import java.util.Arrays;

public class MultidimentionArray {

    public static void main(String[] args) {

        int arr[][] = new int [4][2];
        System.out.println(Arrays.deepToString(arr));//[[0, 0], [0, 0], [0, 0], [0, 0]]

        arr[0][0]=23;
        arr[0][1]=5;
        arr[1][0]=6;
        arr[1][1]=7;
        arr[2][0]=9;
        arr[2][1]=55;
        arr[3][0]=7;
        arr[3][1]=9;
        System.out.println(Arrays.deepToString(arr));//[[23, 5], [6, 7], [9, 55], [7, 9]]

        int brr[][] = {{2, 3}, {5, 9}, {10, 7}, {-3, 8}, };
        System.out.println(Arrays.deepToString(brr));//[[2, 3], [5, 9], [10, 7], [-3, 8]]


        String crr[][] ={{"Tom", "Jim"}, {"Angie"}, {"Carl", "Chris", "Ali"}};
        System.out.println(Arrays.deepToString(crr));//[[Tom, Jim], [Angie], [Carl, Chris, Ali]]

        System.out.println(Arrays.toString(crr[2]));//[Carl, Chris, Ali]
        System.out.println((crr[2][0]));//Carl

        System.out.println(Arrays.toString(crr[2]));//[Carl, Chris, Ali]
        int sum = 0;
        for (String[] w : crr){
            sum=sum+w.length;

        }
        System.out.println(sum);//6






    }
}
