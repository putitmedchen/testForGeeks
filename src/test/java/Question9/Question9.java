package Question9;

import java.util.List;

public class Question9 {

    void addCollsectionString(List<String> list){
        list.add("str");
    }

    void addToSuperStringList(List<? super String> list){
        list.add("str");
    }

    void addToObjectList(List<Object> list){
        list.add("str");
    }

    void addToRawList(List list){
        list.add("str");
    }

//    <T> void addToGenericwList(List<T> list){
//        list.add("str");
//    }
//
//    void addToExtendsStringList(List<? extends String> list){
//        list.add("str");
//    }


}
