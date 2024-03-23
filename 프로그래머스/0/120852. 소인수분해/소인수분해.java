import java.util.*;
class Solution {
    public int[] solution(int n) {
        int a=n;
       
          LinkedHashSet<Integer> linkedSet = new LinkedHashSet<>();
        for(int i=2;i<=n;i++){
             while (n % i == 0) {
               linkedSet.add(i);
                n /= i;
            }
        }
        int[] answer = new int[linkedSet.size()];
        int idx=0;
       for(int q:linkedSet){
           answer[idx++]=q;
       }
        return answer;
    }
}