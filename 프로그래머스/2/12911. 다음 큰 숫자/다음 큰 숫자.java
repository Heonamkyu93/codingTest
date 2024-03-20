class Solution {
    public int solution(int n) {
        String bi = Integer.toBinaryString(n);
        int count = 0;
        for (int i = 0; i < bi.length(); i++) {
            char one = bi.charAt(i);
            if (one == '1') {
                count++;
            }
        }
        
        while (true) {
            n++;
            String bi2 = Integer.toBinaryString(n);
            int tempCount = 0;
            for (int i = 0; i < bi2.length(); i++) {
                char one = bi2.charAt(i);
                if (one == '1') {
                    tempCount++;
                }
            }
            if (tempCount == count) {
                break;
            }
        }

        return n;
    }
}
