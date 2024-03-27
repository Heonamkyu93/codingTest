import java.util.Arrays;

class Solution {
    public int[] solution(int[] arr) {
        int n = arr.length;
        
        while ((n & (n - 1)) != 0) {
            n++; 
        }
        
        return Arrays.copyOf(arr, n); 
    }
}
