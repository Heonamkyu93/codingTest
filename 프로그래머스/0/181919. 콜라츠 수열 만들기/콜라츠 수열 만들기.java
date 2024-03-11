class Solution {
    public int[] solution(int n) {
        
        int count =1;
        int k=n;
        while(1<k){
            if(k%2==0){
                k/=2;
                count++;
            }else{
                k=3*k+1;
                count++;
            }
        }
        int[] answer = new int[count];
        int idx=1;
        answer[0]=n;
        while(1<n){
            if(n%2==0){
                n/=2;
                answer[idx++]=n;
            }else{
                n=3*n+1;
                answer[idx++]=n;
            }
        }
        return answer;
    }
}