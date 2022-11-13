package day16Lists.Inheritance;

public class Mammals extends Animal{


    public void eat(){
        System.out.println("mmales eat...");
    }

    public Mammals(){
        super();
        System.out.println("this is Mamaml Consrctor");
    }

}
