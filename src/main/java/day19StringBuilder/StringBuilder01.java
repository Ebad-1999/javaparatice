package day19StringBuilder;

public class StringBuilder01 {
    public static void main(String[] args) {


        //What is "StringBuilder Class"?
        //"StringBuilder Class" is for creating "Mutable Strings"

        //We use "String Class" to create a String, why or when we will need "StringBuilder Class"?
        //String Class is "Immutable", "StringBuilder Class" is "Mutable".

        //String Class is "immutable" because of that it does not change existing value.
        //If you want to assign a new value to a variable, Java will create a new container inside the "String Pool"
        //then will put new value in it, then changes the address pointer to the new container.

        String name = "Tom";
        name = "Mark";
        System.out.println(name);//Mark

        //If any container does not have any address pointer, "Garbage Collector" removes the container
        //from the memory. Before removing things from memory, Java "finalize" them, without
        //finalizing Java does not remove anything from memory.

        String s = "Jhon";
        String r = "Jhon";
        r = "Sam";
        System.out.println(r);//Sam

        //I want a separate container whose value is Jhon
        String u = new String("Jhon");
        System.out.println(u);//Jhon

        //If you want to change the value directly, without creating new container in memory you can use "StringBuilder" Class
        StringBuilder sc1 = new StringBuilder("Clare");
        sc1 = new StringBuilder("Jim");
        System.out.println(sc1);//Jim

        //How to create a StringBuilder
        //way: 1
        StringBuilder sb= new StringBuilder("Mary");
        System.out.println(sb);//Mary

        sb.append("Karl");
        System.out.println(sb);//MaryKarl

        //way: 2
        StringBuilder sb1 = new StringBuilder();
        sb1.append("Jahid");
        sb1.append("Mustafa");

        System.out.println(sb1);//JahidMustafa
        sb1.append("Ali");
        System.out.println(sb1);//JahidMustafaAli

        sb1.append("Ocean");
        System.out.println(sb1);//JahidMustafaAliOcean

        sb1.append("USA").append("UAE").append("UE");
        System.out.println(sb1);//JahidMustafaAliOceanUSAUAEUE

        //How to learn the capacity in a StringBuilder
        StringBuilder sb3 = new StringBuilder();
        sb3.append("Laila").append("The uEA").append("Mexico").append("....................");
        System.out.println(sb3);

       int len = sb3.length();
        System.out.println(len);//38

        int cap = sb3.capacity();
        System.out.println(cap);//70






















    }
}
