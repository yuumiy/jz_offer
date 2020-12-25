package easy.JZ51;

public class Solution {
    public int[] multiply(int[] A) {
        int[] B=new int[A.length];
        int temp=0;
        for(int i=0;i<A.length;i++){
            temp=A[i];
            B[i]=1;
            A[i]=1;
            for(int j=0;j<A.length;j++){
                B[i]*=A[j];
            }
            A[i]=temp;
        }
        return B;
    }
}
