package day18PassByValueDateTime;

public class VarArgs {

    public static void main(String[] args) {


        System.out.println(add(3, 22));

    }

    public static int add (int b, int... a){

        int sum = 0;
        for (int w : a){
            sum = sum+w;


        }
        return sum;
    }




}
