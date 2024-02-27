class Solution {
    public int[] solution(int n, int[] numlist) {
        int count =0;
        
        for(int a:numlist){
            if(a%n==0) count++;
        }
        
        
        int[] answer = new int[count];
        
        int idx=0;
        
        for(int b:numlist){
            if(b%n==0) answer[idx++]=b; 
        }
        
        

        return answer;
    }
}