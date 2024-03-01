class Solution {
    public String[] solution(String my_string) {
        String[] sp = my_string.split(" ");
        int count=0;
        for(String a:sp){
            if(a.equals("")) count++;
        }
        String[] answer = new String[sp.length-count];
        int idx=0;
        for(String b:sp){
            if(b.equals("")) continue;
            answer[idx++]=b;
        }
        
        return answer;
    }
}