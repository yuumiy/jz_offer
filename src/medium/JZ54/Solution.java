package medium.JZ54;

import java.util.*;
public class Solution {
    private Map<Character,Integer> map=new HashMap<>();
    private StringBuffer str=new StringBuffer();
    private int index=0;
    public void Insert(char ch)
    {
        str.append(ch);
        map.put(ch,map.getOrDefault(ch,0)+1);
    }

    public char FirstAppearingOnce()
    {
        while(index<str.length()){
            if(map.get(str.charAt(index))==1)
                return str.charAt(index);
            index++;
        }
        return '#';
    }
}
