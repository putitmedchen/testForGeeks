package Asteroids;

public class Asteroid {

    private String name;
    private double diameter;

    public Asteroid(String name, double diameter) {
        this.setName(name);
        this.setDiameter(diameter);
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public double getDiameter(){
        return diameter;
    }

    public void setDiameter(double diameter){
        this.diameter = diameter;
    }

    public String toString(){
        return String.format("%s  [%.2f]", getName(), getDiameter());
    }

}
