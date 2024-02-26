class Solution {
    public int solution(int n) {
        int idx=n;
         int answer = 0;
        while(idx>0){
        if(n%idx==0) answer++;
            idx--;
        }
        
        
       
        return answer;
    }
    
    
}