package Interfaces;

public interface FirstInterface {

    String talk();

    default String wisper(){
        return talk() + " but softer";
    }

    default String yell(){
        return talk() + " but loader";
    }


}
