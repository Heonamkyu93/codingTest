class Solution {
    public String solution(String my_string) {
        String answer = "";
        char[] a=my_string.toCharArray();
        for(char b:a){
            char c;
            if(Character.isUpperCase(b)) c=Character.toLowerCase(b);
            else c=Character.toUpperCase(b);
            answer+=c;
        }
        
        
        return answer;
    }
}