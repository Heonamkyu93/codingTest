class Solution {
    public int solution(int a, int b) {
        if(a%2!=0 && b%2!=0) return (int)(Math.pow(a, 2) + Math.pow(b, 2));
        if(a%2!=0 || b%2!=0) return 2*(a+b);
        if(a%2==0 && b%2==0) return Math.abs(a-b);
        
        
        return 0;
       
    }
}