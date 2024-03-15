class Solution {
    public String[] solution(String my_str, int n) {
        int l = (my_str.length()%n==0)?my_str.length()/n:my_str.length()/n+1;
        
        
        String[] answer = new String[l];
        int idx=0;
        for(int i=0;i<my_str.length();i+=n){
            if(my_str.length()<i+n){
                answer[idx++]=my_str.substring(i);
                continue;
            }
            answer[idx++]=my_str.substring(i,i+n);
        }
        
        
        return answer;
    }
}