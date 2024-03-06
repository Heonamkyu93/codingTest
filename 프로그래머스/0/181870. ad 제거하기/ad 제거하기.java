class Solution {
    public String[] solution(String[] strArr) {
        
        int count =0;
        for(int i=0;i<strArr.length;i++){
            if(strArr[i].indexOf("ad")>-1) continue;
            count++;
            
        }
        String[] answer = new String[count];
        int idx=0;
         for(int i=0;i<strArr.length;i++){
            if(strArr[i].indexOf("ad")>-1) continue;
            answer[idx++]=strArr[i];
            
        }
        
        return answer;
    }
}