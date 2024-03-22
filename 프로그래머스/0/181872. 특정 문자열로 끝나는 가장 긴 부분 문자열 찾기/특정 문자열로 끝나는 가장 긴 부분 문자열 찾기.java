class Solution {
    public String solution(String myString, String pat) {
        String answer = "";
        int l=pat.length();
        answer=myString.substring(0,myString.lastIndexOf(pat)+pat.length());
        
        return answer;
    }
}