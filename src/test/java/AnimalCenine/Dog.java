package AnimalCenine;

public class Dog extends Cenine {

    @Override
    public void makeNoise() {
        System.out.println("Bark");
    }

    public void fetch(){
        System.out.println("Fetch");
    }
}
