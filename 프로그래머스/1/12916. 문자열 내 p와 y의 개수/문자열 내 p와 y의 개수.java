class Solution {
    boolean solution(String s) {
        String m=s.toLowerCase();
        char[] a=m.toCharArray();
        
        boolean answer = true;
  int p=0;
            int y=0;
        for(char k:a){
           
          
            if(k=='p') p+=1;
            if(k=='y') y+=1;
            
            answer=(p==y)?true:false;
        }
       
        return answer;
    }
}