import java.util.*;
class Solution {
    public String solution(String s) {
        
      int max = Integer.MIN_VALUE; 
int min = Integer.MAX_VALUE; 
        StringTokenizer stz = new StringTokenizer(s);
        while(stz.hasMoreTokens()){
              int token = Integer.parseInt(stz.nextToken());
                if(token>max) max=token;
                if(token<min) min=token;
        }
        String answer = min+" "+max;
        return answer;
    }
}