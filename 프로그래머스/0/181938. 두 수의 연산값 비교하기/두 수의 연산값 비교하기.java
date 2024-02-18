class Solution {
    public int solution(int a, int b) {  //02:36
        int hab = Integer.parseInt(""+a+b);
        int gob = 2*a*b;
        
        
        int answer = hab>gob?hab:gob;
        return answer;
    }
}