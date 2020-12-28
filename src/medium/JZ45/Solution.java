package medium.JZ45;

import java.util.*;
public class Solution {
    public boolean isContinuous(int [] numbers) {
        if(numbers.length<5||numbers.length>5)
            return false;
        TreeSet<Integer> set=new TreeSet<>();
        int num=0;
        for(int i=0;i<numbers.length;i++){
            if(numbers[i]==0)
                num++;
            else
                set.add(numbers[i]);
        }
        if((set.size()+num)!=5)
            return false;
        if(set.last()-set.first()<5)
            return true;
        return false;
    }
}
