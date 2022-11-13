package ITJava;

import java.util.ArrayList;
import java.util.List;

public class List01 {

    public static void main(String[] args) {

        //1) Find the sum of all list elements in an integer list
        List<Integer> sum = new ArrayList<>();
        sum.add(12);
        sum.add(31);
        sum.add(7);
        sum.add(13);
        sum.add(10);
        sum.add(0);

        System.out.println(sum);//[12, 31, 7, 13, 10, 0]

        int sum2 = 0;
        for (int w : sum){
            sum2=sum2+w;

        }
        System.out.println(sum2);//73

        //2) Find the sum of all list elements before the first occurrence of 13 in an integer list
        List<Integer> myList = new ArrayList<>();
        myList.add(12);
        myList.add(31);
        myList.add(7);
        myList.add(13);
        myList.add(10);
        int sun = 0;
        for (int w : myList){
            if (w==13){
                break;
            }
            sun= sun+w;
        }
        System.out.println(sun);//50


    }
}
