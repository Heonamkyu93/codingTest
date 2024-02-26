class Solution {
    public String solution(String my_string, int n) {
        char[] a =my_string.toCharArray();
        String answer = "";
        for(char c:a){
            for(int i=0;i<n;i++){
                answer+=c;
            }
        }
        return answer;
    }
}