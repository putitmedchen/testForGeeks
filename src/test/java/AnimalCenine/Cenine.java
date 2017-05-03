package AnimalCenine;

public abstract class Cenine extends Animal {


    public void wegTail() {
        System.out.println("Wagging");
    }

    @Override
    public void move() {
        System.out.println("Run");
    }
}
