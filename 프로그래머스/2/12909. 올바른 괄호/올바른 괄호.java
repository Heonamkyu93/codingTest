import java.util.*;
class Solution {
    boolean solution(String s) {
        boolean answer = true;
        Stack<Character> st = new Stack<>();
        for(char a:s.toCharArray()){
            if(a=='('){
               st.push(a); 
            }else if(a==')'){
                if(st.isEmpty()){
                    answer=false;
                    break;
                }else{
                    st.pop();
                }
            }
            
        }
        
          if (!st.isEmpty()) {
            answer = false;
        }
        

        return answer;
    }
}