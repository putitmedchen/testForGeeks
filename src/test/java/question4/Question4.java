package question4;

import javax.swing.text.html.HTMLDocument;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Question4 {

    List<Integer> list = new ArrayList<Integer>(Arrays.asList(2,1,3,5,4,6,8,9,0));

    private void snippet1(List<Integer> list){
        for(Integer element : list){
            if (element % 2 == 0){
                list.remove(element);
            }
        }
        System.out.println(list);
    }

    private void snippet2(List<Integer> list) {
        Iterator<Integer> iterator = list.iterator();
        while (iterator.hasNext()){
            Integer element = iterator.next();
            if(element %  2 == 0){
                iterator.remove();
            }
        }
        System.out.println(list);
    }

    private void snippet3(List<Integer> list) {
        List<Integer> tempList = new ArrayList<Integer>();

        for (Integer element: list){
            if (element % 2 == 0){
                tempList.add(element);
            }
        }
        list.removeAll(tempList);
        System.out.println(list);
    }




    public static void main(String[] args) {
        Question4 question4 = new Question4();
        question4.snippet1(new ArrayList<Integer>(Arrays.asList(2,1,3,5,4,6,8,9,0)));
        //System.out.println(question4.list);
    }

}
