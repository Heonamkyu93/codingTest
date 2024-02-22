class Solution {
    public boolean solution(int x) {
        int sum =0;
        int clone=x;
        while(0<x){
           sum += x % 10; 
    x = x / 10;
        }
        boolean answer = (clone%sum==0)?true:false;
        return answer;
    }
}