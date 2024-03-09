class Solution {
    public String solution(String myString) {
        char[] a=myString.toCharArray();
         String answer = "";
        for(char c:a){
            if(c>='a' && c<'l') {
              answer+='l';
                continue;
            }
            answer+=c;
        }
        
       
        
        
        
        
        return answer;
    }
}