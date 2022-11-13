package day17List;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class List02 {
    public static void main(String[] args) {

        List<Integer> a= new ArrayList<>();
        a.add(12);
        a.add(15);
        a.add(10);
        a.add(21);

        System.out.println(a);
        Collections.sort(a);
        System.out.println(a);

        int main = Integer.MAX_VALUE;
        for (int i =1 ; i<a.size();i++){
            main=Math.min(main, a.get(i)-a.get(i-1));

        }
        System.out.println(main);

        for (int i = 1 ; i<a.size(); i++){
            if (main==a.get(i)-a.get(i-1)){
                System.out.println(a.get(i-1)+" "+a.get(i));
            }
        }


















    }
}
