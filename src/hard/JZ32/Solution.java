package hard.JZ32;

public class Solution {
    public String PrintMinNumber(int [] numbers) {
        String str="";
        for(int i=0;i<numbers.length;i++){
            for(int j=i+1;j<numbers.length;j++){
                int a=Integer.valueOf(numbers[i]+""+numbers[j]);
                int b=Integer.valueOf(numbers[j]+""+numbers[i]);
                if(a>b){
                    int temp=numbers[i];
                    numbers[i]=numbers[j];
                    numbers[j]=temp;
                }
            }
        }
        for(int i=0;i<numbers.length;i++){
            str+=numbers[i]+"";
        }
        return str;
    }
}
