package medium.JZ31;

public class Solution {
    public int NumberOf1Between1AndN_Solution(int n) {
        int count=0;
        for(int i=1;i<=n;i++){
            int j=i;
            while(j>0){
                if(j%10==1)
                    count++;
                j/=10;
            }
        }
        return count;
    }
}
