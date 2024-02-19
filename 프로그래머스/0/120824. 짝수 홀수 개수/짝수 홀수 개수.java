class Solution {
    public int[] solution(int[] num_list) {
        int even =0;
        
        for(int a:num_list){
            if(a%2==0) even++;
        }
        int[] answer = {even,num_list.length-even};
        return answer;
    }
}