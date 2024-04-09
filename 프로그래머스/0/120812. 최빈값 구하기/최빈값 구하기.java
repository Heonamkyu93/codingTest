import java.util.*;

class Solution {
    public int solution(int[] array) {
        int answer = 0;
        
       
        Map<Integer, Integer> freqMap = new HashMap<>();
        
       
        for (int num : array) {
            freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
        }
        
       
        int maxFreq = Collections.max(freqMap.values());
        
       
        List<Integer> modes = new ArrayList<>();
        for (Map.Entry<Integer, Integer> entry : freqMap.entrySet()) {
            if (entry.getValue() == maxFreq) {
                modes.add(entry.getKey());
            }
        }
        
       
        if (modes.size() > 1) {
            answer = -1;
        } else {
       
            answer = modes.get(0);
        }
        
        return answer;
    }
}
