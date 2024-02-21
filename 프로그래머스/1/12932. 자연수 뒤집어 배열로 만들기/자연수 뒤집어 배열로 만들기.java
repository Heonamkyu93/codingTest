import java.util.*;

class Solution {
    public int[] solution(long n) {
        String value = new StringBuilder(n+"").reverse().toString();
        char[] arr = value.toCharArray();
        
        
        int[] answer = new int[arr.length];
        for(int i=0;i<answer.length;i++){
            answer[i] = arr[i]-48;
        }
        
        return answer;
    }
}