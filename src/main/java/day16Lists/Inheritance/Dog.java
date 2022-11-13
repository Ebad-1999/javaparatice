package day16Lists.Inheritance;

public class Dog extends Mammals{
    public String name ="Dog";

    public void eat(){
        System.out.println("dog eat...");
    }
    public Dog(){
        super();
        System.out.println(this.name);//Dog


    }
}
