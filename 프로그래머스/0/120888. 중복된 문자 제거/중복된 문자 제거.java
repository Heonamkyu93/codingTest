class Solution {
    public String solution(String my_string) {
        String[] a = my_string.split("");
        String answer = "";
        for(String b:a){
            if(answer.contains(b)) continue;
            answer+=b;
        }
        
        
        return answer;
    }
}