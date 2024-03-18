class Solution {
    public int[] solution(String s) {
        int[] answer = {0,0};
        
        while(!s.equals("1")){
           
            int b=s.length();
            s=s.replace("0","");
            int l=s.length();
            answer[1]+=b-l;    
            s=Integer.toBinaryString(l);
            answer[0]++;
            
        }
        
        return answer;
    }
}