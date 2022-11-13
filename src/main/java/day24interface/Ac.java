package day24interface;

public interface Ac extends BigAc {

    void digital();

    void price();

     int price = 2300;

     String name = "Perfect Ac";

     //To create

    public  default int Calculate(){
        return 1200;
    }

    public static boolean climate(){
        return true;
    }
}
