class Solution {
    public int solution(String myString, String pat) {
        int count = 0;
        int pl = pat.length();
        int sl = myString.length();
        
        for (int i = 0; i <= sl - pl; i++) {
            if (myString.substring(i, i + pl).equals(pat)) {
                count++;
            }
        }
        
        return count;
    }
}
