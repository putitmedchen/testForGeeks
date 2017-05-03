package AnimalCenine;

public class Main {

    public static void main(String[] args) {

        Dog d = new Dog();
        d.makeNoise();
        d.move();
        d.wegTail();
        d.fetch();

        Cenine c = new Dog();
        c.makeNoise();
        c.move();
        c.wegTail();
        //c.fetch();

        Animal a = new Dog();
        a.makeNoise();
        a.move();
        //a.wegTail();
        //a.fetch();
    }

}
