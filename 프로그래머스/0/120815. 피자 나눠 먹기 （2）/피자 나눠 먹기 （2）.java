class Solution {
    public int solution(int n) {
        
        int idx=1;
        while(n<(n*6)){
            if((6*idx)%6==0 && (6*idx)%n==0) return idx;
            idx++;
        }
        
        
      
        
        
        return idx;
    }
}