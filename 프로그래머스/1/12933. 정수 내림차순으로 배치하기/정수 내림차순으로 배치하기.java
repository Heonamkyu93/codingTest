import java.util.*;
class Solution {
    public long solution(long n) {
        String a = n+"";
        char[] b = a.toCharArray();
        int[] c = new int[b.length];
        
        for(int i=0;i<b.length;i++){
            c[i]=b[i]-48;
        }
        Arrays.sort(c);
        String q="";
        for(int i=c.length-1;0<=i;i--){
            q+=c[i];
        }
        
        long answer = Long.parseLong(q);
        return answer;
    }
}