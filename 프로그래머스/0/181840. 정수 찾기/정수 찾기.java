import java.util.Arrays;
class Solution {
    public int solution(int[] num_list, int n) {
        Arrays.sort(num_list);
        
        int answer = (Arrays.binarySearch(num_list, n) > -1) ? 1 : 0;
        return answer;
    }
}