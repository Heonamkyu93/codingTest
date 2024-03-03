class Solution {
    public int solution(int[] numbers) {
        int max = Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int min2 = Integer.MAX_VALUE;

        for (int num : numbers) {
            if (num > max) {
                max2 = max;
                max = num;
            } else if (num > max2) {
                max2 = num;
            }

            if (num < min) {
                min2 = min;
                min = num;
            } else if (num < min2) {
                min2 = num;
            }
        }

        return Math.max(max * max2, min * min2);
    }
}
