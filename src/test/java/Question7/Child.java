package Question7;


public class Child extends Parent {

    {
        System.out.print("C ");
    }

    static {
        System.out.print("D ");
    }

    public static void main(String[] args) {
        Child child = new Child();
    }

}
