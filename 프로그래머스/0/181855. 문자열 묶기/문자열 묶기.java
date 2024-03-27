import java.util.*;
class Solution {
    public int solution(String[] strArr) {
        int answer = 0;
        Map<Integer,Integer> m =new HashMap<>();
        for(String a:strArr){
            int l = a.length();
            m.put(l, m.getOrDefault(l, 0) + 1);
        }
        for(int a:m.values()){
            answer=Math.max(answer, a);
        }
        return answer;
    }
}