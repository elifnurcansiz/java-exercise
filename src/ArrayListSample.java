package algorithm.Array;

import java.util.ArrayList;
import java.util.List;

public class ArrayListSample {
    public static void main(String[] args) {
        ArrayList<Integer> list1= new ArrayList<>(List.of(1,2,3,4,5,6,7,8,8,8,8,9,9,10));
        ArrayList<Integer>list2=new ArrayList<>();
        for(int i =0; i<list1.size(); i++){
            if (list2.contains(list1.get(i))) continue;
            list2.add(list1.get(i));

        }
        System.out.println(list1);
        System.out.println(list2);
    }
}




