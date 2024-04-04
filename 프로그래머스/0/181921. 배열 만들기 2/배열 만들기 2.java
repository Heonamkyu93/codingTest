import java.util.*;
import java.util.regex.*;

class Solution {
    public int[] solution(int l, int r) {
        String regex = "\\b[05]+\\b"; 
        Pattern pattern = Pattern.compile(regex);
        
        List<Integer> al = new ArrayList<>();
        
        for(int i = l; i <= r; i++) {
            String a = String.valueOf(i); 
            Matcher match = pattern.matcher(a);
            if(match.find()) {
                al.add(i);
            }
        }
        
        if(al.size() == 0) {
            int[] q = {-1};
            return q;
        }
        
        int[] answer = new int[al.size()];
        for(int i = 0; i < al.size(); i++) {
            answer[i] = al.get(i);
        }
        
        Arrays.sort(answer);
        return answer;
    }
}
