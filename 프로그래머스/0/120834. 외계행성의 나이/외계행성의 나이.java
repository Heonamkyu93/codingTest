class Solution {
    public String solution(int age) {
        StringBuilder ageInAlphabet = new StringBuilder();
        
       
        String ageStr = age+"";
        
       
        for(int i = 0; i < ageStr.length(); i++) {
       
            char alphabet = (char) ('a' + (ageStr.charAt(i) - '0'));
            ageInAlphabet.append(alphabet);
        }
        
        return ageInAlphabet.toString();
    }
}
