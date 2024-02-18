class Solution {
    public int solution(int n) {
        int answer = 0;
        int count=n;
        while(0<count){
            if(n%count==0) answer+=count;
            count--;
        }
        return answer;
    }
}