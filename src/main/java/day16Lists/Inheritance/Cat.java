package day16Lists.Inheritance;

public class Cat extends Mammals{
    public String name ="Cat";

    public  void eat(){
        System.out.println("cat eat...");
    }

    public Cat(){

        System.out.println("cat1 constructor..........");
        System.out.println(this.name);



    }
}
