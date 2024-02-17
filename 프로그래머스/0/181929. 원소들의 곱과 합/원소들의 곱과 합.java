class Solution {   
    public int solution(int[] num_list) {    // 06:01
        
        int sum =0;
        int square =1;
        for(int a:num_list){
            sum+=a;
            square*=a;
        }
        int answer = ((sum*sum)>square)?1:0;
        return answer;
    }
}