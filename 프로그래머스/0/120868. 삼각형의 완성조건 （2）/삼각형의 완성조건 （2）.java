import java.util.*;
class Solution {
    public int solution(int[] sides) {
        
        Arrays.sort(sides);
        int big = sides[1];
        int small = sides[0];
        
        int answer=(big+small)-(big-small)-1;
        
        
        
        
        return answer;
    }
}