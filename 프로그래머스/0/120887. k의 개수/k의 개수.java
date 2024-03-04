class Solution {
    public int solution(int i, int j, int k) {
        String a;
        String b=k+"";
        int answer = 0;
        while(i<=j){
            a=i+"";
            String[] c =a.split("");
            for(String q:c){
            if(q.contains(b)) answer++;    
            }
            
            
            
            i++;
        }
        
        
        
        
        return answer;
    }
}