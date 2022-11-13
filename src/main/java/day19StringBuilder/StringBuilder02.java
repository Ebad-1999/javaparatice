package day19StringBuilder;

public class StringBuilder02 {
    public static void main(String[] args) {


        StringBuilder s = new StringBuilder("Mississippi");
        System.out.println(s);//Mississippi

        //toString() is used to change StringBuilders to Strings
        String test = s.toString();
        System.out.println(s);//Mississippi

        //INTERVIEW QUESTION::
        //reverse() is used to reverse a String.
        //If you get a question like "How to reverse a String" tell them;
        //i)I can reverse a String by using reverse() method from StringBuilder Class
        //ii)I can reverse a String by using loops.
        //Interviewer will tell you use the loops
        StringBuilder rev = s.reverse();
        System.out.println(rev);//ippississiM

        //deleteCharAt() is used to delete a character at a specific index
        s.deleteCharAt(2);
        System.out.println(s);//ipississiM

        //Note: When you use a method for StringBuilders, if it is "bold" and "not coming from String Class" it changes the original value
        //delete(starting index, ending index) is used to delete characters from "starting index" to "ending index"
        //"starting index" is inclusive, "ending index" is exclusive

        s.delete(3, 5);
        System.out.println(s);//ipiissiM

        //replace(starting index, ending index, new value) is used to change characters from "starting index" to "ending index" to a new value
        //"starting index" is inclusive, "ending index" is exclusive
        s.replace(4, 6 , "bababababa");
        System.out.println(s);//ipiibababababaiM

        //insert method insert a string in a specific index
        s.insert(2, "123456789");
        System.out.println(s);//ip123456789iibababababaiM


        /*
           The value 0 if this StringBuilder contains the same character sequence as that of the argument StringBuilder;
           a negative integer if the first StringBuilder is lexicographically less than the second StringBuilder argument;
           a positive integer if the first StringBuilder is lexicographically greater than the second StringBuilder argument.

           Note: compareTo() method does not ignore cases, it checks alphabetical order by using ASCII Values.
         */
        StringBuilder sb2 = new StringBuilder("Java is love");
        StringBuilder sb3 = new StringBuilder("Java ir love");

       int resu =  sb2.compareTo(sb3);
        System.out.println(resu);//1

        //setCharAt(index, new char value) is used to update a specific character at a specific index
        sb3.setCharAt(5,'m');
        System.out.println(sb3);//Java mr love

        /*
        1)Mechanism behind the "immutability"
        2)Benefits of "immutability"
        3)Difference between "immutability" and "mutability"
        4)Features of the StringBuilder
         */



















    }
}
