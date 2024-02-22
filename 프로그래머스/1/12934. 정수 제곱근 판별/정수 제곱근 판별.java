class Solution {
    public long solution(long n) {
        double a=Math.sqrt(n);
        
        
       long answer = (a == (int)a) ? (long)Math.pow(a + 1, 2) : -1;


        return answer;
    }
}