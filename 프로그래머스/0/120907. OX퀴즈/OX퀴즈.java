class Solution {
    public String[] solution(String[] quiz) {
        String[] answer = new String[quiz.length];
        
        int idx=0;
        for(String a:quiz){
            String[] sp =a.split(" ");
            int first =Integer.parseInt(sp[0]);
            int second = Integer.parseInt(sp[2]);
            int third = Integer.parseInt(sp[4]);
            int result=sp[1].equals("+")?first+second:first-second;
            String last =(result==third)?"O":"X";
            answer[idx++]=last;
        }
        
        
        return answer;
    }
}