import java.util.*;
class Solution {
    public int solution(int[] rank, boolean[] attendance) {
      
        List<Integer> al = new ArrayList<>();
        
       for (int i = 0; i < rank.length; i++) {
            if (attendance[i]) {
                al.add(rank[i]);
            }
        }
       Collections.sort(al);
        int a=0;
        int b=0;
        int c=0;
        
         for (int i = 0; i < rank.length; i++) {
           if(al.get(0)==rank[i]) a=i;
             if(al.get(1)==rank[i]) b=i;
             if(al.get(2)==rank[i]) c=i;
        }
        
        int answer = 10000 * a + 100 * b + c;
        
        
        return answer;
    }
}