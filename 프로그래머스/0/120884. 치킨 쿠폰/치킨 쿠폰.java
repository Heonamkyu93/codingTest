class Solution {
    public int solution(int c) {
        int answer = 0;
            
        while(c>9){
            answer+=c/10;
            c=c/10+c%10;    
        
        }
        
        
        
        return answer;
    }
}


    
    