package day15MulidimensionArrays;

import java.util.Arrays;

public class MultidimensionArrays01 {

    public static void main(String[] args) {

        int arr [][] =new int[4][2];
        System.out.println(Arrays.deepToString(arr));

        arr[0][0]=2;
        arr[0][1]=5;
        arr[1][0]=3;
        arr[1][1]=55;
        arr[2][0]=25;
        arr[2][1]=6;
        arr[3][0]=3;
        arr[3][1]=7;

        System.out.println(Arrays.deepToString(arr));

        //short way

        int brr[][]={{2, 5}, {3, 55}, {25, 6},{3, 20, 7}};
        System.out.println(Arrays.deepToString(brr));//[[2, 5], [3, 55], [25, 6], [3, 20, 7]]

        //specific element
        System.out.println(brr[1][1]);//55

        String crr[][] ={{"Tom", "Jim"}, {"Angie"}, {"Carl", "Chris", "Ali"}};
        System.out.println(crr[2][2]);//Ali
        int sum = 0;
        for (String[] w : crr){
            sum =  sum + w.length;


        }
        System.out.println(sum);

        //Example 1: Print the elements which have “a” from a 2 dimensional String array. { {“learn”, “java”, “it”}, {“is”, “easy”} }

       String drr[][] ={{"learn","Java", "it"}, {"is", "easy"}};
       for (String []w: drr){
           for (String u:w){
               if (u.contains("a")){
                   System.out.println(u);
               }
           }
       }
        System.out.println();



        //Example 2: Create an integer multidimensional array then find the sum of the elements.
        int err[][]={{2, 5}, {3, 55}, {25, 6},{3, 20, 7}};
        int sun = 0;
        for (int[]W :err){
            for (int V :W){

                sun = sun+V;
                System.out.println(sun);


            }
        }
























    }
}
