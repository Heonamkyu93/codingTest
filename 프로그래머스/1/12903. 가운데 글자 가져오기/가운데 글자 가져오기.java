class Solution {
    public String solution(String s) {
        int l = s.length();
        String answer ="";
        if(l%2!=0)  answer = String.valueOf(s.charAt(l / 2));
        else if(l%2==0) answer = s.substring(l / 2 - 1, l / 2 + 1);
      
        return answer;
    }
}