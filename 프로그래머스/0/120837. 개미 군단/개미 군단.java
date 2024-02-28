class Solution {
    public int solution(int hp) {
        int count =hp/5;
        count+=(hp%5)/3;
        count+=((hp%5)%3)/1;
        
    
        return count;
    }
}