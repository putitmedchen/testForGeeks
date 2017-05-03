package Interfaces;

public interface SecondInterface {

    String talk();

    default String wisper(){
        return talk() + " but less annoying";
    }

    default String shout(){
        return talk() + " but more annoying";
    }

}
