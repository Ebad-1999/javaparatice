package day17List;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class List001 {
    public static void main(String[] args) {


        //Example 1: Type code to make all elements in a List unique.
        //[2, 3, 2, 5] ==> [2, 3, 5]

        List<Integer> a = new ArrayList<>();
        a.add(2);
        a.add(3);
        a.add(2);
        a.add(2);
        a.add(5);

        List<Integer> b = new ArrayList<>();
        for (Integer w : a){
            if (!b.contains(w)){
                b.add(w);
            }
        }
        System.out.println(b);


        //Example 2: Ask user to enter a letter,if the latter exists inside the list, convert the element to "Got it"
        //otherwise, add the element into the list
        //[A, K, R, S] ==> User --> k==>[A, Got it, R, S]
        //[A, K, R, S] ==> User --> k ==>[A, K, R, S, P]

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a latter...");
        String str = input.nextLine();

        List<String > c = new ArrayList<>();
        c.add("A");
        c.add("K");
        c.add("R");
        c.add("S");

        if (c.contains(str)) {

            System.out.println("Got it");
        }else {
            c.add(str);
            System.out.println(c);//[A, K, R, S, l] - we put (l).
        }



        List<String > d = new ArrayList<>();
        d.add("Ab");
        d.add("Kl");
        d.add("Rs");
        d.add("St");
        d.add("Rs");

        int e = d.indexOf("St");
        System.out.println(e);//3

        int v = d.indexOf("hk");
        System.out.println(v);//-1



        int p =  d.lastIndexOf("Rs");
        System.out.println(p);//4




    }
}
