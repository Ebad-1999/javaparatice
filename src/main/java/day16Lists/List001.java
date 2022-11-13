package day16Lists;

import java.sql.Array;
import java.util.ArrayList;
import java.util.List;

public class List001 {
    public static void main(String[] args) {

        ArrayList<Integer> arr = new ArrayList<Integer>();
        ArrayList<Integer> brr = new ArrayList<>();
        List<Integer> crr  = new ArrayList<>();


        arr.add(22);
        arr.add(21);
        arr.add(23);
        arr.add(24);
        arr.add(25);
        arr.add(26);
        arr.add(28);
        System.out.println(arr);

        arr.add(1,2222);
        System.out.println(arr);


        crr.add(1000);
        crr.add(2000);
        crr.add(3000);
        crr.add(4000);
        System.out.println(crr);

        arr.addAll(crr);
        System.out.println(arr);
        int siz= arr.size();
        System.out.println(siz);

       boolean emp =arr.isEmpty();
        System.out.println(emp);


        List<String> d = new ArrayList<>();
        d.add(" ");
        d.add(" ");
        d.add(" ");
        d.add(" ");
        d.add(" ");
        System.out.println(d);


        List<String> e = new ArrayList<>();
        e.add(" ");

        d.removeAll(e);
        if (d.isEmpty()){
            System.out.println("Empty");
        }else {
            System.out.println("Not emp");
        }







    }
}
