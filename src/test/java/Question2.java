import java.util.ArrayList;
import java.util.List;

public class Question2 {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<Integer>();
        for(int i = 0; i <5; i++){
            list.add(i/2);
        }
        System.out.println(list);
    }
}
