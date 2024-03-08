import java.util.*;
class Solution {
    public String[] solution(String myString) {
        String[] raw = myString.split("x");
        int count =0;
        for(String a:raw){
            if(a.isEmpty()) continue;
            count++;
        }
        String[] answer = new String[count];
        int idx=0;
        for(int i=0;i<raw.length;i++){
            if(raw[i].isEmpty()) continue;
            answer[idx++]=raw[i];
        }
        Arrays.sort(answer);
        
        
        return answer;
    }
}