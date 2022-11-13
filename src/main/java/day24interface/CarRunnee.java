package day24interface;

public class CarRunnee {
    public static void main(String[] args) {

        Honda h = new Honda();

        System.out.println(Brake.price);//4500

        System.out.println(Ac.price);//2300

        System.out.println(Engine.price);//7500

        h.digital();//THis is digital AC

        System.out.println((Brake.luxury));//true

        System.out.println(Ac.name);//Perfect AC

        System.out.println( h.Calculate());//1200

        System.out.println(Ac.climate());//true
    }
}
