class Solution {
    public int[] solution(String[] intStrs, int k, int s, int l) {
        
        int count=0;
        for(String a:intStrs){
            int b = Integer.parseInt(a.substring(s,s+l));
            if(b>k) count++;
            
            
        }
        int[] answer = new int[count];
        count=0;
        for(String a:intStrs){
            int b = Integer.parseInt(a.substring(s,s+l));
            if(b>k) answer[count++]=b;
            
            
        }
        
        
        return answer;
    }
}