package hard.JZ44;

public class Solution {
    public String ReverseSentence(String str) {
        StringBuffer sb=new StringBuffer();
        if(str.length()<0||str.trim().equals(""))
            return str;
        String[] strs=str.split(" ");
        for(int i=strs.length-1;i>0;i--){
            sb.append(strs[i]+" ");
        }
        sb.append(strs[0]);
        return sb.toString();
    }
}
