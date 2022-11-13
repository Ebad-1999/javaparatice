package day15MulidimensionArrays;

import java.util.Arrays;

public class MultidimensionalArray003 {
    public static void main(String[] args) {

        //Example 1: Convert multidimensional array to one dimensional array
        // { {"learn", "java", "it"}, {"is", "easy"} } ==> { "learn", "java", "it", "is", "easy" }

        String str[][] = { {"learn", "java", "it"}, {"is", "easy"} };
        int sum = 0;
        for (String[] w : str){
            sum=sum+w.length;
        }
        String strn[] = new String[sum];

        int inx = 0;
        for (String[] w :str){
            for (String u:w){
                strn[inx]=u;
                inx++;
            }

        }
        System.out.println(Arrays.toString(strn));//[learn, java, it, is, easy]











    }
}
