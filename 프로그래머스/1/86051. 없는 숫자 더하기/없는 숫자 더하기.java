class Solution {
    public int solution(int[] numbers) {
        int answer = 0;
        double full = (9.0/2) *(1+9);
        for(int i=0;i<numbers.length;i++){
            answer+=numbers[i];
        }
        answer=(int)full-answer;
        return answer;
    }
}