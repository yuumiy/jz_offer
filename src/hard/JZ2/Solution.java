package hard.JZ2;

public class Solution {
    public String replaceSpace(StringBuffer str) {
        StringBuffer temp=new StringBuffer();
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)==' ')
                temp.append("%20");
            else
                temp.append(str.charAt(i));
        }
        return temp.toString();
    }
}
