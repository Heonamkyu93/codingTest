import java.util.*;

class Solution {
    public int[] solution(int[] numlist, int n) {
       
        TreeMap<Integer, List<Integer>> map = new TreeMap<>();
        
        
        for (int num : numlist) {
            int distance = Math.abs(num - n);
            if (!map.containsKey(distance)) {
                map.put(distance, new ArrayList<>());
            }
            map.get(distance).add(num);
        }
        
        
        List<Integer> sortedList = new ArrayList<>();
        for (List<Integer> list : map.values()) {
        
            Collections.sort(list, Collections.reverseOrder());
            sortedList.addAll(list);
        }
        
        
        int[] answer = new int[numlist.length];
        for (int i = 0; i < sortedList.size(); i++) {
            answer[i] = sortedList.get(i);
        }
        return answer;
    }
}
