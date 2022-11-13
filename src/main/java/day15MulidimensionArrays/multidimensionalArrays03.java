package day15MulidimensionArrays;

import day04nestedifswitch.Switch01;

import java.util.Arrays;

public class multidimensionalArrays03 {
    public static void main(String[] args) {

        //Example 1: Convert multidimensional array to one dimensional array
        // { {"learn", "java", "it"}, {"is", "easy"} } ==> { "learn", "java", "it", "is", "easy" }

        String arr [][]= {{"learn", "java", "it"}, {"is", "easy"} };

        //1.step: find the total number os elements in the multidimensional array
        int sum= 0 ;
        for (String[] w: arr){
            sum=sum+w.length;
        }
        String brr[]= new String[sum];
        int ind = 0;
        for (String[] w : arr){
            for (String u : w){
                brr[ind]=u;
                ind++;
            }
        }
        System.out.println(Arrays.toString(brr));//[learn, java, it, is, easy]

        //Exaample find the Maxinum element in two-dimensional array{{5, 0}, {-2, 4, 1}, {65, -12, 23}}

        int crr[][] = {{5, 0}, {-2, 4}, {65, -12, 23,100}};
        int max =crr[0][0];
        for (int[] w:crr){
            for (int u : w){
                if (max<u){
                    max=u;

                }
            }
        }
        System.out.println(max);//100

        //5) Find the total number of characters used in String array elements
        //Example: { "Kemal", "Jonathan", "Mark", "Angie", "Veli" } ==> Output is 26

        String mrr[] ={ "Kemal", "Jonathan", "Mark", "Angie", "Veli"};
        int su = 0;
        for (String w:mrr){
            su=su+w.length();
        }
        System.out.println(su);

        /*) Count how many words start with 'a' or 'A' in a given String

        String s= "Apex is an object oriented programming  language";
        String nrr[] = s.split(" ");
        int counter  = 0;
        for (String w : nrr){
            if (w.startsWith("a") || w.startsWith("e")){
                counter++;
            }
        }
        System.out.println(counter);

         */


        String s= "Apex is an object oriented programming  language";
        String nrr[] = s.toLowerCase().split("");
        int counert = 0;
        for (String w : nrr) {

            switch (w) {
                case "a":
                case "e":
                case "i":
                case "o":
                case "u":

                    counert++;
            }
        }
        System.out.println(counert);

        //8) Type code to find array elements whose first and last characters are same

        String[] hrr = new String[]{"alabama", "pick", "sos", "sets", "pex"};
        int size = hrr.length;
        for (int i = 0 ; i<size ;i++){
            String fChar = hrr[i].substring(0 , 1);
            String lastChar = hrr[i].substring(hrr[i].length()-1);
            if (fChar.equals(lastChar)){
                System.out.println(arr[i]);
            }

        }






































    }
}
