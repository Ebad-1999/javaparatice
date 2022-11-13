package day23practice;

public class Q01 {

    /*
       Create a method that adds given integers except the first one and multiplies the sum by the first integer.
         a*(b+c+d+f)
    */

    public static void main(String[] args) {

    }




    public static void myMethod(int a, int...number){
        int sum = 0;
        for (int w : number){
            sum+=w;
        }
        System.out.println(a*sum);
    }

}
