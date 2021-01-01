package hard.JZ13;

public class Solution {
    public void reOrderArray(int [] array) {
        int[] temp=new int[array.length];
        int index=0;
        for(int i=0;i<array.length;i++){
            if(array[i]%2!=0){
                temp[index]=array[i];
                index++;
            }
        }
        for(int i=0;i<array.length;i++){
            if(array[i]%2==0){
                temp[index]=array[i];
                index++;
            }
        }
        for(int i=0;i<temp.length;i++){
            array[i]=temp[i];
        }
    }
}
