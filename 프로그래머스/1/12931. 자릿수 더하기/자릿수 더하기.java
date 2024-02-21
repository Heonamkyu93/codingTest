import java.util.*;

public class Solution {
    public int solution(int n) {
        int answer = 0;
        String value = n+"";
        
        char[] a=value.toCharArray();
          
        for(int i=0;i<a.length;i++){
             answer += Character.getNumericValue(a[i]);
        }

        System.out.println("Hello Java");

        return answer;
    }
}