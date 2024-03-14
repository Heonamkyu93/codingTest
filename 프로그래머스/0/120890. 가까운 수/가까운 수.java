class Solution {
    public int solution(int[] array, int n) {
        int answer = 0;
        int min = Integer.MAX_VALUE;

        for (int num : array) {
            int diff = Math.abs(n - num);
            if (diff < min || (diff == min && num < answer)) {
                min = diff;
                answer = num;
            }
        }

        return answer;
    }
}
