class Solution {
    public String solution(String my_string) {
        String answer = "";
        
        char[] a=my_string.toCharArray();
        for(char c:a){
            if(c=='a' || c=='e' || c=='i' || c=='o' || c=='u') continue;
            answer+=c;
        }
        
        
        
        
        return answer;
    }
}