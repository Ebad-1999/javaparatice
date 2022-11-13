package day16Lists;

import java.util.ArrayList;
import java.util.List;

public class Lists01 {
    public static void main(String[] args) {

        ArrayList<String> a = new ArrayList<String>();
        ArrayList<String> b = new ArrayList<>();
        List<Integer> c= new ArrayList<>();
        c.add(23);
        c.add(55);
        c.add(33);
        c.add(66);
        System.out.println(c);//[23, 55, 33, 66]
        c.add(3, 1);
        System.out.println(c);//[23, 55, 33, 1, 66]

        List<Integer> d = new ArrayList<>();
        d.add(100);
        d.add(200);
        d.add(300);
        System.out.println(d);//[100, 200, 300]

        d.addAll(c);
        System.out.println(d);//[100, 200, 300, 23, 55, 33, 1, 66]

        int siz = d.size();
        System.out.println(siz);//8

        //Example type code to check is the given list is empty or not?
        List<String> e = new ArrayList<>();
        e.add("Ahmad");
        e.add("Ebad Jan");
        e.add(" ");
        e.add(" ");
        e.add(" ");
        e.add(" ");
        System.out.println(e);//[Ahmad, Ebad Jan,  ,  ,  ,  ]

        List<String> f = new ArrayList<>();
        f.add(" ");
        //way
        if (e==f){
            System.out.println("is Empty");
        }else {
            System.out.println("not Empty");//not Empty
        }

        //way2
       int size = e.size();
        if (e.size()==0){
            System.out.println("is Empty");
        }else {
            System.out.println("not Empty");//not Empty
        }

        //way3
        boolean emp =e.isEmpty();
        if (emp){
            System.out.println("is Empty");
        }else {
            System.out.println("not Empty");//not Empty
        }

        List<String> n = new ArrayList<>();
        n.add(" ");
        n.add(" ");
        n.add(" ");
        n.add(" ");
        n.add("a");

        System.out.println(n);

        List<String> m = new ArrayList<>();
        m.add(" ");

        n.removeAll(e);
        System.out.println(n);

        if (n.isEmpty()){
            System.out.println("is Empty");
        }else {
            System.out.println("not Empty");//not Empty
        }







































    }
}
