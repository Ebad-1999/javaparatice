package day24interface;

public class Honda implements Ac, Brake, Engine {

    @Override
    public void digital() {
        System.out.println("THis is digital AC");

    }

    @Override
    public void secureBrake() {
        System.out.println("It stops securely");

    }

    @Override
    public void ecoengine() {
        System.out.println("This is ecoEngine");
    }

    @Override
    public void price() {
        System.out.println("Brake price");

    }


}
