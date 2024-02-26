class Solution {
    public int solution(int n) {
        int answer=(Math.sqrt(n) - Math.floor(Math.sqrt(n))) == 0?1:2;
        return answer;
    }
}