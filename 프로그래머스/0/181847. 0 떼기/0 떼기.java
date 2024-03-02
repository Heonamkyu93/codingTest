class Solution {
    public String solution(String n_str) {
        
        String answer = "";
        
        
        boolean isLeadingZero = true;
        
        for (int i = 0; i < n_str.length(); i++) {
            char currentChar = n_str.charAt(i);
            
        
            if (isLeadingZero && currentChar != '0') {
                isLeadingZero = false;
            }
            
        
            if (!isLeadingZero) {
                answer += currentChar;
            }
        }
        
        
        return answer;
    }
}
