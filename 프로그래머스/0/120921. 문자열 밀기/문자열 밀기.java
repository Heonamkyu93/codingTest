class Solution {
    public int solution(String A, String B) {
        String tb = B.repeat(3);
        return tb.indexOf(A);
    }
}