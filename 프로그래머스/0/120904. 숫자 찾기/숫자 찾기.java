class Solution {
    public int solution(int num, int k) {
        int answer = -1;
        
        String[] a = (num+"").split("");
        String b=k+"";
        for(int i=0;i<a.length;i++){
            if(a[i].equals(b)) return answer=i+1;
            
        }
        
        
        
        
        return answer;
    }
}