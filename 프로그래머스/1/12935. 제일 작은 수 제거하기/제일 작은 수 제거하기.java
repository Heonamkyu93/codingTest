import java.util.*;
class Solution {
    public int[] solution(int[] arr) {
       
        if(arr.length<2){
            int []answer={-1};
            return answer;
        }
        int min = Integer.MAX_VALUE;
        for(int a:arr){
        if(min>a) min=a;
        }
        
          int [] answer =  new int [arr.length-1];
        int count=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==min) continue;
            answer[count++]=arr[i];
        }
            
        
      
       
    
        
        return answer;
    }
}