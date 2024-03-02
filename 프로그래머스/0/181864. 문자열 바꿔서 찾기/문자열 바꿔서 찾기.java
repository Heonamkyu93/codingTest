class Solution {
    public int solution(String myString, String pat) {
       String[] a = myString.split("");
        String c="";
        for(String b:a){
            if(b.equals("A")) {c+="B";
                              continue;
                              } 
            c+="A";
        }
        int answer=c.contains(pat)?1:0;
        
        return answer;
    }
}