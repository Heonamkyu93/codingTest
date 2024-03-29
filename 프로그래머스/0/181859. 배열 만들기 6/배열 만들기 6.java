import java.util.*;
class Solution {
    public int[] solution(int[] arr) {
        
        List<Integer> l = new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            if(l.isEmpty()){
                l.add(arr[i]);
            }else if(l.get(l.size()-1)==arr[i]){
                l.remove(l.size()-1);
            }else if(l.get(l.size()-1)!=arr[i]){
                l.add(arr[i]);
            }
            
        }
        if(l.isEmpty()){
            int[] answer = {-1};
            return answer;
        }
        int[] answer = new int[l.size()];
        for(int i=0;i<l.size();i++){
            answer[i]=l.get(i);
        }
        return answer;
    }
}