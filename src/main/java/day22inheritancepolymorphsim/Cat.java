package day22inheritancepolymorphsim;

public class Cat extends Mammal {

    public int GDP = 20000;

    public Cat(){

        System.out.println(this.GDP);

        System.out.println(super.price);

        System.out.println(super.name);
    }

    @Override
    public void jump() {
        System.out.println("Cats jump");

    }
}
