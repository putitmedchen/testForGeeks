package Asteroids;

import java.util.ArrayList;
import java.util.List;

public class Lamda2 {

    public static void main(String[] args) {

        List<Asteroid> asteroids = new ArrayList<>();
        asteroids.add(new Asteroid("Filia", 284));
        asteroids.add(new Asteroid("Pallas", 512));
        asteroids.add(new Asteroid("Deamon", 268));
        asteroids.add(new Asteroid("Juno", 258));
        asteroids.add(new Asteroid("Eygie", 431));
        asteroids.add(new Asteroid("Devile", 289));

        Asteroid c = asteroids
                .stream()
                .reduce(asteroids.get(0),
                        (a, b) -> a.getDiameter() > b.getDiameter() ? a : b);
        System.out.println(c);
    }

}
