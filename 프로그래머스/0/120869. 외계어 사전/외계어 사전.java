import java.util.*;

class Solution {
    public int solution(String[] spell, String[] dic) {
        List<String> list = new ArrayList<>(Arrays.asList(spell));  
        
        for (int i = 0; i < dic.length; i++) {
            String word = dic[i];  
            List<String> al = new ArrayList<>(list); 
            
            for (int j = 0; j < word.length(); j++) {
                String lt = String.valueOf(word.charAt(j));  
                if (al.contains(lt)) {  
                    al.remove(lt); 
                }
            }
            
            if (al.isEmpty()) { 
                return 1;  
            }
        }
        
        return 2;
    }
}