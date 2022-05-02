package module15;

import java.util.ArrayList;
import java.util.List;

public class ArrayFun {

    public List<Integer> arrayFun(List<List<Integer>> funList){
        List<Integer> happyList = new ArrayList<>();

        for(List<Integer> list : funList){
            int sum = 0;
            int size = list.size();
            for(int num : list){
                if(num < 0){
                    throw new IllegalArgumentException("Ruh Roh Raggy!");
                }
                sum += num;
            }
            happyList.add(sum/size);
        }
        return happyList;
    }
}
