import java.util.*;
class Solution {
    public int[] solution(String my_string) {
        String[] s = my_string.split("");
        int count =0;
        for(String a:s){
            if(a.matches("^-?\\d+$")) count++;
        }
        
        
        int[] answer = new int[count];
        
        int idx=0;
        
        for(String a:s){
             if(a.matches("^-?\\d+$")) answer[idx++]=Integer.parseInt(a);
        }
        Arrays.sort(answer);
        
        return answer;
    }
}