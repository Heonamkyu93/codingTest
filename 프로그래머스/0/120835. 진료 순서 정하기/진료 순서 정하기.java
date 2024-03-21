import java.util.*;
class Solution {
    public int[] solution(int[] emergency) {
        int[] answer = new int[emergency.length];
        Integer[] copy = new Integer[emergency.length];
        for(int i=0;i<emergency.length;i++){
           copy[i]=emergency[i];
        }
         Arrays.sort(copy, Comparator.reverseOrder());
        
        for(int i=0;i<emergency.length;i++){
            for(int j=0;j<emergency.length;j++){
                if(copy[i]==emergency[j]) {answer[j]=i+1;break;}
                
            }
        }
        return answer;
    }
}