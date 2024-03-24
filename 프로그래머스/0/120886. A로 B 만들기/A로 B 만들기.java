import java.util.*;

class Solution {
    public int solution(String before, String after) {
        List<Character> list = new ArrayList<>();
        
       
        for(char c : before.toCharArray()) {
            list.add(c);
        }
        
       
        for(char c : after.toCharArray()) {
            Iterator<Character> iterator = list.iterator();
            while(iterator.hasNext()) {
                if(iterator.next() == c) {
                    iterator.remove();
                    break;
                }
            }
        }
        
      
        return list.isEmpty() ? 1 : 0;
    }
}
