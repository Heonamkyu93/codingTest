class Solution {
    public int solution(String number) {
        int answer = 0;
        String[] a = number.split("");
        for(String b:a){
        answer+=Integer.parseInt(b);
        }
        
        return answer%9;
    }
}