class Solution {
    public int solution(int n) {
        int answer = 1;
        int start=1;
        int end=1;
        int sum=1;
        while(start<n/2+1){
            if(sum==n){
                answer++;
                end++;
                sum+=end;
            }else if(sum>n){
	                sum-=start;
	                start++;
	            }else{
	                 end++;sum+=end;
	            }
        }
        
        
        
        return answer;
    }
}