package medium.JZ40;

import java.util.*;
public class Solution {
    public void FindNumsAppearOnce(int [] array,int num1[] , int num2[]) {
        HashSet<Integer> set=new HashSet<>();
        for (Integer a : array) {
            if(set.contains(a)){
                set.remove(a);
            }else {
                set.add(a);
            }
        }
        int i=0;
        for (Integer b : set){
            if(i==0){
                num1[0]=b;
                i=1;
            }else {
                num2[0]=b;
            }
        }
    }
}