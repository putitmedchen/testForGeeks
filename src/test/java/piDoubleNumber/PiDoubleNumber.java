package piDoubleNumber;

import java.util.ArrayList;

public class PiDoubleNumber {

    private static void addPi(ArrayList<Double> list){
        list.add(Math.PI);
    }

    public static void main(String[] args) {
        ArrayList<Double> aList = new ArrayList<>();
        ArrayList<Number> numList = new ArrayList<>();
        addPi(aList);


        //ERROR
        //addPi(numList);

        System.out.println(aList.toString());
        System.out.println(numList.toString());
    }

}
