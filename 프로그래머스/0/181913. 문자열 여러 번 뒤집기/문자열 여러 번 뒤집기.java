class Solution {
    public String solution(String my_string, int[][] queries) {
        StringBuilder answerBuilder = new StringBuilder(my_string);
        for(int i = 0; i < queries.length; i++) {
            int start = queries[i][0];
            int end = queries[i][1];
            
          
            while(start < end) {
                char temp = answerBuilder.charAt(start);
                answerBuilder.setCharAt(start, answerBuilder.charAt(end));
                answerBuilder.setCharAt(end, temp);
                start++;
                end--;
            }
        }
        return answerBuilder.toString();
    }
}
