package day29HashMap;

import java.util.Collection;
import java.util.HashMap;
import java.util.Set;

public class HashMap01 {

    public static void main(String[] args) {

       HashMap<String, Integer> a = new HashMap<>();
        a.put("Ali Can", 13);
        a.put("Tom Hanks", 46);
        a.put("Brad Pit", 55);
        a.put("Angelina Julie", 48);

        System.out.println(a);//{Tom Hanks=46, Brad Pit=55, Angelina Julie=48, Ali Can=13}

        Set<String> key = a.keySet();
        System.out.println(key);

        Collection<Integer> val = a.values();
        System.out.println(val);

        a.put(null, 23);
        System.out.println(a);

        a.put("Ahmadi", null);
        System.out.println(a);

        Integer aHmadi = a.get("Ali Can");
        System.out.println(aHmadi);

        a.putIfAbsent("Ahmad", 45);
        System.out.println(a);

        a.replace("Ali Can", 13, 222);
        System.out.println(a);
    }
}
