package question5;

import org.eclipse.jetty.util.ArrayQueue;

import java.util.*;

public class Question5 {

    Collection<String> collection = new TreeSet<>();

    public static void main(String[] args) {

        //TODO: NOT WORKING
        //Collection<String> collection = new TreeSet<>();
        //Collection<String> collection = new PriorityQueue<>();

        //TODO: CORRECT
        //Collection<String> collection = new LinkedHashSet<>();
      Collection<String> collection = new ArrayDeque<>();
//        Collection<String> collection = new ArrayList<>();
//        Collection<String> collection = new LinkedList<>();


        collection.add("hrth");
        collection.add("feffe");
        collection.add("dreferf");
        collection.add("adfgbegb");
        collection.add("bdgh");

        collection.forEach(System.out::println);

    }

}
