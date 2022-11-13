package day26Exception01;

public class E01 {
    public static void main(String[] args) {

        divide(6, 0);
        aVoid2(6, 0);

    }

    public static void divide(int a, int b){
        if (b==0){
            System.out.println("A number cannot be divided by zero");//A number cannot be divided by zero
        }else {
            System.out.println(a / b);
        }

    }

    public static void aVoid2(int a, int b){
        try {
            System.out.println(a/b);

            System.out.println("Hi exception");//don't read this code


        }catch (ArithmeticException e){

            System.out.println("A problem occurred in division");//A problem occurred in division

            System.out.println("By exception");//By exception
        }
    }
}
