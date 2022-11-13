package day32LambdaFP01;

public class UtilsClass {

    public static void printInTheSameLineWithTheSpace(Object str){
        System.out.print(str+" ");

    }

    public static boolean checkToBEEven(int x){
        return x%2==0;
    }

    public static boolean checkToBEOdd(int x){
        return x%2!=0;
    }

    public static int getSquare(int x){
        return x*x;
    }

    public static int getCub(int x){
        return x*x*x;
    }

    public static double getHalf(int x){
        return x/2.0;
    }

    public static int getLength(String str){
        return str.charAt(str.length()-1) ;
    }
}
