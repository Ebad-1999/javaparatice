package day23Encapsulation;

public class Runner {

    public static void main(String[] args) {


        Student n  = new Student();
        System.out.println(n.stname);
        System.out.println(n.isSeccessful());
        System.out.println(n.getAddress());
        System.out.println(n.getStId());

       n.setStId("fksdk");
        System.out.println(n.getStId());

        n.setAddress("kabul");
        System.out.println(n.getAddress());

        n.setSeccessful(false);
        System.out.println(n.isSeccessful());

    }


}
