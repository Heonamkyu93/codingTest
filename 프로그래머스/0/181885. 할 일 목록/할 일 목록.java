class Solution {
    public String[] solution(String[] todo_list, boolean[] finished) {
        int count=0;
        for(boolean a:finished){
            if(a) count++;
        }
        
        
        String[] answer = new String[todo_list.length-count];
        int idx=0;
        for(int i=0;i<finished.length;i++){
            if(finished[i]) continue;
            answer[idx++] = todo_list[i];

        }
        return answer;
    }
}