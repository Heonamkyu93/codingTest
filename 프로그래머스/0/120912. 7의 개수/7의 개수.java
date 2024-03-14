class Solution {
    public int solution(int[] array) {
        int answer = 0;
        for(int a:array){
            String[] b=String.valueOf(a).split("");
            for(String c:b){
                if(c.equals("7")) answer++;
            }
        }
        
        
        
        return answer;
    }
}