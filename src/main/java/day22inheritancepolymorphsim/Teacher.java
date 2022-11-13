package day22inheritancepolymorphsim;

public class Teacher {

    public static void main(String[] args) {

        add(5.00, 8);
        add(5.0,9);
        add(4, 5, 6);



    }

    private static int add(double a, int b){
        System.out.println(a+b);
        return b;
    }

    public static double add(int a){
        return 8;
    }

    public static int add(int a, int b, int c){
        return a+b+c;
    }
    public final int add(int a, int c){
        System.out.println(c);
        return a;
    }
}
