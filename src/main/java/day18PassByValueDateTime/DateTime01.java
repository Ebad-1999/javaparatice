package day18PassByValueDateTime;

public class DateTime01 {
    public static void main(String[] args) {

        int price = 20;
        System.out.println(price);
        System.out.println(changy(price));

        price=changy(price);
        System.out.println(price);
    }

    public static  int changy(int a){
        return a*3;
    }



}