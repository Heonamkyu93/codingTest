import java.util.*;
class Solution {
    public int[] solution(int[] arr, int k) {
        int[] answer = new int[k];
        Arrays.fill(answer,-1);
        Set<Integer> s = new LinkedHashSet<>();
        for(int a:arr){
            s.add(a);
        }
        int idx=0;
       for(Integer q:s){
           answer[idx++]=q;
           if (idx == k) break;
       }
        
        
        return answer;
    }
}