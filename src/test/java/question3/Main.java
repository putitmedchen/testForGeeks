package question3;

public class Main {

    public static void main(String[] args) {

        Pet myPet = new Cat();
        Cat johnCat = new Cat();
        Ball ball = new Ball();

        System.out.println(String.format("My %s is playing with a %s, John's %s is sleeping",
                myPet.getName(), ball.getName(), johnCat.getName()));
    }

}
