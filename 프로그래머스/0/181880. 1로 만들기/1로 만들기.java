class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        
        for(int a:num_list){
            
            while(1<a){
                if(a%2==0){
                    a/=2;
                    answer++;
                }else{
                    a=(a-1)/2;
                    answer++;
                }
                
            }
            
        }
        
        
        return answer;
    }
}