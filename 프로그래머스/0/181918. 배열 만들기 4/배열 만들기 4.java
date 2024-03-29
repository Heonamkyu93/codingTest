import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        List<Integer> l = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if (l.isEmpty()) {
                l.add(arr[i]);
            } else if (l.get(l.size() - 1) < arr[i]) {
                l.add(arr[i]);
            } else if (l.get(l.size() - 1) >= arr[i]) {
                l.remove(l.size() - 1);
                i--; 
            }
        }
        int[] stk = new int[l.size()];
        for (int i = 0; i < l.size(); i++) {
            stk[i] = l.get(i);
        }
        return stk;
    }
}
