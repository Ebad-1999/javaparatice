package day16Lists;

import java.util.ArrayList;
import java.util.List;

public class List02 {
    public static void main(String[] args) {

        List<String> a = new ArrayList<>();
        a.add("Shoes");
        a.add("TV");
        a.add("Radio");
        a.add("Laptop");
        a.add("Shoes");
        a.add("Book");
        a.add("Shoes");
        System.out.println(a);

        List<String> c = new ArrayList<>();
        c.add("Shoes");
        c.add("TV");

        a.removeAll(c);
        System.out.println(a);
        a.remove(1);
        System.out.println(a);

        //Example 4: Create an Integer list, then remove the 4th element

        List<Integer> e = new ArrayList<>();
        e.add(12);
        e.add(4);
        e.add(13);
        e.add(25);
        e.add(432);
        System.out.println(e);//[12, 4, 13, 25, 432]
        e.remove(3);
        System.out.println(e);//[12, 4, 13, 432]


        //Example 5: Create an Integer list, then remove the first occurrence of 4
        List<Integer> f = new ArrayList<>();
        f.add(12);
        f.add(4);
        f.add(13);
        f.add(25);
        f.add(432);
        System.out.println(f);//[12, 4, 13, 25, 432]

        f.remove(Integer.valueOf(4));
        System.out.println(f);

        //Example 6: Type code to check if a specific element exists in the list or not
        List<Double> g = new ArrayList<>();
        g.add(12.99);
        g.add(5.02);
        g.add(11.23);
        boolean ex = g.contains(5.02);
        System.out.println(ex);
        g.set(1, 666.0);
        System.out.println(g);


        //Example 8: Type code to increase all salaries 10 percent in an Integer List
        //           [5000, 6000, 4500, 3900, 7200]
        List<Double> k = new ArrayList<>();
        k.add(5000.0);
        k.add(6000.0);
        k.add(4500.0);
        k.add(3900.0);
        k.add(7200.0);
        System.out.println(k);
        for ( int i = 0 ; i<k.size();i++){

            k.set(i, k.get(i)*1.1);

        }
        System.out.println(k);

        //How to check if two lists are same or not

        if (k.equals(g)){
            System.out.println("Same");
        }else {
            System.out.println("Not same");
        }


        //How to check if a list contains multiple elements
        //[12, 23, 32, 14, 24, 56] ==> Check if the list has 23, 56, and 24
        List<Integer> p = new ArrayList<>();
        p.add(12);
        p.add(23);
        p.add(32);
        p.add(14);
        p.add(24);
        p.add(56);

        List<Integer> q = new ArrayList<>();
        q.add(23);
        q.add(56);
        q.add(24);

        boolean cont =p.containsAll(q);
        System.out.println(cont);
        boolean cont2 = q.containsAll(p);
        System.out.println(cont2);










    }




}
