class Solution {
    public int solution(int order) {
        String a=order+"";
        int answer = a.length()-a.replaceAll("[369]", "").length();
        return answer;
    }
}