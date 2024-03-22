import java.util.*;
class Solution {
    public String solution(String s) {
        String answer = "";
        for(char c:s.toCharArray()){
              if (s.indexOf(c) == s.lastIndexOf(c)) answer+=c;
            
        }
        
        char[] q=answer.toCharArray();
        Arrays.sort(q);
        
        
        
        
        
        
        return new String(q);
    }
}